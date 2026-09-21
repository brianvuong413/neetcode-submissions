class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] min = new int[cost.length + 1];

        min[0] = cost[0];
        min[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            min[i] = cost[i] + Math.min(min[i-2], min[i-1]);
        }

        return Math.min(min[cost.length-2], min[cost.length-1]);
    }
}
