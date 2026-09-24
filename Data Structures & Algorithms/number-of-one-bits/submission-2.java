class Solution {
    public int hammingWeight(int n) {
        int cnt = 0;
        //System.out.println(Integer.MAX_VALUE);
        while (n > 0) {
             cnt += n%2;
            n /= 2;
        }
        return cnt;
    }
}
