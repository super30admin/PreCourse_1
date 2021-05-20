 class StackAsLinkedList {
  
    StackNode root; 

    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        {
            this.data=data;
            this.next=null;
            //Constructor here 
        } 
    }
    StackAsLinkedList(){
        this.root=null;
    }
	
    public boolean isEmpty() 
    {
        if(root==null){
            return true;
        }
        return false;
    } 
  
    public void push(int data) 
    {
        StackNode node=new StackNode(data);
        node.next=root;
        root=node;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        if(root==null){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int res=root.data;
            root=root.next;
            return res;
        }
    } 
  
    public int peek() 
    {
        if(root==null){
            return 0;
        }else{
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
