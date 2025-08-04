from functools import reduce
listq= [1,2,3,4,5,6,7,8,9,10]
dd= reduce(lambda x,y: x+y, listq)
print(dd)



list1= [1,3,5,7,9]
n= reduce((lambda x,y: x+y), list1)
print(n)

array1 = [1,5,7,9,11,13]
array2 = [9,11,14,16,17]
results = list(filter(lambda x: x in array1,array2))
print(f"Intersection of arrays: {results}")

result= list(map(lambda x,y: x+y, array1,array2))
print(result)