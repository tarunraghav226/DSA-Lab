import anagram.Anagram;

import java.util.Scanner;

public class AnagramMain {
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] s1 = new String[size];
        String[] s2 = new String[size];
        for (int i = 0; i < s1.length; i++) {
            s1[i] = scan.next().trim();
        }


        for (int i = 0; i < s2.length; i++) {
            s2[i] = scan.next().trim();
        }

        System.out.println(anagram.check(s1, s2));
    }
}
