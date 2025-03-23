// A Java program to implement a singly linked list with basic operations

public class LinkedList {
    // Node class to represent each element in the list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    private Node head;

    // Constructor to initialize an empty list
    public LinkedList() {
        head = null;
    }

    // Method to insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Point new node to current head
        head = newNode;      // Update head to new node
    }

    // Method to insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // If list is empty, new node becomes head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode; // Link new node at the end
    }

    // Method to delete a node from the beginning
    public void deleteFromBeginning() {
        // If list is empty, do nothing
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next; // Move head to next node
    }

    // Utility method to print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Insert some nodes
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.insertAtEnd(3);
        System.out.println("Original list:");
        list.printList(); // Output: 1 -> 2 -> 3 -> null

        // Delete from beginning
        list.deleteFromBeginning();
        System.out.println("After deleting from beginning:");
        list.printList(); // Output: 2 -> 3 -> null
    }
}
