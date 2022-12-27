def rotate(arr, n):
    arr[:] = arr[-1:] + arr[:-1]
