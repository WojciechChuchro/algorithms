package Java.LeetCode;

class Solution {
    public int findClosestNumber(int[] nums) {
        int min = 0;

        for(int i = 1; i < nums.length; i++) {
            int distance = Math.abs(nums[i]);
            int minDistance = Math.abs(nums[min]);

            if(minDistance == distance) {
                if(nums[min] < nums[i]) {
                    min = i;
                }
            } else if(minDistance > distance) {
                min = i;
            }
        }

        return nums[min];
    }
}
