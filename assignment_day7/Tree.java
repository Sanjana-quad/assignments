package assignment_day7;

class Node2 {
    int data;
    Node2 left,right;
    public Node2(int data){
        this.data = data;
        left = right = null;
    }
}
public class Tree {
    Node2 root;

    Node2 insert(Node2 node, int data){
        if(node == null){
            return new Node2(data);
        }
        else if(data < node.data) {
            node.left = insert(node.left,data);
        }
        else if(data > node.data){
            node.right = insert(node.right,data);
        }
        return node;
    }
    void preOrder(Node2 node){
        if(node == null){
            return;
        }
        else{
            System.out.print(node.data+" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    void inOrder(Node2 node){
        if(node == null){
            return;
        }
        else{
            inOrder(node.left);
            System.out.print(node.data+" ");
            inOrder(node.right);
        }
    }
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root=tree.insert(tree.root, 5);
        tree.insert(tree.root, 6);
        tree.insert(tree.root, 7);
        tree.insert(tree.root, 8);
        tree.insert(tree.root, 9);
        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
    }
}
