public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
        	this.data=data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty.
    	if(root==null)
    	{
    		return true;
    	
    } 
    	else
    	{
    		return false;
    	}
    }
  
    public void push(int data) 
    { 
        //Write code to push data to the stack.
    	StackNode newNode=new StackNode(data);
    	StackNode temp=root;
    	root=newNode;
    	newNode.next=temp;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
    	if(root==null)
    	{
    		System.out.println("Stack Underflow");
    		return 0;
    	}
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    	else
    	{
    		int x=root.data;
    		root=root.next;
    		return x;
    	}
    	
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
    	
    	if(root==null)
    	{
    		System.out.println("Stack Underflow");
    		return 0;
    	}
    	else
    	{
    		int x=root.data;
    		//root=root.next;
    		return x;
    	}
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
