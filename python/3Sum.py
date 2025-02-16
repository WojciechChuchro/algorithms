def threeSum(nums):
    res = []
    nums.sort()
    for i, a in enumerate(nums):
        if i > 0 and a == nums[i - 1]:
            continue
        l,r = i+1, len(nums)-1

        while l < r:
            s = a + nums[l] + nums[r]
            if s > 0:
                r -= 1
            if s < 0:
                l += 1
            if s == 0:
                res.append([a,nums[l],nums[r]])
                l += 1
                while l < r and nums[l] == nums[l-1]:
                    l += 1
    return res
nums = [-1,0,1,2,-1,-4]
print(threeSum(nums))
