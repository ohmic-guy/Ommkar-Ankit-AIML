import pandas as pd
import numpy as np

df = pd.read_csv("grades.csv")

students_a = df[np.array(df["Grade"] == "A")]["Name"].tolist()
students_b = df[np.array(df["Grade"] == "B")]["Name"].tolist()
students_c = df[np.array(df["Grade"] == "C")]["Name"].tolist()

# print(students_a)
print(students_b)
# print(students_c)