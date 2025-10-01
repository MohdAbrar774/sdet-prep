import java.util.*;
public class LongestSubStringWithoutRepeatingCharacters{

    class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int i = 0;
        int maxlen  = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int j = 0; j<s.length(); j++){
             char c = s.charAt(j);
            if(map.containsKey(s.charAt(j))){
                i = Math.max(i,map.get(c)+1);
            }
             map.put(c,j);
             maxlen = Math.max(maxlen,j-i+1);
        }
        return maxlen;
    }
}

}