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

// Time Complexity : O(N)
// Space Complexity : O(log N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    TreeNode prev;
    public boolean isValidBST(TreeNode root) {
       return inorder(root);
    }
    public boolean inorder(TreeNode root){
        // base case
        if(root==null){
            return true;
        }
        // logic 
        if(!inorder(root.left)) return false;
        if(prev!=null && prev.val>=root.val){
            return false;
        }
        prev=root;
        
        return inorder(root.right);
        //
        
    }
   
}
