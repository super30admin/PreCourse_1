// Exercise_2 : Implement Stack using Linked List.
// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Ran successfully in IDE
// Any problem you faced while coding this : Watched youtube and then 
// implemented successfully in IDE

public class StackAsLinkedList { 
  
    StackNode root; 
    //declaring node head
    StackNode head;
    
    static class StackNode { 
        int data; 
        StackNode next; 

        //declaring node head
        StackNode head;

        StackNode(int data) 
        { 
            //Constructor here 
            int d = data;
            next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return head == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode temp = new StackNode(data);
        temp.data = data;
        temp.next = head;
        head = temp;
        System.out.println("Pushed element " + temp.data);
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write code to pop the topmost element of stack.
        int returnValue = head.data;
        head = head.next;

	//Also return the popped element 
    return head.data;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
        {
            return 0;
        }
        return head.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
        sll.push(40);
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
}