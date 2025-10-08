public class MaximumSubArray {
    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int countSum = 0;

        for (int i = 0; i < nums.length; i++) {

            maxSum = Math.max(maxSum, countSum + nums[i]);
            countSum = countSum + nums[i] < 0 ? 0 : countSum + nums[i];

        }

        return maxSum;
    }
}
