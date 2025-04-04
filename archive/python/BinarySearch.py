def search(nums, target):
    l,r = 0, len(nums)-1

    while l <= r:
        m = l + ((r - l) // 2)

        if nums[m] < target:
            l = m + 1
        elif nums[m] > target:
            r = m - 1
        else:
            return m


    return -1

nums = [2,5]
target = 2
print(search(nums, target))