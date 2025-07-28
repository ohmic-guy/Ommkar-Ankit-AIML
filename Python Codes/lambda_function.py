print((lambda x: x**2)(6))

lambda_cube= (lambda y: y*y*y)
print(lambda_cube(5))

list1= [1,2,3,4,5,6,7,8,9]
filter(lambda x: x%2==0,list1)
print(list(filter(lambda x: x%2==0,list1)))

list2= [2,3,4,5,6,7,8]
print(list(map(lambda x: pow(x,2), list2)))