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
        
def reverse_Arry(arr):
    for left in range(len(arr) // 2):
        right = len(arr)-1-left
        arr[left],arr[right] = arr[right],arr[left]

def pairs_in_array(arr):
    length = len(arr)
    for i in range(length-1):
        for j in range(i+1,length):
            print('(',arr[i],',',arr[j],')')
        print('\n')

def sub_array(arr):
    length = len(arr)
    for i in range(length):
        for j in range(i+1,length):
            print(arr[i:j])

def max_sub_array(arr):
    cs = ms = 0

    for el in arr:
        cs = max(cs + el, 0)
        ms = max(ms,cs)

    print(f"max : {ms}")

def trapped_water(height):
    l = len(height)
    ml = []
    mr = []
    ml.append(height[0])
    mr.append(height[l-1])
    for i in range(1,l):
        ml.append(max(ml[i-1],height[i]))
        mr.append( max(mr[i-1], height[l -1 -i]))

    mr.reverse()
    sum = 0

    for h,l,r in zip(height,ml,mr):
        wt = min(l,r) - h
        sum = sum + wt

    print(f"Total water trapped: {sum}")


def bubble_sort(arr):
    l = len(arr)
    for i in range(l - 1):
        for j in range(l - 1 -i):
            if arr[j] > arr[j+1]:
                temp = arr[j] 
                arr[j] = arr[j+1]
                arr[j+1] = temp


arr_list = [9,8,6,7,5]

bubble_sort(arr_list)

print(arr_list)
