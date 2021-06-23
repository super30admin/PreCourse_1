public class StackAsLinkedList {

    StackNode head;
    private  int length;

    static class StackNode
    {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
            this.next = null;

        }
    }

    public StackAsLinkedList()
    {
        this.head = null;
        this.length = 0;
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return length == 0;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode node = new StackNode(data);
        node.next = head;
        head = node; // Making New Node  as root node, here we are keeping root as pointer node.
        length++;
        System.out.println(data+ " pushed.");
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element

        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        else
        {
            int temp_data =head.data;
            head = head.next;
            length--;
            return temp_data;
        }
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        else
        {
            int temp_data =head.data;
            return temp_data;
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

        sll.push(40);
        System.out.println("Top element is " + sll.peek());

    }
}

// Time Complexity : 
//Push : O(1)
//pop: O(1)
//Peek: O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Didn't find any relevant question on Leetcode. 
// Any problem you faced while coding this : No 


// Your code here along with comments explaining your approach

/*
I am maintaining alinkedlist where I am inserting nodes at head rather than usual approach of tail-insertion. 
Additionally I am also maintaining a length variable to get the size of the stack and to find if stack is empty. 
*/

