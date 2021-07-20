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

        // Do level order traversal until we find 
        // an empty place and add the node.
        Queue<Node> queue= new LinkedList<>();
    	 Node newNode=new Node(key);
    	 Node insertionNode=temp;
    	 queue.add(insertionNode);
    	 while(queue.size()>0) {
    		 insertionNode=queue.remove();
    		 if(insertionNode.left!=null)
        		 queue.add(insertionNode.left);
        	 if(insertionNode.right!=null)
        		 queue.add(insertionNode.right);
        	 if(insertionNode.left==null) {
        		 insertionNode.left=newNode;
        		 break;
        	 }
        	 if(insertionNode.right==null) {
        		 insertionNode.right=newNode; 
        		 break;
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