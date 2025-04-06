package com.practice.binarytrees;

/**
 * This class meant for PostOrderTraversal of a BT
 * Author:Akki
 * Version:1.0
 * PostOrderTraversal follows this order LST | RST | root
 */
public class PostOrderTraversalBT {
    Node root;

    //BinaryTree Node structure
    public static class Node {
        int data;
        Node left;
        Node right;

        //constructor to create new node of BT
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Method for postorder traversal
    public void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        //Recursive traverse the LST
        postOrderTraversal(node.left);

        //Recursive traverse the RST
        postOrderTraversal(node.right);

        //Visit the root node
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        PostOrderTraversalBT tn = new PostOrderTraversalBT();

        //creating sample BinaryTree
        tn.root = new Node(1);
        tn.root.left = new Node(2);
        tn.root.right = new Node(3);
        tn.root.left.left = new Node(4);
        tn.root.left.right = new Node(5);
        tn.root.right.left = new Node(6);
        tn.root.right.right = new Node(7);

        System.out.println("PostOrder Traversal of Binary Tree: ");
        tn.postOrderTraversal(tn.root);
    }
}
