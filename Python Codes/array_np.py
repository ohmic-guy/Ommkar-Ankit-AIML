import numpy as np

arr1 = np.array([1, 2, 3, 4, 5])
print("1D Array:", arr1)

arr2 = np.array([[1, 2, 3], [4, 5, 6]])
print("2D Array:\n", arr2)

zeros = np.zeros((2, 3))
print("Zeros Array:\n", zeros)

ones = np.ones((3, 2))
print("Ones Array:\n", ones)

range_arr = np.arange(0, 10, 2)
print("Range Array:", range_arr)

rand_arr = np.random.rand(2, 3)
print("Random Array:\n", rand_arr)

reshaped = arr1.reshape((5, 1))
print("Reshaped Array:\n", reshaped)

sum_arr = arr1 + 10
print("Add 10 to each element:", sum_arr)

mult_arr = arr1 * 2
print("Multiply each element by 2:", mult_arr)


slice_arr = arr1[1:4]
print("Sliced Array:", slice_arr)


print("Mean:", arr1.mean())
print("Max:", arr1.max())
print("Min:", arr1.min())