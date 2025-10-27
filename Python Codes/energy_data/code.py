# ---------------------------------------------------------
# Experiment 7: Energy, GDP, and ScimEn Dataset Integration
# ---------------------------------------------------------
import pandas as pd
import numpy as np
import re
import os

# --------------------------
# 1️ Load and Clean Energy Data
# --------------------------

energy = pd.read_excel(
    "Energy Indicators(1).xls",
    skiprows=17,
    nrows=210,
    engine= 'xlrd'
)

# Drop unnecessary columns
energy.drop(energy.columns[[0, 1]], axis=1, inplace=True)

# Rename columns
energy.columns = ['Country', 'Energy Supply', 'Energy Supply per Capita', '% Renewable']

# Replace missing values
energy = energy.replace('...', np.nan)

# Convert Energy Supply from Petajoules → Gigajoules
energy['Energy Supply'] = energy['Energy Supply'].astype(float) * 1_000_000

# Clean country names (remove digits and parentheses)
energy['Country'] = (
    energy['Country']
    .astype(str)
    .str.replace(r'\d+', '', regex=True)
    .str.replace(r'\s*\(.*\)\s*', '', regex=True)
    .str.strip()
)

# Rename specific countries
rename_dict = {
    "Republic of Korea": "South Korea",
    "United States of America": "United States",
    "United Kingdom of Great Britain and Northern Ireland": "United Kingdom",
    "China, Hong Kong Special Administrative Region": "Hong Kong"
}
energy = energy.replace({"Country": rename_dict})

# --------------------------
# 2️ Load and Clean GDP Data
# --------------------------

gdp = pd.read_csv("world_bank(1).csv", skiprows=4)

# Clean country names
gdp.replace({
    "Korea, Rep.": "South Korea",
    "Iran, Islamic Rep.": "Iran",
    "Hong Kong SAR, China": "Hong Kong"
}, inplace=True)

# Rename column
gdp.rename(columns={'Country Name': 'Country'}, inplace=True)

# Keep only GDP data from 2006–2015
gdp_years = ['Country'] + [str(y) for y in range(2006, 2016)]
gdp = gdp[gdp_years]

# --------------------------
# 3️ Load ScimEn Data
# --------------------------

scimen_file = "scimagojr-3(1).xlsx"
scimen_engine = "openpyxl" if scimen_file.endswith(".xlsx") else "xlrd"
scimen = pd.read_excel(scimen_file, engine=scimen_engine)

# --------------------------
# 4️ Merge the Three Datasets
# --------------------------

merged = pd.merge(scimen, energy, on='Country', how='inner')
merged = pd.merge(merged, gdp, on='Country', how='inner')

# Keep only top 15 countries by Rank
merged = merged[merged['Rank'] <= 15].copy()

# Set Country as index and sort by Rank
merged.set_index('Country', inplace=True)
merged.sort_values('Rank', inplace=True)

# Select required columns
cols = [
    'Rank', 'Documents', 'Citable documents', 'Citations', 'Self-citations',
    'Citations per document', 'H index', 'Energy Supply',
    'Energy Supply per Capita', '% Renewable'
] + [str(y) for y in range(2006, 2016)]

final_df = merged.loc[:, cols]

# --------------------------
# 5️ Display / Export
# --------------------------

print(" Final DataFrame shape:", final_df.shape)
print("\n Top 5 rows:\n")
print(final_df.head())

# Export to Excel
output_file = "Merged_Top15_Data.xlsx"
final_df.to_excel(output_file, engine='openpyxl', index=True)
print(f"\n Saved as '{output_file}'")
