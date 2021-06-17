// Exercise_1 : Implement Stack using Array.
// Time Complexity : O(n) for push operation
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Ran successfully in IDE
// Any problem you faced while coding this : No, I did't face any problem

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        return top == -1;
    } 

    boolean isFull() 
    { 
        //Write your code here 
        return top == MAX-1;
    } 

    public Stack() 
    { 
        //Initialize your constructor 
        //int size = 10;
        top=-1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if (isFull())
        {
            return false;
        }
        //Write your code here
        else {
            System.out.println("Inserting " + x);
            a[++top] = x;
            return true;
        }
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if (isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        //Write your code here
        return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty())
        {
            return 0;
        }
        return a[top];
    } 
} 
  
// Driver code 
public class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        s.push(40);
        s.push(50);
        System.out.println(s.isFull());
        
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack"); 
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack"); 
        
         System.out.println(s.isEmpty());
    } 
}