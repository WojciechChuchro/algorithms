def max_area(heights):
    l,r = 0, len(heights) - 1
    res = 0
    while l < r:
        water = (r - l) * min(heights[l], heights[r])
        if water > res:
            res = water
        if heights[l] > heights[r]:
            r -= 1
        else:
            l += 1
    return res

height = [1, 7, 2, 5, 4, 7, 3, 6]
print(max_area(height))
