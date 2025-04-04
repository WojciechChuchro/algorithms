package Java.LeetCode;

import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int n: nums) {
            pq.add(n*-1);
        }

        int res = 0;

        System.out.println(pq.peek());
        for(int i = 0; i < k; i++) {
            res = pq.poll() * -1;
        }

        return res;
    }
}
