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

def trap2(height):
    l,r = 0,len(height)-1
    max_l = 0
    max_r = 0
    water = 0
    c = l
    while l < r:
        print(height[c])
        area = min(max_l, max_r)
        water += area - height[c] if area-height[c] > 0 else 0

        if height[l] > max_l:
            max_l = height[l]
        if height[r] > max_r:
            max_r = height[r]

        if height[l] > height[r]:
            r-=1
            c = r
        else:
            l+=1
            c = l

    return water





height = [0,1,0,2,1,0,1,3,2,1,2,1]
print(trap2(height))