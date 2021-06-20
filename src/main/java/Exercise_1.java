class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack 

    boolean isEmpty() {
        //if stack has any elements return false or else true
        if (top >= 0) {
            return false;
        } else {
            return true;
        }
    }

    Stack() {
        //Initialize your constructor
        top = -1;
    }

    boolean push(int x) {
        //push to stack if top is less then size of the stack
        if (top < MAX - 1) {
            a[++top] = x;
            System.out.println("pushed element : " + x);
            return true;
        } else {
            System.out.println("stack limit exceeded");
            return false;
        }
    }

    int pop() {
        //If empty return 0 and print " Stack Underflow"
        //pop if there is one ore more elements in the stack
        if (top > -1) {
            int pop = a[top];
            top--;
            System.out.println("popped element : " + pop);
            return pop;
        } else {
            System.out.println("Stack Underflow");
            return 0;
        }

    }

    int peek() {
        //peek if stack has any values in it
        if (top > -1) {
            System.out.println("peeked element : " + a[top]);
            return a[top];
        } else {
            System.out.println("Stack Underflow");
            return 0;
        }
    }
}


// Driver code 
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        s.peek();
    }
    //Time Complexity: O(1)
    //Space Complexity: O(n)
}
