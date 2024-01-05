/*
    Search in Binary Search Tree


*/


public class SearchInBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node createNode(Node root, int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = createNode(root.left, val);
        }
        else if(root.data < val ){
            root.right = createNode(root.right, val);
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
    public static boolean search (Node head, int val){
        if (head == null) {
            return false;
        }
       

        if (head.data > val) {
            return search(head.left, val);
        }
        else if(head.data == val){
            return true;
        }
        else if (head.data < val) {
            return search(head.right, val);
        }
        return false;
    }
    public static void main(String[] args) {
        int values[] = {5,1,2,6,9,3,4,8};
        Node root = null;
        for(int i =0; i< values.length;i++){
            root = createNode(root, values[i]);
        }
        traversal(root);
        System.out.println();
        if (search(root, 0)) {
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found!!");
        }
    }
}
