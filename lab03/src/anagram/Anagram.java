package anagram;

import java.util.Scanner;

public class Anagram {

    String[] stringArray1;
    String[] stringArray2;
    int[] array;

    public Anagram(int size) {
        stringArray1 = new String[size];
        stringArray2 = new String[size];
        array = new int[size];
    }

    public void setStringArray1() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < stringArray1.length; i++) {
            stringArray1[i] = scan.next().trim();
        }
    }

    public void setStringArray2() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < stringArray2.length; i++) {
            stringArray2[i] = scan.next().trim();
        }
    }

    private String sortedString(String string) {
        char[] chars1 = string.toCharArray();
        bubbleSort(chars1);
        string = "";
        for (char c : chars1) {
            string = c + string;
        }
        return string;
    }

    private boolean checkAnagram(String string1, String string2) {
        string1 = sortedString(string1);
        string2 = sortedString(string2);
        if (string1.compareTo(string2) == 0)
            return true;
        else
            return false;
    }

    private void bubbleSort(char[] chars) {
        boolean flag;
        for (int i = 0; i < chars.length; i++) {
            flag = false;
            for (int j = 0; j < chars.length - i - 1; j++) {
                if (chars[j] > chars[j + 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false)
                return;
        }
    }

    private int countDifferentChars(String string1, String string2) {
        string1 = sortedString(string1);
        string2 = sortedString(string2);
        int count = 0;
        for (int i = 0; i < string1.length(); i++)
            if (string1.charAt(i) != string2.charAt(i))
                count++;

        return count;
    }

    public void checkStrings() {
        for (int i = 0; i < stringArray1.length; i++) {
            if (!checkAnagram(stringArray1[i], stringArray2[i])) {
                array[i] = countDifferentChars(stringArray1[i], stringArray2[i]);
            }
        }
    }

    public void displayArray() {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public void displayStringArray1() {
        for (String s : stringArray1) {
            System.out.print(s + " ");
        }
    }

    public void displayStringArray2() {
        for (String s : stringArray2) {
            System.out.print(s + " ");
        }
    }

}
