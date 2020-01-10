package array;

import array.implementation.Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        System.out.println("Enter Size of Array");
        Scanner scan = new Scanner(System.in);
        array.insert(scan.nextInt());
        array.displayArray();
        System.out.println("Sum of the values in array " + array.sum());
        System.out.println("Average of the values in array " + array.average());
        System.out.println("Enter index of the value to be deleted");
        array.deleteValueOnIndex(scan.nextInt());
        System.out.println("Enter value to be deleted");
        array.deleteValue(scan.nextInt());
        System.out.println("Enter value to be searched");
        System.out.println("Value is at index " + array.searchValue(scan.nextInt()));
        array.sortArray();
        System.out.println("Sorted Array " + array);
    }
}
