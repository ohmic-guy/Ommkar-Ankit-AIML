import pandas as pd


pl = pd.read_csv("Pokemon.csv", encoding='latin1')

print(pl.head()) 
print(pl.tail())


print(pl.info())
print(pl.describe())


print(pl['Pokemon_Name'])
print(pl[['Pokemon_Name', 'Type 1']])
fire_pokemon = pl[pl['Type 1'] == 'Fire']
print(fire_pokemon)


sorted_by_hp = pl.sort_values('HP', ascending=False)
print(sorted_by_hp)


pl['Total Stats'] = pl['HP'] + pl['Attack'] + pl['Defense']
print(pl[['Pokemon_Name', 'Total Stats']])


avg_hp_by_type = pl.groupby('Type 1')['HP'].mean()
print(avg_hp_by_type)


pl = pl.drop(['Type 2'], axis=1)
pl = pl.dropna()


pl = pl.fillna(0)


pl = pl.rename(columns={'Type 1': 'Primary Type'})

pl = pl.reset_index(drop=True)

pl.to_csv('Pokemon_modified.csv', index=False)