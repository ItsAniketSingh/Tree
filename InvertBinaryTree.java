/*
    226. Invert Binary Tree
    Given the root of a binary tree, invert the tree, and return its root.

 

Example 1:
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]

Example 2:
Input: root = [2,1,3]
Output: [2,3,1]

Example 3:
Input: root = []
Output: []
 */

public class InvertBinaryTree {


    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        //swap
        root.right = left;
        root.left = right;

        return root;
    }
    public static void main(String[] args) {
        
    }
    
}
