#Implement Stack using Linked List.
class Node:
    def __init__(self, data):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.headval=None
        
    def push(self, data):
        
        if(self.headval==None):
          self.headval=Node(data)
          
        else:
          NewNode=Node(data)
          NewNode.next=self.headval
          self.headval=NewNode

    def pop(self):
        if self.headval:
          delete=self.headval
          self.headval=self.headval.next
          delete.next=None
          return delete.data
        
a_stack = Stack()

while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
