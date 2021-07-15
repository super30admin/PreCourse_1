class myStack:
     def __init__(self):
          self.items = []
         
     def isEmpty(self):
          return self.items==[]
         
     def push(self, item):
          self.items.append(item)
         
     def pop(self):
          return self.items.pop()

        
        
     def peek(self):
          if not self.isEmpty():
               return self.items[-1]
          
        
     def size(self):
          return len(self.items)
         
     def show(self):
          return self.items
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
