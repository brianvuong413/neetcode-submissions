class Solution {
    public int hammingWeight(int n) {
        int cnt = 0;
        //System.out.println(Integer.MAX_VALUE);
        while (n > 0) {
            if ((n & 1) == 1)
                cnt++;
            n /= 2;
        }
        return cnt;
    }
}
