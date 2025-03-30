//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//
//Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
//Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
//The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//
//I can be placed before V (5) and X (10) to make 4 and 9.
//X can be placed before L (50) and C (100) to make 40 and 90.
//C can be placed before D (500) and M (1000) to make 400 and 900.
//Given a roman numeral, convert it to an integer.
//
//Example 1:
//
//Input: s = "III"
//Output: 3
//Explanation: III = 3.
//Example 2:
//
//Input: s = "LVIII"
//Output: 58
//Explanation: L = 50, V= 5, III = 3.
//Example 3:
//
//Input: s = "MCMXCIV"
//Output: 1994
//Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

package Java.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanNumbersMap = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        Map<String, Integer> romanCombosMap = new HashMap<>() {{
            put("IV", 4);
            put("IX", 9);
            put("XL", 40);
            put("XC", 90);
            put("CD", 400);
            put("CM", 900);
        }};

        int result = 0;

        for (Map.Entry<String, Integer> entry : romanCombosMap.entrySet()) {
            if (s.contains(entry.getKey())) {
                result += entry.getValue();
                s = s.replaceFirst(entry.getKey(), "");
            }
        }

        for (int i = 0; i < s.length(); i++) {

            result += romanNumbersMap.get(s.charAt(i));
        }

        return result;
    }
        public int romanToIntMyOwn(String s) {
          int result = 0;
          Map<Character, Integer> map = new HashMap<>();
          map.put('I', 1);
          map.put('V', 5);
          map.put('X', 10);
          map.put('L', 50);
          map.put('C', 100);
          map.put('D', 500);
          map.put('M', 1000);
    
          for(int i = s.length()-1; i >= 0;i--) {
            char c = s.charAt(i);
            if(c == 'X' || c == 'V') {
                if(i > 0 && s.charAt(i-1) == 'I') {
                  result -= map.get(s.charAt(i-1));
                i--;
              }
            }
    
            if(c == 'L' || c == 'C') {
              if(i > 0 && s.charAt(i-1) == 'X') {
                result -= map.get(s.charAt(i-1));
                i--;
              }
            }
            if(c == 'D' || c == 'M') {
              if(i > 0 && s.charAt(i-1) == 'C') {
                result -= map.get(s.charAt(i-1));
                i--;
              }
            }
    
            result += map.get(c);
           } 
           return result;
    }
}
