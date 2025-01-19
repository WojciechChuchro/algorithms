def searchMatrix(matrix, target):
    l, r = 0, len(matrix) -1
    while l <= r:
        m = l + ((r - l) // 2)
        for j in matrix[m]:
            if j == target:
                return True
        if matrix[m][0] > target:
            r = m - 1
        elif matrix[m][0] < target:
            l = m + 1

    return False


matrix=[[1,3,5,7],[10,11,16,20],[23,30,34,60]]
target=13

print(searchMatrix(matrix, target))
