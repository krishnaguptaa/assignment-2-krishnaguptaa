/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        myBinarySearchTree.add(10);
        myBinarySearchTree.add(20);
        myBinarySearchTree.add(30);
        myBinarySearchTree.add(40);
        myBinarySearchTree.add(50);
        myBinarySearchTree.add(60);
        myBinarySearchTree.add(70);
        myBinarySearchTree.add(80);
        myBinarySearchTree.add(90);
        myBinarySearchTree.add(100);
        myBinarySearchTree.print();
        System.out.println("No. of nodes who doesn't have leftchild:" + myBinarySearchTree.numberofleftchild);

    }
}
