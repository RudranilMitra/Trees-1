// Time Complexity : O(N)
// Space Complexity : O(log N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

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
    TreeNode prev;
    boolean flag = true;
    public boolean isValidBST(TreeNode root) {
        inOrderTraversal(root);
        return flag;
    }

    public void inOrderTraversal(TreeNode root){
        if(!flag)
            return;
        if(root==null)
            return;
        inOrderTraversal(root.left);
        if(prev != null && prev.val >= root.val){
            flag = false;
        }
        prev = root;
        inOrderTraversal(root.right);
    }
}
