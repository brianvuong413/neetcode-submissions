class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int[] total = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i >= 2)
                total[i] = total[i-2];
            if (i >= 3)
                total[i] = Math.max(total[i],total[i-3]);
            System.out.println(total[i]);
            total[i] += nums[i];
        }
        return Math.max(total[total.length-1], total[total.length-2]);
    }
}
