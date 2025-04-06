package com.practice.binarytrees;

/**
 * This class meant for InOrderTraversal of a BT
 * Author:Akki
 * Version:1.0
 * InOrderTraversal follows this order LST | root | RST
 */
public class InOrderTraversalBT {
    Node root;

    //BinaryTree Node structure
    public static class Node {
        int data;
        Node left, right;

        //constructor to create a new node of BT
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Method for inorder traversal
    public void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        //Recursively traverse the LST
        inOrderTraversal(node.left);

        //Visit the root node
        System.out.print(node.data + " ");

        //Recursively traverse the RST
        inOrderTraversal(node.right);

    }

    public static void main(String[] args) {
        InOrderTraversalBT tn = new InOrderTraversalBT();

        //Creating sample BinaryTree
        tn.root = new Node(1);
        tn.root.left = new Node(2);
        tn.root.right = new Node(3);
        tn.root.left.left = new Node(4);
        tn.root.left.right = new Node(5);
        tn.root.right.left = new Node(6);
        tn.root.right.right = new Node(7);

        System.out.println("InOrder Traversal of Binary Tree: ");
        tn.inOrderTraversal(tn.root);

    }

}
