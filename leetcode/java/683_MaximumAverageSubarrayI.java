class Solution {
  public double findMaxAverage(int[] nums, int k) {
    int l = 0;
    double avg = -1 / 0.0;
    double sum = 0;

    for (int i = 0; i < nums.length; i++) {
      System.out.println("sum: " + sum);
      if (i < k) {
        sum += nums[i];
      } else {

        avg = Math.max(avg, sum / k);
        sum -= nums[l];
        sum += nums[i];
        l++;
      }
    }

    if (k == nums.length) {
      return sum / k;
    }
    avg = Math.max(avg, sum / k);
    System.out.println("avg: " + avg);
    return avg;

  }
}
