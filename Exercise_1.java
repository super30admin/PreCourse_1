class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty()
    {
        //Write your code here
        return top < 0;
    }

    Stack()
    {
        //Initialize your constructor
        top = -1;

    }

    boolean push(int x)
    {
        //Check for stack Overflow - when the amount of call stack memory allocated by JVM is exceeded.
        if (top >= (MAX - 1)) {
            return false;
        } else {
            //top++ will throw ArrayIndexOutOfBoundsException
            a[++top] = x;
            return true;

        }
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            // LIFO
            int x = a[top--];
            return x;
        }
    }

    int peek()
    {
        //Write your code here
        // retrieve or fetch the first element of the Stack or the element present at the top of the Stack
        if(top < 0){
            return 0;
        }else{
            int x = a[top];
            return x;
        }
    }
}

// Driver code
class Main {
    public static void main(String args[])
    {
        Stack s = new Stack();
        System.out.println( "isEmpty:"+ s.isEmpty() );
        s.push(10);
        System.out.println( "isEmpty:"+ s.isEmpty() );
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " peek");
    }
}
