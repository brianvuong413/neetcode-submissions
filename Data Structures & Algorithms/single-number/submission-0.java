class Solution {
    public int singleNumber(int[] nums) {

        int bitmask = 0;
        for (int i = 0; i < nums.length; i++) {
            bitmask ^= nums[i];
        }
        return bitmask;
    }
}
