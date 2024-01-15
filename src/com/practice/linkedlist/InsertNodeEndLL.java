package com.practice.linkedlist;

public class InsertNodeEndLL {

    public static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
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
            head = insertEnd(head, 50);

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public static Node insertEnd(Node head, int val) {
            Node n = new Node(50);

            Node tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = n;
            return head;
        }
    }
}