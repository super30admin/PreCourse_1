class StackAsLinkedList {

    StackNode root;
    StackNode top;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
            this.next = null;
        }
    }

    StackAsLinkedList ()
    {
        top = null;
    }

    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        if(top == null)
          return true;

        return false;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop()
    {
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element

        if(isEmpty())
        {
          System.out.println(" Stack Underflow");
          return 0;
        }

        int ret = top.data;
        StackNode temp = top.next;
        top = temp;

        return ret;

    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(isEmpty())
        {
          //System.out.println(" Stack Empty");
          return 0;
        }

        return top.data;
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
