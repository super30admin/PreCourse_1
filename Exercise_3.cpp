#include <bits/stdc++.h>
using namespace std;

// A linked list node (changes)
class Node
{
    public:
    int data;
    Node *next;
};
Node* head=NULL;
/* Given a reference (pointer to pointer)
to the head of a list and an int, inserts
a new node on the front of the list. */
void push(Node** head_ref, int new_data)
{
    *head_ref = new Node();
    (*head_ref)->data = new_data;

    (*head_ref)->next = NULL;
    if(head == NULL){
        head = *head_ref;
    }
    else{
       (*head_ref)->next = head;
       head = *head_ref;
    }
}

/* Given a node prev_node, insert a new node after the given
prev_node */
void insertAfter(Node* prev_node, int new_data)
{
    prev_node = head->next;
    if(prev_node == NULL){
        printf("Error: Invalid node pointer.");
    }
    else{
        Node *new_node = new Node();
        new_node->data = new_data;
        new_node->next = (head->next)->next;
        (head->next)->next = new_node;
    }
}

/* Given a reference (pointer to pointer) to the head
of a list and an int, appends a new node at the end */
void append(Node** head_ref, int new_data)
{
    *head_ref = new Node();
    (*head_ref)->data = new_data;
    (*head_ref)->next = NULL;
    if(head == NULL){
        head = *head_ref;
    }
    else{
        Node* curr = head;
        while(curr->next != NULL){
            curr = curr->next;
        }
        curr->next = *head_ref;
    }
}

// This function prints contents of
// linked list starting from head
void printList(Node *node)
{
    node = head;
    while (node != NULL) {
        cout<<node->data<<" ";
        node = node->next;
    }
    cout<<endl;
}

/* Driver code*/
int main()
{
    Node* head = NULL;
    append(&head, 6);
    push(&head, 7);
    push(&head, 1);
    append(&head, 4);
    insertAfter(head->next, 8);
    cout<<"Created Linked list is: ";
    printList(head);
    return 0;
}
