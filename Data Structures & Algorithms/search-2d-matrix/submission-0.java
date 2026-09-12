class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix[0].length * matrix.length -1;
        int mid = 0;
        //System.out.println(left + " " + right);
        int cnt = 0;
        while (left <= right) {
            cnt++;
            mid = (left + right)/2;
            int midR = (mid)/matrix[0].length;
            int midC = mid%matrix[0].length;
            //System.out.println(matrix[midR][midC] + " " + left + " " + right + " " + mid);
            if (matrix[midR][midC] == target)
                return true;
            else if (matrix[midR][midC] < target)
                left = mid + 1;
            else if (matrix[midR][midC] > target)
                right = mid - 1;
        }
        return false;
    }
}
