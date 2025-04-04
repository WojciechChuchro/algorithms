import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int curr = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[curr] != nums[i]) {
                curr++;
                k++;
                nums[curr] = nums[i];
            }

        }
        System.out.println(Arrays.toString(nums));

        return k;
    }
}
