package Java.NeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s1 = "zxyzxyz";
        String s2 = "xxx";
        lengthOfLongestSubstring(s1);
    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        int l = 0, res= 0;

        for (int r = 0; r < s.length(); r++) {
            char e = s.charAt(r);

            while(hashSet.contains(e)) {
                hashSet.remove(s.charAt(l));
                l++;
            }


            hashSet.add(e);
            res = Math.max(res, r - l + 1);

        }
        return res;
    }
}
