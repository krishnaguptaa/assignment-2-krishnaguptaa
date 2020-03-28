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
    private Node front, end;

    public Node getFront() {
        return front;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public void enqueue(Node newNode) {
        if (getFront() == null && getEnd() == null) {
            setFront(newNode);
            setEnd(newNode);
            getEnd().setNext(getFront());
        } else {
            newNode.setNext(getFront());
            getEnd().setNext(newNode);
            setEnd(getEnd().getNext());
        }
    }

    public void traverseQueue() {
        Node temp = getFront();
        while (true) {
            System.out.println(temp.getS());
            temp = temp.getNext();
            if (temp == getFront()) {
                break;
            }
        }
    }

    public Node deQueue() {
        Node temp;
        if (getFront() == null) {
            return null;

        } else if (getFront() == getEnd()) {
            temp = getFront();
            setEnd(null);
            setFront(null);
        } else {
            temp = getFront();
            setFront(getFront().getNext());
            getEnd().setNext(getFront());
        }
        return temp;
    }

    public void removeZeroBacklogRecords() {
        Node before = getEnd();
        Node ahead = getFront();
        while (true) {
            if (ahead.getS().getBacklog() == 0) {
                System.out.println("Removed data --> ");
                System.out.println(ahead.getS());
                if (ahead == getFront()) {
                    before.setNext(ahead.getNext());
                    setFront(getFront().getNext());
                    ahead = ahead.getNext();
                    continue;
                } else if (ahead == getEnd()) {
                    before.setNext(ahead.getNext());
                    setEnd(before);
                    break;
                } else {
                    before.setNext(ahead.getNext());
                    ahead = ahead.getNext();
                }
            } else {
                ahead = ahead.getNext();
                before = before.getNext();
            }
            if (ahead == getFront())
                break;
        }
    }


}
