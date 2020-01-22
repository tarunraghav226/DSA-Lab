import anagram.Anagram;

import java.util.Scanner;

public class AnagramMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size");
        Anagram obj = new Anagram(scan.nextInt());
        obj.setStringArray1();
        obj.setStringArray2();
        obj.checkStrings();
        obj.displayStringArray1();
        obj.displayStringArray2();
        obj.displayArray();
    }
}
