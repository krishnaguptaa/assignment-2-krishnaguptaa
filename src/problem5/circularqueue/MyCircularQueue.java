/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;

//to implement circular queue
public class MyCircularQueue {
    private Node front, temp, end;

    public MyCircularQueue() {
        front = null;
        temp = null;
        end = null;
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getTemp() {
        return temp;
    }

    public void setTemp(Node temp) {
        this.temp = temp;
    }

    public void enqueue(Node newNode) {
        if (front == null) {
            temp = front = newNode;
            return;
        }
        if (temp.getNext() == null) {
            temp.setNext(newNode);
            newNode.setNext(temp);
            end = newNode;
            return;
        }
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
    }
}
