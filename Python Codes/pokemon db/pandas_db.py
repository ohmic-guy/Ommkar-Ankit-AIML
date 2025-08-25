import pandas as pd

pl = pd.read_csv("Pokemon.csv", encoding='latin1')
print("Available columns:")
print(list(pl.columns))

col = input("Enter the column name to sort by: ")
if col in pl.columns:
	order = input("Sort ascending? (y/n): ").strip().lower()
	ascending = True if order == 'y' else False
	sorted_pl = pl.sort_values(by=col, ascending=ascending)
	print(sorted_pl)
else:
	print(f"Column '{col}' not found. Please check the column name and try again.")