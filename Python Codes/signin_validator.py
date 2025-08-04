import re
pattern = r'^[\w\.-]+@[\w\.-]+\.\w+$'

email = input("Enter your email: ")

if re.match(pattern, email):
    print("------Valid Email------")
else:
    print("------Invalid Email------")
    
def validate_password(password):
    if len(password) < 8:
        return "Password must be atleast 8 characters long."
    
    if not re.search(r"\d", password):
        return "Password must contain atleast one number."
    
    if not re.search(r"[a-z]", password):
        return "Password must contain atleast one lowercase letter."
    
    if not re.search(r"[A-Z]", password):
        return "Password must contain atleast one uppercase letter."
    
    if not re.search(r"[@$!%*?&]", password):
        return "Password must contain atleast one special character (@$!%*?&)."
    
    return "Password is strong.\n------Credentials accepted successfully------"

password = input("Enter password: ")
print(validate_password(password))