package assign3;

class Node {
    int data;
    Node next;
    Node prev;
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class linkedList {
    Node head=null;

    public void insert_end(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }
    public void insert_start(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insert_at(int data, int pos) {
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void reverse() {
        Node current = head;
        Node prev = null;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void display(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.insert_end(1);
        list.insert_end(2);
        list.insert_start(4);
        list.insert_start(5);
        list.display();
        list.insert_at(0,2);
        list.display();
        list.reverse();
        list.display();
    }
}
  