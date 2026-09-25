class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int total = 0;
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
            total += piles[i];
        }

        if (h == piles.length)
            return max;
        if (total % h > 0)
            return (total/h) + 1;
        else return total/h;
    }
}
