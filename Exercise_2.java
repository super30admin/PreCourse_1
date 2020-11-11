 class StackAsLinkedList { 
  
    StackNode root;
  
    static class StackNode { 
        int data; 
        StackNode next; 
        StackNode prev;
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return root == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode temp = new StackNode(data);
        if(root == null){
            root = temp;

        }else{
            root.next = temp;
            temp.prev = root;
            root = root.next;
        }

    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
      if(root == null){
          System.out.println("Stack Underflow \n");
          return 0;
      }
      int val = root.data;
      root = root.prev;
      root.next = null;
      root.prev = null; 
      return val;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        return root.data;
    } 

} 
 public class Exercise_2{
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
  }
