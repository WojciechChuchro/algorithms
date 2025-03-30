package Java.LeetCode;

import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
      int majority = nums.length / 2;
      Map<Integer, Integer> map = new HashMap<>();

      for(int el: nums) {
        map.merge(el, 1, Integer::sum);
        
        if(map.get(el) > majority) {
          return el;
        }
      }
      System.out.println(map);

        
      return majority;
    }
}
