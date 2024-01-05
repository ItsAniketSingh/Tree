/*
    Binary Search Tree
    
*/



public class BinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data>val) {
            root.left = insert(root.left, val);
        }
        else if(root.data < val) {
            root.right = insert(root.right, val); 
        }
        return root;
    }

    public static void traversal(Node head){
        if (head == null) {
            return;
        }
        traversal(head.left);
        System.out.print("," +head.data);
        traversal(head.right);
    }

    public static void main(String[] args) {
        int values[] = {5,1,2,6,9,3,4,8};
        Node root = null;
        for(int i =0; i< values.length;i++){
            root = insert(root, values[i]);
        }
        traversal(root);
        
    }
}
