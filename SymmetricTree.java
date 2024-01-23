/*
    101. Symmetric Tree
    Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

 

Example 1:


Input: root = [1,2,2,3,4,4,3]
Output: true
Example 2:


Input: root = [1,2,2,null,3,null,3]
Output: false
 */

import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class SymmetricTree {
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 =  new ArrayList<>();
    static class TreeNode  {
        int val;
        TreeNode left;
        Tree right;
        TreeNode(int val){this.val= val;}
        
    }

    public void leftTraversal(TreeNode root){
        if(root == null){
            list1.add(-1);
            return;
        }
        list1.add(root.val);
        leftTraversal(root.left);
        leftTraversal(root.right);
    }
    public void rightTraversal(TreeNode root){
        if(root == null){
            list2.add(-1);
            return;
        }
        list2.add(root.val);
        rightTraversal(root.right);
        rightTraversal(root.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        leftTraversal(root.left);
        rightTraversal(root.right);
        if(list1.equals(list2) == true){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
    }
    
}
