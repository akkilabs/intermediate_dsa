package com.practice.linkedlist;

/**
 * This class meant for finding middle element of LL
 * Author:Akki
 * Version:1.0
 */
public class FindMiddleElementLL {
    Node head;

    //Node structure of Singly LL
    public static class Node {
        int data;
        Node next;

        //constructor to initialize new Node with data
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Method to find middle element  of LL
    void findMiddleElement() {
        if (head == null) {
            System.out.println("Given LL is empty");
            return;
        }
        Node slowPtr = head;
        Node fastPtr = head;

        //Move fastPtr two nodes And slowPtr by one node at a time
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

/*            //This logic used to find first middle element and by commenting code at line num:34 - if given LL elements are even number of elements
            if (fastPtr != null) {
                slowPtr = slowPtr.next;

            }*/
        }
        //when 'fastPtr' reaches the end, 'slowPtr' will be at the middle element - if elements are even number then it points to second middle element
        System.out.println("Middle Element of LL: " + slowPtr.data);
    }

    //Helper method to add new node at the end of LL
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

    //Helper method to display the LL
    void display() {
        if (head == null) {
            System.out.println("Given LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        FindMiddleElementLL ll = new FindMiddleElementLL();

        ll.addNode(10);
        ll.addNode(20);
        ll.addNode(30);
        ll.addNode(40);
        ll.addNode(50);
        ll.addNode(60);

        System.out.println("Given LinkedList: ");
        ll.display();

        //find the middle element of LL
        ll.findMiddleElement(); // TC: O(N) SC: O(1)
    }
}
