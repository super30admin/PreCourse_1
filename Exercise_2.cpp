#include <bits/stdc++.h>
using namespace std;

#define MAX 1000
// A structure to represent a stack
class StackNode {
public:
    int data;
    StackNode* next;
};
StackNode* top = NULL;
int size=0;

StackNode* newNode(int data)
{
    StackNode* stackNode = new StackNode();
    stackNode->data = data;
    stackNode->next = NULL;
    return stackNode;
}

bool isEmpty(StackNode* root)
{
    if(top==NULL && size==0)
        return true;
    else
        return false;
}

void push(StackNode** root, int data)
{
    try{
        if(size==MAX){
            throw "Stack Overflow";
        }
        else{
            *root = newNode(data);
            (*root)->next=top;
            top= *root;
            size++;
            cout<<(*root)->data<<" is pushed."<<endl;
        }
    }
    catch(const char* msg){
        cerr<<msg<<endl;
    }
}

int pop(StackNode** root)
{
    try{
        if(isEmpty(*root)){
            throw "Stack Underflow";
        }
        else{
            size--;
            int temp=top->data;
            top=top->next;
            return temp;
        }
    }
    catch(const char* msg){
        cerr<<msg<<endl;
    }
}

int peek(StackNode* root)
{
    try{
        if(isEmpty(root)){
            throw "Stack Underflow";
        }
        else{
            return top->data;
        }
    }
    catch(const char* msg){
        cerr<<msg<<endl;
    }
}

int main()
{
    StackNode* root = NULL;
    push(&root, 10);
    push(&root, 20);
    push(&root, 30);
    cout << pop(&root) << " popped from stack\n";
    cout << "Top element is " << peek(root) << endl;
    return 0;
}
