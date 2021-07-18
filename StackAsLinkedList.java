public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here
            this.data = data;
            next = null;
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
        StackNode newNode = new StackNode(data);
        newNode.next = null;

        if (root==null){
            root = newNode;
        } else {
            StackNode tempNode = root;
            while (tempNode.next!=null){
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element
        StackNode prevToLastNode;
        prevToLastNode = root;
        while (prevToLastNode.next.next != null){
            prevToLastNode = prevToLastNode.next;
        }
        int popValue = prevToLastNode.next.data;
        prevToLastNode.next = null;
        return popValue;
    }
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        StackNode tempNode = root;
        while (tempNode.next!=null){
            tempNode = tempNode.next;
        }

        return tempNode.data;
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
