class Stack {
    static final int MAX = 100;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        return (top == -1 ? true : false);
    }

    Stack()
    {
        //Initialize your constructor

        this.top = -1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if(this.isFull())
        {
            System.out.print("Stack Overflow.");
            return false;
        }
        else
        {
            top++;
            a[top] = x;
            return true;
        }

    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(!this.isEmpty())
        {
            return a[top--];
        }
        else
        {
            System.out.print("Stack Underflow.");
            return -1;
        }

    }

    int peek()
    {
        //Write your code here
        if(!isEmpty())
        {
            return a[top];
        }
        else
        {
            System.out.print("Stack is Empty.");
            return -1;
        }
    }
    boolean isFull()
    {
        if(MAX - 1 == top)
        {
            return true;
        }
        else
        {
            return false;
        }
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
I am maintaining an array, where I am inserting data at the end of the array..Also performing push and pop operations.  
Additionally I am also maintaining a top varible to track the peek /last added element of the stack. 
*/


