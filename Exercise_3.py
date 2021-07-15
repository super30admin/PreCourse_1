class ListNode:
    """
    A node in a singly-linked list.
    """
    def __init__(self, data=None, next=None):
        self.data = None
        self.next = None
        
    
class SinglyLinkedList:
    def __init__(self):
        """
        Create a new singly-linked list.
        Takes O(1) time.
        """
        self.head = None

    def append(self, data):
        """
        Insert a new element at the end of the list.
        Takes O(n) time.
        """
        newnode = ListNode(data)
        if self.head == None:
            self.head = newnode
            return
            
        lastnode = self.head
        while lastnode.next:
            lastnode = lastnode.next
        lastnode.next = newnode
    def find(self, key):
        """
        Search for the first element with `data` matching
        `key`. Return the element or `None` if not found.
        Takes O(n) time.
        """
        currentnode = self.head
        while currentnode!=None:
            if currentnode.data == key:
                return True
            currentnode= currentnode.next
        return None
        """ Have to add somekind of flag/ postion to keep track not sure if it iwll work or not"""


        
    def remove(self, key):
        """
        Remove the first occurrence of `key` in the list.
        Takes O(n) time.
        """
        
        currentnode = self.head

        if (currentnode==None):
            return

        if (currentnode is not None):
            if (currentnode.data==key):
                self.head = currentnode.next
                currentnode = None
                return
        
        while (currentnode is not None):
            if currentnode.data == key:
                break

            previousnode = currentnode
            currentnode = currentnode.next
        previousnode.next = currentnode.next
        currentnode = None
        
        


