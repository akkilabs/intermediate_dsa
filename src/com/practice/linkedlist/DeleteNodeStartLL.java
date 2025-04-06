package com.practice.linkedlist;

public class DeleteNodeStartLL {
    Node head;

    public static class Node {
        int data;
        Node next;

        //constructor to create new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to delete the first node of the linked list
    public void deleteNodeStartLL() {
        if (head == null) {
            System.out.println("Given LinkedList is empty. Nothing to delete.");
            return;
        }
        head = head.next; //Move the head pointer to next Node
        System.out.println("First Node Deleted Successfully");

    }

    //Helper method to add a new node at the end of LL
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    //Helper method to display the LL
    public void display() {
        if (head == null) {
            System.out.println("Given LinkedList is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteNodeStartLL ll = new DeleteNodeStartLL();

        //Adding nodes to the LL
        ll.addNode(10);
        ll.addNode(20);
        ll.addNode(30);

        System.out.println("Original LinkedList: ");
        ll.display();

        //Delete the First Node
        ll.deleteNodeStartLL();

        System.out.println("Updated LinkedList: ");
        ll.display();

        //Handle the edge case: deleting when the list is empty
        ll.deleteNodeStartLL();
        ll.deleteNodeStartLL();
        ll.deleteNodeStartLL(); //Attempt to delete when list is empty
    }
}
