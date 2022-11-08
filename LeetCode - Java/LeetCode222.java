
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
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = leftHeight(root);
        int right = rightHeight(root);
        
        if (left == right) {
            return (1 << left) - 1;
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    private int leftHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + leftHeight(root.left);
    }

    private int rightHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + rightHeight(root.right);
    }
}
