class myStack:
     def __init__(self):
         self.stack = []

     def isEmpty(self):
          return self.stack == []
         
     def push(self, item):
          self.stack.append(item)
         
     def pop(self):
          return self.stack.pop() if len(self.stack) != 0 else None
        
     def peek(self):
          return self.stack[-1] if len(self.stack) != 0 else None
        
     def size(self):
          return len(self.stack)
         
     def show(self):
          return self.stack
         

s = myStack()
print(s.peek())
s.push('1')
s.push('2')
print(s.peek())
print(s.pop())
print(s.show())
