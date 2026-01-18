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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        helper(root,ans);
        return ans;
        
    }
    public void helper(TreeNode n,List<Integer> ans){
        if(n==null){
            return;
        }
        ans.add(n.val);
        helper(n.left,ans);
        helper(n.right,ans);
        return;
    }
}