class Solution {
    public boolean canJump(int[] nums) {
        int cnt = nums[0];
        for (int i = 1; i<nums.length;i++) {
            cnt--;
            if (cnt < 0)
                return false;
            if (cnt <nums[i])
                cnt = nums[i];
            
        }
        if (cnt>=0)return true; else return false;
    }
}
