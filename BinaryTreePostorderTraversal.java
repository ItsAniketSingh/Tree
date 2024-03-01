/*
    145. Binary Tree Postorder Traversal
    Given the root of a binary tree, return the postorder traversal of its nodes' values.

 

Example 1:
Input: root = [1,null,2,3]
Output: [3,2,1]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [1]
Output: [1]
 */

import java.util.ArrayList;
import java.util.List;
// package TreeNode;



public class BinaryTreePostorderTraversal {
    ArrayList<Integer> list = new ArrayList<>();

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){this.val = val;}
    }
    
    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        list.add(root.val);

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(root);
        return list;
    }
    public static void main(String[] args) {
        
    }
    
}
