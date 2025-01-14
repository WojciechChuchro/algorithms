def trap(height):
    max_left = []
    max_right = []
    res = 0
    for j in range(len(height)):
        max_left.append(max(height[0:j+1]))
        max_right.append(max(height[j:]))

    for i in range(len(height)):
        area = min(max_left[i], max_right[i])
        water = area - height[i]
        res +=  water if water > 0 else 0

    return res


height = [0, 2, 0, 3, 1, 0, 1, 3, 2, 1]
print(trap(height))