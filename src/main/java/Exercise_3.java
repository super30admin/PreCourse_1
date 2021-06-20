// Java program to implement
// a Singly Linked List 
class LinkedList {

    Node head; // head of list 

    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node {

        int data;
        Node next;

        // Constructor 
        Node(int d) {
            data = d;
        }
    }

    // Method to insert a new node
    //elements are inserted to the end of the list
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data 
        Node sampleNode = new Node(data);
        sampleNode.next = null;
        // If the Linked List is empty, 
        // then make the new node as head
        if (list.head == null)
            list.head = sampleNode;
        else {
            // Else traverse till the last node 
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            // Insert the new_node at last node
            last.next = sampleNode;
        }
        // Return the list by head 
        return list;
    }

    // Method to print the LinkedList. 
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList
        Node curr = list.head;

        // Print the data at current node
        while (curr != null) {
            System.out.println("Linked List Element : " + curr.data);

            // Go to next node
            curr = curr.next;
        }
    }

    // Driver code 
    public static void main(String[] args) {
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
    //Time Complexity: O(n) as we need to traverse till the end of the list to insert a new node
    //Space Complexity: O(n)
}