package problem3.student;

import java.util.Objects;

public class Student {
    private int rollno;
    private String name;

    public Student(int rollno) {
        this.rollno = rollno;
    }

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        Student s = (Student) obj;
        if (rollno > s.rollno) {
            return true;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return flag;
    }

    @Override
    public String toString() {
        return rollno + "." + name;
    }
}
