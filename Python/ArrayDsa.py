def linear_search(search,arr):
    for i in range(len(arr)):
        if search == arr[i] :
            return i
    return -1

def largest_Number(arr):
    largest = arr[0]
    for n in arr:
        largest = max(largest, n)
    return largest


def binary_search(target,arr):
    s = 0
    e = len(arr)-1
    while(e > s):
        m = (s+e)//2
        if arr[m] == target: return m
        elif target > arr[m]: s = m + 1
        else: e = m - 1
    return -1
        

arr_list = [10, 20, 30, 40, 50, 60, 70]

index = binary_search(65,arr_list)

print(index)
