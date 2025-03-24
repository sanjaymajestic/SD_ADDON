package addon;

class DoublyLinkedList {
    class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }

    Node head, tail;

    // Insert at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode; // If the list is empty
        } else {
            tail.next = newNode; // Link current tail to new node
            newNode.prev = tail; // Link new node back to tail
            tail = newNode; // Update tail to the new node
        }
    }

    // Insert at the beginning of the list
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode; // If the list is empty
        } else {
            newNode.next = head; // Link new node to the head
            head.prev = newNode; // Link head back to the new node
            head = newNode; // Update head to the new node
        }
    }

    // Delete at a given position
    public void deleteAtPosition(int position) {
        if (head == null || position < 0) return;

        Node current = head;

        // If deleting the head node
        if (position == 0) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }

        // Traverse to the node at the given position
        for (int i = 0; current != null && i < position; i++) {
            current = current.next;
        }

        // If the position is out of range
        if (current == null) return;

        // Unlink the node
        if (current.next != null) current.next.prev = current.prev;
        if (current.prev != null) current.prev.next = current.next;
    }

    // Print the list from head to tail
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        
        // Insert elements at the end
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        // Insert element at the beginning
        list.insertAtBegin(5);

        // Print the list
        System.out.println("List after insertions:");
        list.printList();

        // Delete element at position 2 (value 20)
        list.deleteAtPosition(2);
        
        // Print the list after deletion
        System.out.println("List after deletion:");
        list.printList();
    }
}
