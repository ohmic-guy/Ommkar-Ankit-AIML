import pandas as pd
import numpy as np

df = pd.read_csv("grades.csv")

students_b = df[np.array(df["Grade"] == "B")]["Name"].tolist()
print(students_b)