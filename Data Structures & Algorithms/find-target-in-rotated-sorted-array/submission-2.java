class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        if (nums[l] == target)
            return l;
        if (nums[r] == target)
            return r;
        while (l <= r) {
            int m = (l + r)/2;

            if (nums[m] == target)
                return m;
            
            if (nums[l] <= target && target <= nums[m])
                r = m - 1;
            else
                l = m + 1;
        }
        return -1;
    }//[3,?,6,?,?,2]
}
