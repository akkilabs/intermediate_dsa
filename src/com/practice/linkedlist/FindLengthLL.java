package com.practice.linkedlist;

public class FindLengthLL {
    Node head;

    public static class Node {
        int data;
        Node next;

        //constructor to create new node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        FindLengthLL ll = new FindLengthLL();

        //Adding nodes to the LL
        ll.addNode(70);
        ll.addNode(80);
        ll.addNode(90);
        ll.addNode(90);
        System.out.println("Length of LL is: " + ll.findLengthLL());
    }

    //Helper method to add a new node at the end of LL
    void addNode(int data) {
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

    //method to find length of LL
    public int findLengthLL() {
        Node temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }
}
