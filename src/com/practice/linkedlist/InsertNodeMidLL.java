package com.practice.linkedlist;

public class InsertNodeMidLL {
    public static Node head = null;
    public static int size = 0;

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
            Node n5 = new Node(60);
            Node n6 = new Node(70);

            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            n4.next = n5;
            n5.next = n6;

            head = n1;
            size = size(); // getting size of ll
            head = insertNode(n1, 4, 50);

            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.print(temp.data);
        }

        public static int size() {
            Node currentNode = head;
            int count = 0;
            while (currentNode.next != null) {
                count++;
                currentNode = currentNode.next;
            }
            return count;
        }

        public static Node insertNode(Node head, int index, int val) {

            //
            if (index >= 1 && index <= size + 1) {
                Node n = new Node(50);

                //At start of LL
                if (index == 1) {
                    n.next = head;
                    head = n;
                } else {
                    //at any index position
                    Node temp = head;

                    for (int i = 0; i <= index - 2; i++) {
                        temp = temp.next;
                    }
                    n.next = temp.next;
                    temp.next = n;
                }
                size++;
            }
            return head;
        }
    }
}
