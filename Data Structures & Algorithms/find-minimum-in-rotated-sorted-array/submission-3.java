class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int min = Math.min(nums[l],nums[r]);
        //System.out.println(min);
        while (l <= r) {
            int m = (l + r) / 2;

            if (nums[m] >= nums[r]) {
                l = m + 1;

            }
            else if (nums[m] <= nums[l]) {
                r = m - 1;
            }
            min = Math.min(min, nums[m]);
            //System.out.println(min);
        }
        return min;
    }
    // [4, ?, ?]
}
