import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

/**
    94. Binary Tree Inorder Traversal
    Given the root of a binary tree, return the inorder traversal of its nodes' values.

 

Example 1:


Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
 
 */
public class BinaryTreeInorderTraversal {

    static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val){this.val = val;}
        
    }
    ArrayList <Integer> list = new ArrayList<>();


    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return list;
      
    }

    public static void main(String[] args) {
        
    }
}