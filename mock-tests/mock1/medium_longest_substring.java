import java.util.HashMap;

public class medium_longest_substring {
    
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();

        int i = 0, j = 0, n = s.length();
        int maxLen = 0;

        while (j < n) {

            char ch = s.charAt(j);
            if (freq.containsKey(ch)) {
                i = Math.max(i,freq.get(ch) + 1); //This update the ith iterator smartly
               freq.put(ch, j);
               
            }
            freq.put(ch, j);
            maxLen = Math.max(maxLen, j - i + 1);
            j++;

        }

        return maxLen;
    }


}
