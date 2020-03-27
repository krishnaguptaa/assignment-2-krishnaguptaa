/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyTraverse m = new MyTraverse();
        m.insert(10);
        m.insert(20);
        m.insert(30);
        m.insert(40);
        m.insert(50);
        m.insert(5);
        m.insert(15);
        m.insert(25);
        m.insert(35);
        System.out.println("Pre order traversing:");
        m.traversePreorder(m.getRoot());
        System.out.println();
        System.out.println("Post order traversing:");
        m.traversePostorder(m.getRoot());
        System.out.println("Satisfy the both of two conditions.");
    }

}
