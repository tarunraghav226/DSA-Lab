package linkedList;

import node.StudentNode;
import stack.MyStack;

public class MyLinkedList {
    private StudentNode head = null;
    private int numberOfNodes;

    public MyLinkedList(int numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    public int getNumberOfNodes() {
        return this.numberOfNodes;
    }

    private StudentNode getHead() {
        return this.head;
    }

    private void setHead(StudentNode headNode) {
        this.head = headNode;
    }

    public void insertion(StudentNode obj) {
        if (this.getHead() == null) {
            this.setHead(obj);
        } else {
            StudentNode temp = this.getHead();
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(obj);
        }
    }

    public void reverse() {
        MyStack stack = new MyStack(getNumberOfNodes());
        StudentNode temp = getHead();
        while (temp != null) {
            stack.push(temp);
            temp = temp.getNext();
        }
        setHead(null);
        StudentNode studentNode = stack.pop();

        while (studentNode != null) {
            studentNode.setNext(null);
            insertion(studentNode);
            studentNode = stack.pop();
        }
    }

    public void print() {
        StudentNode temp = getHead();
        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

}
