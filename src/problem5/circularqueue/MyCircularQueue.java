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

    public void printQueue() {
        temp = front;
        try {
            do {
                System.out.println(temp.getS().toString());
                temp = temp.getNext();
            }
            while (temp != front && temp != null);
        } catch (NullPointerException ignored) {
        }
    }

    public void remove(String name) {
        temp = front;
        if (temp.getS().getName().equals(name) && temp.getS().getBacklog() == 0) {
            temp = front = front.getNext();
        }
        while (!temp.getNext().getS().getName().equals(name)) {
            temp = temp.getNext();
            if (temp == front)
                return;
        }
        if (temp.getS().getBacklog() == 0) {
            temp.setNext(temp.getNext().getNext());
        }
    }

    public void process(String name) {

    }
}
