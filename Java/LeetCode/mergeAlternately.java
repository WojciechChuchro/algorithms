package Java.LeetCode;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length = word1.length() < word2.length()
                ? word1.length()
                : word2.length();
        String result = "";
        for(int i = 0; i < length; i++) {
            result += word1.charAt(i);
            result += word2.charAt(i);
        }

        result += word1.length() > word2.length()
                ? word1.substring(length, word1.length()):
                word2.substring(length, word2.length());

        return result;
    }
}
