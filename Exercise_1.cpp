#include <bits/stdc++.h> 
  
using namespace std; 
  
#define MAX 1000 
  
class Stack { 
    int top;   
public: 
    int a[MAX]; // Maximum size of Stack 
  
    Stack(){ //Constructor here
      top = -1;
      for(int i=0;i<5;i++){
        a[i]=0;
      }
    } 
    bool isEmpty();
    bool push(int x); 
    int pop(); 
    int peek(int pos);  
}; 
  
bool Stack::isEmpty() 
{ 
  if(top==-1)
    return true;
  else
    return false; 
}

bool Stack::push(int x) 
{ 
  if(top == MAX){
    cout<<"Stack Overflow"<<endl;
  }
  else{
    top++;
    a[top]=x;
  } 
} 
  
int Stack::pop() 
{ 
  if(Stack::isEmpty()){
    cout<<"Stack Underflow"<<endl;
    return 0;
  }
  else{
    int popval=a[top];
    top--;
    return popval; 
  }
}

int Stack::peek(int pos) 
{ 
  if(Stack::isEmpty()){
    cout<<"Stack Underflow"<<endl;
    return 0;
  }
  else{
    return a[pos]; 
  }
}  
  
// Driver program to test above functions 
int main() 
{ 
    class Stack s; 
    s.push(10); 
    s.push(20); 
    s.push(30); 
    cout << s.pop() << " Popped from stack\n"; 
  
    return 0; 
} 
