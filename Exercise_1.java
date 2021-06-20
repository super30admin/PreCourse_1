class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top < 0){
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = 0; //top will start as 0 and as we push, it'll increase
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top >= MAX){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            a[top++] = x;
            System.out.println(x + " has been pushed into the stack.");
            return true;
        }
        
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()) {
            System.out.println("Stack Overflow");
            return 0;
        }
        else{
            return a[top--]; 
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
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
