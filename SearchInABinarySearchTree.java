/*
    700
    You are given the root of a binary search tree (BST) and an integer val.

    Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.

 

Example 1:


Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]
Example 2:


Input: root = [4,2,7,1,3], val = 5
Output: []


*/

public class SearchInABinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left; 
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode search(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val > val) {
            return search(root.left, val);
        } else if (root.val == val) {
            return root;
        } else if (root.val < val) {
            return search(root.right, val);
        }

        return null;
    }

    public static void main(String[] args) {

    }
}
