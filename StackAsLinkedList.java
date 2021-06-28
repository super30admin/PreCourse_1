import  java.lang.*;
import java.util.*;
public class StackAsLinkedList {

    StackNode root;
    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data ;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return root==null;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode temp = new StackNode(data);
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }
        temp.data = data;
        temp.next = root;
        root = temp;

    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if (root == null) {
            System.out.print("\nStack Underflow");
            return -1;
        }

        // update the top pointer to point to the next node
        root = (root).next;
     return root.data;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if (!isEmpty()) {
            return root.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

	//Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
