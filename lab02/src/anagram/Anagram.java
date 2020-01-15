package anagram;

public class Anagram {

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

    public boolean check(String[] s1, String[] s2) {
        for (int i = 0; i < s1.length; i++) {
            if (!checkAnagram(s1[i], s2[i]))
                return false;
        }
        return true;
    }
}
