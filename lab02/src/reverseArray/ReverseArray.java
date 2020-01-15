package reverseArray;

public class ReverseArray {

    public int[] reverseArray(int[] inputArray) {
        int[] newArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] >= Integer.MAX_VALUE) {
                newArray[newArray.length - i - 1] = 0;
            } else {
                newArray[newArray.length - i - 1] = inputArray[i];
            }
        }
        return newArray;
    }
}
