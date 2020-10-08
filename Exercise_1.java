class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(a.length < MAX){
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
        if(top >= MAX){
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top] = x;
        System.out.println(x + " was pushed into stack");
        return true;
       
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top < 0){
            System.out.println("The Stack Underflow");
            return 0;
        }
        int p = a[top--];
        return p;
    } 
  
    int peek() 
    { 
        //Write your code here
        if (top < 0) { 
            System.out.println("The Stack Underflow"); 
            return 0; 
        }
        int l = a[top];
        return l;
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
