class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            data = data;
        }
    }


    public boolean isEmpty() {
        return root == null;
    }

    public void push(int data) {
        //create a new node and its pointer for every input
        StackNode node = new StackNode(0);
        node.data = data;
        node.next = root;
        root = node;
        System.out.println("pushed :  " + data);
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        if (root == null)
            System.out.println("stack underflow");
        //Write code to pop the topmost element of stack.
        //pops the root and makes the next element of the list as the root
        int pop = root.data;
        root = (root).next;
        //Also return the popped element
        return pop;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        //just returns the root's value without removing it
        if (root != null)
            return root.data;
        else return 0;
    }

    //Driver code
    public static void main(String[] args) {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
    //Time Complexity: O(1)
    //Space Complexity: O(n)
} 
