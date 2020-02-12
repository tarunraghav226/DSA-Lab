package stack;

import node.StudentNode;

public class MyStack {
    private StudentNode[] students;
    private int top;

    public MyStack(int size) {
        students = new StudentNode[size];
        top = -1;
    }

    public void push(StudentNode student) {
        top += 1;
        students[top] = student;
    }

    public StudentNode pop() {
        if (top < 0)
            return null;
        StudentNode student = students[top];
        top--;
        return student;
    }
}
