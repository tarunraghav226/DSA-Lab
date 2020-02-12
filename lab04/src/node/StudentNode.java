package node;

import student.Student;

public class StudentNode {
    private Student student;
    private StudentNode next;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentNode getNext() {
        return next;
    }

    public void setNext(StudentNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return this.getStudent().getName();
    }
}
