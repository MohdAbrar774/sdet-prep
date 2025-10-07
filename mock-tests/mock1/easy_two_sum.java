import java.util.HashMap;

public class easy_two_sum {

     public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int val = target - curr;
            if (map.containsKey(val)) {
                ans[0] = map.get(val);
                ans[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}