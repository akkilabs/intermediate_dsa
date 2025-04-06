package com.practice.binarytrees;

/**
 * This class meant to find height of BT
 * Author:Akki
 * Version:1.0
 * Uses Recursive Approach to find height.
 */
public class HeightBinaryTree {
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

    //Method to find height of BT
    public int findHeight(Node node) {
        if (node == null) {
            return 0; //Base Case: if tree is empty , height is 0
        }

        //Calculate the height of LST and RST
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        // Return the maximum height between the two subtrees + 1 (for the current node)
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        HeightBinaryTree heightBinaryTree = new HeightBinaryTree();

        //Creating sample BT
        heightBinaryTree.root = new Node(1);
        heightBinaryTree.root.left = new Node(2);
        heightBinaryTree.root.right = new Node(3);
        heightBinaryTree.root.left.left = new Node(4);
        heightBinaryTree.root.left.right = new Node(5);
        heightBinaryTree.root.right.left = new Node(6);
        heightBinaryTree.root.right.right = new Node(7);

        //Calculating Height of BT
        int height = heightBinaryTree.findHeight(heightBinaryTree.root);
        System.out.println("height of given BT: " + height);
    }

}
