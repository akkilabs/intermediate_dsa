package com.practice.linkedlist;

public class InsertNodeStartLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {

            this.data = data;
            this.next = null;
        }

        public static void main(String[] args) {

            Node n1 = new Node(10);
            Node n2 = new Node(20);
            Node n3 = new Node(30);
            Node n4 = new Node(40);

            n1.next = n2;
            n2.next = n3;
            n3.next = n4;

            Node head = n1;
            head = insertStart(head, 50);

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public static Node insertStart(Node head, int data) {
            Node n = new Node(50); // creating new Node
            n.next = head;        // assigning current head addr to new Node next ptr
            head = n;            // making new Node as head of LL ( head node stores data and address of next Node )
            return head;
        }
    }
}