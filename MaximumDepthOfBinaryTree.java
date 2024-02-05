/*
    104
    Given the root of a binary tree, return its maximum depth.
    A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 3

Example 2:
Input: root = [1,null,2]
Output: 2
    
 */



public class MaximumDepthOfBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){this.val = val;}
        
    }
     public int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = depth(root.left) + 1;
        int right = depth(root.right) + 1;
        return Math.max(left,right);
    }
    public static void main(String[] args) {
        
    }
}
