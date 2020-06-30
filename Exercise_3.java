// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :None


// Your code here along with comments explaining your approach

// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            //Write your code here 
            data = d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node temp = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null){
            list.head = temp;
        // Else traverse till the last node 
            // and insert the new_node there 
        }else{
            Node current = list.head;
            while(current.next != null){
                current = current.next;
            }
             // Insert the new_node at last node 
            current.next = temp;
        }  
        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node current = list.head;
        while(current !=null){
            // Print the data at current node 
            System.out.print(current.data +" ");
            // Go to next node 
            current = current.next;
        }
        System.out.println();
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}