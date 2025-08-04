import re
pattern = r'^[\w\.-]+@[\w\.-]+\.\w+$'

email = input("Enter your email: ")

if re.match(pattern, email):
    print("------Valid Email------")
else:
    print("------Invalid Email------")
