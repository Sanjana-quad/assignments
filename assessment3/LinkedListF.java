package assessment2;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

class LinkedList{
    Node head;
    public void add(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        else {

            newNode.next = head;
            head = newNode;
            return;
        }
    }
    public void delete(int data) {
        if(head == null) {
            return;
        }
        else if(head.data == data) {
            head = head.next;
            return;
        }
        else {
            Node current = head;
            while(current.next != null) {
                if(current.next.data == data) {
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }
            return;
        }
    }
    public void display() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class LinkedListF{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i = 0; i < 4; i++) {
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            list.add(data);
        }
        list.display();
    }
}

