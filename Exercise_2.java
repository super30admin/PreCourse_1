public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
	return root == null;
    } 
  
    public void push(int data) 
    { 
	StackNode newNode = new StackNode(data);
	 if (root == null) {
            root = newNode;
         }else {
            StackNode tempNode = root;
            root = newNode;
            newNode.next = tempNode;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
	if(root == null){
	    System.out.println("Stack Underflow")'
	    return 0;	
	}
	 int x = root.val;
	 root = root.next;
	 return x;
    } 
  
    public int peek() 
    { 
        if (root == null) {
            return -1;
		
        return root.data;
    } 
  
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
