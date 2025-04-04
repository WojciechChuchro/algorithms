package Java.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < nums.length; i++) {
                if(map.containsKey(nums[i])) {
                    int key = map.get(nums[i]);
                    if(Math.abs(key - i ) <= k) {
                        return true;
                    }
                }

                map.put(nums[i], i);
            }

            return false;
        }
}
