class Solution {
    public int largestRectangleArea(int[] heights) {
        //sliding window
        int left = 0;
        int right = heights.size - 1;
        int max = 0;
        int curr = 0;
        while (left < max) {

            curr = Math.min(heights[left],heights[right]) * (right - left);
            max = Math.max(max, curr);
            System.out.println(curr);
            System.out.println(max);
            if (heights[left] < heights[right])
                left++;
            else right--;
        }
        return max;
    }
}
