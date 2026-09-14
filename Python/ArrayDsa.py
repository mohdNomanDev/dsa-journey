def linear_search(search,arr):
    for i in range(len(arr)):
        if search == arr[i] :
            return i
    return -1

def largest_Number(arr):
    largest = arr[0]
    for n in arr:
        if n > largest:
            largest = n
    return largest

arr_list = [5, 22, 8, 20, 3, 15]

index = largest_Number(arr_list)

print(index)
