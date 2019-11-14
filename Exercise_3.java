//Java program to implement 
//a Singly Linked List 
public class Exercise_3 { 

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
    	 this.data = d;
    	 this.next = null;
     } 
 } 

 // Method to insert a new node 
 public static Exercise_3 insert(Exercise_3 list, int data) 
 { 
     // Create a new node with given data 

     // If the Linked List is empty, 
     // then make the new node as head 
     
         // Else traverse till the last node 
         // and insert the new_node there 

         // Insert the new_node at last node 
     // Return the list by head 
	 Node newNode = new Node(data);
	 Node tail = list.head;
	 if(tail != null ) {
		 while(tail.next!=null) {
			 tail = tail.next;
			 
		 }
		 tail.next = newNode;
		 
	 }else {
		 list.head = newNode;
	 }
	 
	 return list;	 
     
 } 

 // Method to print the LinkedList. 
 public static void printList(Exercise_3 list) 
 {  
     // Traverse through the LinkedList 

         // Print the data at current node 
    
         // Go to next node 
	 while(list.head != null) {
		 System.out.println(list.head.data);
		 list.head = list.head.next;
	 }
 } 

 // Driver code 
 public static void main(String[] args) 
 { 
     /* Start with the empty list. */
	 Exercise_3 list = new Exercise_3(); 

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