'''
Implement Stack using Singly-Linked List
'''
class Node:
    def __init__(self, data = None):
       self.data = data
       self.next = None
 
class Stack:
    def __init__(self):
        self.head = Node()
        self.cur = self.head

    def push(self, data):
        top = Node(data)
        top.next = self.cur
        self.cur = top

    def pop(self):
        # Stack Underflow condition
        if self.cur == self.head:
            return
        item = self.cur.data
        self.cur = self.cur.next
        return item

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
    else:
        print('Please select a valid operation')
