/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;

// to store student information and properties
public class Student {
    private String name;
    private int rollno, backlog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getBacklog() {
        return backlog;
    }

    public void setBacklog(int backlog) {
        this.backlog = backlog;
    }

    @Override
    public String toString() {
        return "name-- " + getName() + "\n" +
                ", rollno-- " + getRollno() + "\n" +
                ", backlog-- " + getBacklog() + "\n" +
                "----------------------------------";
    }
}
