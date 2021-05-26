package PreCourses1;

class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        //Write your code here
        if(top < 0) {
            return false;
        }
        return true;
    }

    Stack()
    {
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x)
    {
        //Check for stack Overflow
        //Write your code here
        if(top >= MAX) {
            System.out.println("Stack Overflow.");
            return false;
        }
        top++;
        a[top] = x;

        return true;
    }

    int pop()
    {
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        int result = 0;
        if(top < 0) {
            System.out.println("Stack Underflow");
        } else {
            result = a[top];
            top--;
        }
        return result;
    }

    int peek()
    {
        //Write your code here
        int result = 0;
        if(top < 0) {
            System.out.println("No element in the Stack.");
        } else {
            result = a[top];
        }
        return result;
    }
}

public class StackAsArray {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
