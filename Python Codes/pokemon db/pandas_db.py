import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns


pl = pd.read_csv("Pokemon.csv", encoding='latin1')

if 'Type 1' in pl.columns:
	pl = pl.rename(columns={'Type 1': 'Primary_Type'})

print(pl.head())
print(pl.tail())

print(pl.info())
print(pl.describe())

print(pl['Pokemon_Name'])
print(pl[['Pokemon_Name', 'Primary_Type']])
fire_pokemon = pl[pl['Primary_Type'] == 'Fire']
print(fire_pokemon)

sorted_by_hp = pl.sort_values('Hit_Points', ascending=False)
print(sorted_by_hp)

pl['Total Stats'] = pl['Hit_Points'] + pl['Attack_Points'] + pl['Defense_Points']
print(pl[['Pokemon_Name', 'Total Stats']])

avg_hp_by_type = pl.groupby('Primary_Type')['Hit_Points'].mean()
print(avg_hp_by_type)

if 'Type 2' in pl.columns:
	pl = pl.drop(['Type 2'], axis=1)

pl = pl.dropna()
pl = pl.fillna(0)

pl = pl.reset_index(drop=True)
pl.to_csv('Pokemon_modified.csv', index=False)




plt.figure(figsize=(12,6))
sns.barplot(x=avg_hp_by_type.index, y=avg_hp_by_type.values)
plt.xticks(rotation=45)
plt.title('Average Hit Points by Primary Type')
plt.xlabel('Primary Type')
plt.ylabel('Average Hit Points')
plt.tight_layout()
plt.savefig('avg_hp_by_type.png')
plt.show()


plt.figure(figsize=(8,6))
sns.histplot(pl['Total Stats'], bins=30, kde=True)
plt.title('Distribution of Total Stats')
plt.xlabel('Total Stats')
plt.ylabel('Count')
plt.tight_layout()
plt.savefig('total_stats_hist.png')
plt.show()


plt.figure(figsize=(8,6))
sns.scatterplot(x=pl['Attack_Points'], y=pl['Defense_Points'], hue=pl['Primary_Type'], legend=False)
plt.title('Attack vs Defense by Primary Type')
plt.xlabel('Attack Points')
plt.ylabel('Defense Points')
plt.tight_layout()
plt.savefig('attack_vs_defense.png')
plt.show()