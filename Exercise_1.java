class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 

        return this.top == -1 ? true : false;
    } 

    Stack()
    {
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        if (top == MAX - 1) {
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if (!isEmpty()) {
            return a[top--];
        } else {
            System.out.println("Stack Underflow");
            return 0;
        }
    } 
  
    int peek() 
    { 
        return top;
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
