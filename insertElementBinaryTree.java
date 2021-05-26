package PreCourses1;

import java.util.LinkedList;
import java.util.Queue;

public class insertElementBinaryTree {
    static class Node {
        int key;
        Node left, right;

        // constructor
        Node(int key){
            this.key = key;
            left = null;
            right = null;
        }
    }
    static Node root;
    static Node temp = root;

    static void inorder(Node temp)
    {
        if (temp == null)
            return;

        inorder(temp.left);
        System.out.print(temp.key+" ");
        inorder(temp.right);
    }

    /*function to insert element in binary tree */
    static void insert(Node temp, int key)
    {

        // Do level order traversal until we find
        // an empty place and add the node.
        if(temp == null) root = new Node(key);

        Queue<Node> queue = new LinkedList<>();

        queue.add(temp);
        while(queue != null) {
            Node tmp = queue.remove();
            if(tmp.left == null) {
                tmp.left = new Node(key);
                break;
            } else queue.add(temp.left);

            if(tmp.right == null) {
                tmp.right = new Node(key);
                break;
            } else queue.add(temp.right);
        }
    }

    public static void main(String args[])
    {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.print( "Inorder traversal before insertion:");
        inorder(root);

        int key = 12;
        insert(root, key);

        System.out.print("\nInorder traversal after insertion:");
        inorder(root);
    }
}
