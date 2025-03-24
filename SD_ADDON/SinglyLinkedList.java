package addon;
import java.util.Scanner;

public class SinglyLinkedList {

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        public void add(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public void insert(int index, int value) {
            Node newNode = new Node(value);
            if (index == 0) {
                newNode.next = head;
                head = newNode;
                return;
            }

            Node current = head;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }

            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            }
        }

        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add value to list");
            System.out.println("2. Insert value at index");
            System.out.println("3. Display list");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter value to add: ");
                int value = scanner.nextInt();
                list.add(value);
            } else if (choice == 2) {
                System.out.print("Enter index to insert at: ");
                int index = scanner.nextInt();
                System.out.print("Enter value to insert: ");
                int value = scanner.nextInt();
                list.insert(index, value);
            } else if (choice == 3) {
                System.out.println("Current List:");
                list.printList();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }

        scanner.close();
    }
}
