import linkedList.MyLinkedList;
import node.StudentNode;
import student.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyLinkedList linkedList = new MyLinkedList(10);
        for (int i = 0; i < 10; i++) {
            StudentNode studentNode = new StudentNode();
            Student student = new Student();
            student.setName("Tarun" + (i + 1));
            student.setCpi(9.9f);
            studentNode.setStudent(student);
            linkedList.insertion(studentNode);
        }
        linkedList.print();
        linkedList.reverse();
        linkedList.print();
    }
}
