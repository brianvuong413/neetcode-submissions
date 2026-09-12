/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        r(root);
        return max - 2;
    }

    public int r(TreeNode root) {
        if (root == null)
            return 0;
        
        int left = 1 + r(root.left);
        int right = 1 + r(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right);
    }
}
