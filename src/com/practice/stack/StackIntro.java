package com.practice.stack;

import java.util.Stack;

public class StackIntro {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        //adding elements
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        //returning last element without removal
        st.peek();
        st.peek();
        System.out.println(st);

        //returning last element with removing it
        st.pop();
        st.pop();
        System.out.println(st);

        //fetching number of elements in stack
        System.out.println(st.size());
    }
}
