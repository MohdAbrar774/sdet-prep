import java.util.*;
public class MaxSubArraySumToK {


    public static int maxSubArrayLen(int[] nums, int k) {
        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, -1); // base case: sum 0 at index -1

        int sum = 0, maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (prefixMap.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - prefixMap.get(sum - k));
            }

            // store only first occurrence
            prefixMap.putIfAbsent(sum, i);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println("Max length of subarray = " + maxSubArrayLen(nums, k)); // Output: 4
    }


}
