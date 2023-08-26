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
    Stack<TreeNode> st = new Stack<>();
    TreeNode prev = null;
    public boolean isValidBST(TreeNode root) {
       while(root!=null || !st.isEmpty()){
           while(root!=null){
               st.push(root);
               root = root.left;
           }
           root = st.pop();
           if(prev!=null && prev.val>=root.val){
               return false;
           }
           prev = root;
           root = root.right;
       }
       return true;
    }
}
