package com.practice.binarytrees;

public class PreOrderTraversalBT {
    TreeNode root;

    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        //constructor to create a new TreeNode
        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void preOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        //Visit the root node
        System.out.println(node.data);

        //Recursively traverse the LST
        preOrderTraversal(node.left);

        //Recursively traverse the RST
        preOrderTraversal(node.right);


    }

    public static void main(String[] args) {
        PreOrderTraversalBT tn = new PreOrderTraversalBT();

        //Creating sample Binary Tree
        tn.root = new TreeNode(1);
        tn.root.left = new TreeNode(2);
        tn.root.right = new TreeNode(3);
        tn.root.left.left = new TreeNode(4);
        tn.root.left.right = new TreeNode(5);

        System.out.println("PreOrder Traversal:");
        tn.preOrderTraversal(tn.root);
    }
}
