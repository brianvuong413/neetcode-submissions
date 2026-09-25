class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        int left = 1;
        int right = max;
        int ans = right;
        while (left <= right) {
            int totalTime = 0;
            int mid = (left + right)/ 2;
            for (int pile : piles) {
                totalTime += (int) Math.ceil((double) pile / mid);
            }
            if (totalTime <= h) {
                right = mid - 1;
                ans = Math.min(mid,ans);
            }
            else left = mid + 1;
        }
        return ans;

    }
}
