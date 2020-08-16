public class DynamicSearch {
    /**
     * 121. 买卖股票的最佳时机
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {

        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > max_profit)
                    max_profit = profit;
            }
        }

        return max_profit;
    }

    /**
     * 53. 最大子序和
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (sum[i - 1] + nums[i] > nums[i]) {
                sum[i] = sum[i - 1] + nums[i];
            } else {
                sum[i] = nums[i];
            }
        }
        return sum[nums.length - 1];
    }

}
