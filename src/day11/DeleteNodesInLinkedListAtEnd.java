
package day11;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNodesInLinkedListAtEnd {

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

    // Delete node at end
    void deleteAtEnd() {

        // If list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If only one node
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        // Move to second last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        // Delete last node
        temp.next = null;
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

        DeleteNodesInLinkedListAtEnd list = new DeleteNodesInLinkedListAtEnd();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Before Deletion:");
        list.display();

        list.deleteAtEnd();

        System.out.println("After Deletion:");
        list.display();
    }
}