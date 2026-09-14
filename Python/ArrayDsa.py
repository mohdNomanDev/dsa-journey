def linear_search(search,arr):
    for i in range(len(arr)):
        if search == arr[i] :
            return i
    return -1

arr_list = [5, 12, 8, 20, 3, 15]

index = linear_search(15,arr_list)

print(index)
