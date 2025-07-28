import pandas as pd

df= pd.DataFrame({"Name": ["Ommkar","Ankit", "XYZ", "XNXX", "PRATIK"], "Score":[32,45,65,69,99]})
print(df)

df["LowerCase"] = df["Name"].apply(lambda x: x.lower())
print(df)