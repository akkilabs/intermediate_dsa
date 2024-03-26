package com.practice.stack;

import java.util.LinkedList;

public class StackLinkedList {
    /*	We can implement stack through linked list in two ways
    → Through addLast and removeLast methods of LL
    → Through addFirst and removeFirst methods of LL
    (second approach is preferred, as first one is little expensive operation as
    removeLast operation required traverse through Linked List )
    */
    public static void main(String[] args) {
        LinkedList<Integer> stackLL = new LinkedList<>();

        //add
        stackLL.addFirst(10);
        stackLL.addFirst(20);
        stackLL.addFirst(30);
        stackLL.addFirst(40);
        stackLL.addFirst(50);
        stackLL.addFirst(60);

        System.out.println(stackLL);

        //remove
        System.out.println(stackLL.removeFirst());
        System.out.println(stackLL.removeFirst());

        System.out.println(stackLL);

    }
}