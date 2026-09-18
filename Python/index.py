def max_subarray(arr):

    prefix = 0
    min_prefix = 0
    max_sum = arr[0]

    for num in arr:
        prefix += num

        max_sum = max(max_sum, prefix - min_prefix)

        min_prefix = min(min_prefix, prefix)

    return max_sum