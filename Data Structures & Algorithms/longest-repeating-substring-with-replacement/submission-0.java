class Solution {
    public int characterReplacement(String s, int k) {
        int[] maxFreq = new int[26];
        int l = 0;
        int maxCount = 0;
        int maxLength = 0;
        for (int r = 0; r < s.length(); r++) {
            int c = s.charAt(r) - 'A';
            maxCount = Math.max(++maxFreq[c], maxCount);
            while ((r - l + 1) - maxCount > k) {
                maxFreq[s.charAt(l) - 'A']--;
                l++;
            }
            maxLength = Math.max(maxLength, r - l + 1);
        }
        return maxLength;
    }
}
