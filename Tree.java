/*
    Tree
*/



public class Tree {

    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void traversal(Node head){
        if (head == null) {
            return;
        }
        System.out.print("," +head.val);
        traversal(head.left);
        traversal(head.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);
        Node e = new Node(60);
        Node f = new Node(70);
        // Node g = new Node(0);
        // Node h = new Node(0);
        

        root.right = b;
        root.left = a;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;

        traversal(root);

    }
}