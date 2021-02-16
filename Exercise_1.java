class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
    	return(top < 0);
    } 

    Stack() 
    { 
        //Initialize your constructor 
    	top=-1;
    } 
  
    boolean push(int x) 
    { 
    	 if (top >= (MAX - 1)) {
             System.out.println("Stack Overflow");
             return false;
    	 }
    	 else
    	 {
    		top++; 
    		 a[top]=x;
    		 System.out.println("Pushed "+a[top]);
    		 return true;
    	 }
    } 
    	 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
    	if (top <0)
    	{
    		System.out.println("Stack Underflow");
    		return 0;
    		
    	}
    	else
    	{
    		int x=a[top];
    		top--;
    		return x;
    		
    	}
        //Write your code here
    } 
  
    int peek() 
    { 
    	if (top <0)
    	{
    		return 0;
    		
    	}
    	else
    	{
        //Write your code here
    	int x=a[top];
    	return x;
    } 
} 
}
  
// Driver code 
 public class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}

