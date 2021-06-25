// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top < 0){
            return true;
        } 
        return false;
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
         if(top >= MAX){
            return false;
        } else {
            top++;
            a[top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top < 0 ){
            System.out.println("Stack UnderFlow");
            return 0;
        } else {
            int x = a[top];
            top--;
            return x;
        }
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        // System.out.println(s.isEmpty());
        // System.out.println(s.push(10));
        // System.out.println(s.push(20));
        // System.out.println( s.push(30));
        // System.out.println(s.pop() + " Popped from stack"); 
        // System.out.println(s.peek());
        // System.out.println(s.isEmpty());
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack");
    } 
}
