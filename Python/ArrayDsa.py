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

def selection_sort(arr):
    l = len(arr)
    for i in range(l-1):
        swap = i
        for j in range(i+1,l):
            if(arr[swap] > arr[j]):
                swap = j
        arr[swap],arr[i] = arr[i],arr[swap]

def insertion_sort(arr):
    l = len(arr)
    for i in range(1,l):
        insert = arr[i]
        j = i-1
        while j>=0 and insert < arr[j]:
            arr[j+1] = arr[j]                            
            j = j-1
        
        arr[j+1] = insert

def spiral_matrix(arr):
    sr = sc = 0
    er = ec = len(arr) - 1

    while sr<er and sc<ec:
        # first row
        print(arr[sr][sc:ec+1])

        # last coloumn
        print(arr[sr+1:er+1][ec])

        #last row
        print(arr[er][ec-1:sc+1])

        #first column
        print(arr[er-1:sr+2][sc])

        sr = sr+1
        sc = sc+1
        er = er-1
        ec = ec-1


arr_list = [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]

#spiral_matrix(arr_list)
print(arr_list[1][-2:-2])

