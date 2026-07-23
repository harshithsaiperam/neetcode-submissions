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
    public TreeNode invertTree(TreeNode root) {
        preorder(root);
        return root;
    }

    private void preorder(TreeNode root) {
        if (root == null) return;

        TreeNode node = new TreeNode();

        node = root.left;
        root.left = root.right;
        root.right = node;

        preorder(root.left);
        preorder(root.right); 
    }
}
