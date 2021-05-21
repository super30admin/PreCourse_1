/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
import java.util.LinkedList; 
import java.util.Queue; 

class GFG { 
       
    /* A binary tree node has key, pointer to  
    left child and a pointer to right child */
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
      
    /* Inorder traversal of a binary tree*/
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
        //if the tree is empty, make the new node as root node to start with
        if (temp == null) {
            root = new Node(key);
        } else {
        // Do level order traversal until we find 
        // an empty place and add the node.  
        Queue<Node> q = new LinkedList<>();
        q.add(temp); //added to queue

        while (!q.isEmpty()) {
            temp = q.poll(); // get the top element from queue and remove it
            
            //visit the node check left for empty 
            if(temp.left == null) {
                temp.left = new Node(key);
                //break so that it doesnt add new node to last level nodes
                break;
            } else {
                q.add(temp.left);
            }

            //visit the node check right for empty 
            if (temp.right == null) {
                temp.right = new Node(key);
                //break so that it doesnt add new node to last level nodes
                break;
            } else {
                q.add(temp.right);
            }
        }
    }
} 
       
    // Driver code 
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