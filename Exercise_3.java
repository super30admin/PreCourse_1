
import java.io.*;

// Java program to implement
// a Singly Linked List
public class LinkedList {

    Node head, tail; // head of list
    int length ;

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
            this.data = d;
            this.next = null;
        }
    }

    public LinkedList()
    {
        this.head = null;
        this.tail = null;
        this.length= 0;
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        // If the Linked List is empty,
        // then make the new node as head
        // Else traverse till the last node
        // and insert the new_node there
        // Insert the new_node at last node
        // Return the list by head

        Node temp_node = new Node(data);
        if(list.head == null)
        {
            list.head = temp_node;
            list.tail = temp_node;
            list.length++;
        }
        else
        {
            list.tail.next = temp_node;
            list.tail = temp_node;
            list.length++;
        }
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
//         Traverse through the LinkedList
//         Print the data at current node
//         Go to next node
        Node current_node = list.head;
        while (list.length  > 0)
        {
            System.out.println(" "+current_node.data);
            current_node = current_node.next;
            list.length--;
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

// Time Complexity : 
//Insert : O(1)
//Remove: O(n)
//Print: O(n)
// Space Complexity :
// Did this code successfully run on Leetcode : Didn't find any relevant question on Leetcode. 
// Any problem you faced while coding this : Pointing to and from the head and other nodes. 


// Your code here along with comments explaining your approach

/*
I am maintaining a Head and a Tail and continuously updating Tail after every insertion 
I am also maintaining a Length variable to get the length of Linkedlist. 
and Based on length, I am traversing into the lIkedlist and printing the Respective Node data. 
*/

//Reference: https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/