package org.dsa.DataStructure.BST;

import com.google.gson.Gson;
import lombok.ToString;

@ToString
public class BST {

    Node root;

    @ToString
    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    private void insert(int value) {
        Node newNode = new Node(value);
        if (this.root == null) {
            this.root = newNode;
        } else {
            Node currentNode = this.root;
            while (true) {
                if (value < currentNode.data) {
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        return;
                    }
                    currentNode = currentNode.left;
                } else {
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        return;
                    }
                    currentNode = currentNode.right;
                }
            }
        }
    }

    private void remove(int value) {
        Node currentNode = this.root;
        Node parentNode = null;
        if (currentNode == null) {
            System.out.println("Tree is empty!!");
            return;
        } else {
            while (currentNode != null) {
                if (value > currentNode.data) {
                    parentNode = currentNode;
                    currentNode = currentNode.right;
                }
                if (value < currentNode.data) {
                    parentNode = currentNode;
                    currentNode = currentNode.left;
                }
                if (value == currentNode.data) {
                    //Option 1: No right child:
                    if (currentNode.right == null) {
                        if (parentNode == null) {
                            this.root = currentNode.left;
                        } else {
                            if (currentNode.data < parentNode.data) {
                                parentNode.left = currentNode.left;
                            } else if (currentNode.data > parentNode.data) {
                                parentNode.right = currentNode.left;
                            }
                        }
                    }
                    //Option 2: Right child which doesnt have a left child
                    else if (currentNode.right.left == null) {
                        currentNode.right.left = currentNode.left;
                        if (parentNode == null) {
                            this.root = currentNode.right;
                        } else {
                            if (currentNode.data < parentNode.data) {
                                parentNode.left = currentNode.right;
                            } else if (currentNode.data > parentNode.data) {
                                parentNode.right = currentNode.right;
                            }
                        }
                    }
                    //Option 3: Right child that has a left child
                    else {
                        //find the right child's left most child
                        Node leftMost = currentNode.right.left;
                        Node leftMostParent = currentNode.right;
                        while (leftMost.left != null) {
                            leftMostParent = leftMost;
                            leftMost = leftMost.left;
                        }

                        //Parent's left subtree is now leftmost's right subtree
                        leftMostParent.left = leftMost.right;
                        leftMost.left = currentNode.left;
                        leftMost.right = currentNode.right;

                        if (parentNode == null) {
                            this.root = leftMost;
                        } else {
                            if (currentNode.data < parentNode.data) {
                                parentNode.left = leftMost;
                            } else if (currentNode.data > parentNode.data) {
                                parentNode.right = leftMost;
                            }
                        }

                    }
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(20);
        bst.insert(10);
        bst.insert(30);
        bst.insert(7);
        bst.insert(13);
        bst.insert(25);
        bst.insert(12);
        bst.remove(25);
        bst.remove(13);
        bst.remove(10);
        System.out.println(bst.root);
        System.out.println(new Gson().toJson(bst.root));
    }


}
