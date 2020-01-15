import reverseArray.ReverseArray;

import java.util.Scanner;

public class ReverseMain {
    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array Size ");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Enter Array ");
        for (int i = 0; i < size; i++)
            array[i] = scan.nextInt();
        int[] reversedArray = obj.reverseArray(array);
        System.out.println("Reversed Array");
        for (int i : reversedArray) {
            System.out.println(i + " ");
        }
    }
}
