package day11;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNodeLinkedList {

    Node head;

    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Delete node by value
    void delete(int key) {

        // If list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If head node contains key
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;

        // Search for key
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // Key not found
        if (temp == null) {
            System.out.println("Node not found");
            return;
        }

        // Delete node
        prev.next = temp.next;
    }

    // Display linked list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        DeleteNodeLinkedList list = new DeleteNodeLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Before Deletion:");
        list.display();

        list.delete(30);

        System.out.println("After Deletion:");
        list.display();
    }
}