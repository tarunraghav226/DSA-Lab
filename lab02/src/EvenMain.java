import evenArray.EvenArray;

import java.util.Scanner;

public class EvenMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size ");
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        EvenArray evenArray = new EvenArray();
        int[] even = evenArray.evenArray(array);
        for (int i : even) {
            System.out.println(i);
        }
    }
}
