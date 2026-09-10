class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int num : prices) {
            if (min < num) {
                max = Math.max(max, num - min);
            }
            else min = num;
        }
        return max;
    }
}
