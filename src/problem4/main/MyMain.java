/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem4.mbst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;
import problem4.myqueue.TreeNode;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        MyQueue myQueue = new MyQueue();
        TreeNode root;
        root = new TreeNode(10);
        myBinarySearchTree.insert(root, 5);
        myBinarySearchTree.insert(root, 1);
        myBinarySearchTree.insert(root, 15);
        myBinarySearchTree.insert(root, 9);
        myBinarySearchTree.insert(root, 7);
        myBinarySearchTree.insert(root, 12);
        myBinarySearchTree.insert(root, 30);
        myBinarySearchTree.insert(root, 25);
        myBinarySearchTree.insert(root, 40);
        myBinarySearchTree.insert(root, 45);
        myBinarySearchTree.insert(root, 6);
        myQueue.preOrder(root);
        myQueue.queuePrint(myQueue);
        System.out.println("enter value of which you want to find pre order successor:");
        myQueue.printSuccessor(sc.nextInt());
    }
}
