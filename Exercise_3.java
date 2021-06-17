// Exercise_3 : Implement Singly Linked List.
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Ran successfully in IDE
// Any problem you faced while coding this : No, I did't face any problem

import java.io.*;
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
            this.data  = d;
        } 
    } 
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null){
            list.head = new_node;
            return list;
        }
            // Else traverse till the last node 
            // and insert the new_node there 
        else{
            Node cur = list.head;
            while(cur.next!=null){
                cur = cur.next;
            }
            cur.next = new_node;
        }
        // Insert the new_node at last node 
        // Return the list by head 
        return list;
    } 
    // Method to print the LinkedList. 
    public  void printList(LinkedList list) 
    {  
        Node ptr = head;
        // Traverse through the LinkedList 
        // Print the data at current node
        // Go to next node 
        while(ptr!=null){
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
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