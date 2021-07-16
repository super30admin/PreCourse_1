#include <iostream>
#include <queue>
using namespace std;
//new one

/* A binary tree node has key, pointer to left child
and a pointer to right child */
struct Node {
    int key;
    struct Node* left, *right;
};

/* function to create a new node of tree and r
   eturns pointer */
struct Node* newNode(int key)
{
    Node* new_node = new Node();
    new_node->key = key;
    new_node->left = new_node->right = NULL;
    return new_node;
};

/* Inorder traversal of a binary tree*/
void inorder(struct Node* temp)
{
    if (!temp)
        return;

    inorder(temp->left);
    cout << temp->key << " ";
    inorder(temp->right);
}

/*function to insert element in binary tree */
void insert(struct Node* temp, int key)
{
    if(temp == NULL){
        Node* new_node = newNode(key);
        temp = new_node;

    }
    else{
        queue<Node*> que;
        que.push(temp);

        while (!que.empty()) {
            Node* root = que.front();
            que.pop();

            if (root->left != NULL)
                que.push(root->left);
            else {
                root->left = newNode(key);
                break;
            }

            if (root->right != NULL)
                que.push(root->right);
            else {
                root->right = newNode(key);
                break;
            }
        }
    }
}

// Driver code
int main()
{
    struct Node* root = newNode(10);
    root->left = newNode(11);
    root->left->left = newNode(7);
    root->right = newNode(9);
    root->right->left = newNode(15);
    root->right->right = newNode(8);

    cout << "Inorder traversal before insertion:";
    inorder(root);

    int key = 12;
    insert(root, key);

    cout << endl;
    cout << "Inorder traversal after insertion:";
    inorder(root);

    return 0;
} 
