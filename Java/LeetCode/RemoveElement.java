package Java.LeetCode;

class Solution {
    public int removeElement(int[] nums, int val) {
        int r = nums.length - 1;
        int l = 0;

        while (l <= r) {
            if(nums[r] == val) {
                r--;
                continue;
            }

            if(nums[l] == val) {
                nums[l] = nums[r];
                nums[r] = val;
                r--;
            }
            l++;
        }
        return l;
    }
}
