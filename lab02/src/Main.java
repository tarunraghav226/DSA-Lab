import sortArray.MySort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MySort object = new MySort();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Enter Array");
        for (int i = 0; i < size; i++)
            array[i] = scan.nextInt();
        System.out.println("Enter 1 for Simple Sorting\nEnter 2 for improved Sorting\nEnter 3 for optimized Sorting\n");
        int choice = scan.nextInt();
        if (choice == 1)
            object.sortm1(array);
        else if (choice == 2)
            object.sortm2(array);
        else if (choice == 3)
            object.sortm3(array);
        System.out.println("Sorted Array is -->");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
