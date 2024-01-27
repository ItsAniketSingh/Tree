/*
    144
    Given the root of a binary tree, return the preorder traversal of its nodes' values.

 

Example 1:


Input: root = [1,null,2,3]
Output: [1,2,3]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
 
*/

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    class Solution {
        ArrayList<Integer> list = new ArrayList<Integer>();

        public void inOrder(TreeNode root) {
            if (root == null) {
                return;
            }
            list.add(root.val);
            inOrder(root.left);
            inOrder(root.right);
        }

        public List<Integer> preorderTraversal(TreeNode root) {

            inOrder(root);
            return list;

        }
    }

    public static void main(String[] args) {

    }

}
