package Java.NeetCode;

class FindDuplicates {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            int idx = Math.abs(nums[i]) - 1;
            nums[idx] *= -1;

            if(nums[idx] > 0) {
                return Math.abs(nums[i]);
            }
        }
        return 0;
    }
}