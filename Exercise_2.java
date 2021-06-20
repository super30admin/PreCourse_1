class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        if(root == null){
            return true;
        }
        else{
            return false;
        }

    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode newNode = new StackNode(data);
        
        if(isEmpty()){
            root = newNode;
        }
        else{
            StackNode temp = root;
            root = newNode; //the new root is the newly pushed element
            newNode.next = temp; //the old root now shifts to second position
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        int popped = 0;
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            popped = root.data; //root is top element of linked list so we pop that
            root = root.next; //shift the new root to be the second element
            return popped;
        }
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            return root.data;
        }
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
