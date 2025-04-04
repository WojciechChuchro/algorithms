package Java.NeetCode;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int [] nums = new int []{3,4,5, 6,1,2};

        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        int res = nums[0];


        while(l<=r) {
            if (nums[l] < nums[r]) {
                res = Math.min(nums[l], res);
                break;
            }
            int m = (l+r)/2;
            res = Math.min(nums[m], res);

            if (nums[l] <= nums[m]) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return res;
    }
}
