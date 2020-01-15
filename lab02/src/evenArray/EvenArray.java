package evenArray;

public class EvenArray {

    public int countEven(int[] inputArray) {
        int even = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 0 && inputArray[i] != 0) {
                even++;
            }
        }
        return even;
    }

    public int[] evenArray(int[] inputArray) {
        int even = countEven(inputArray);
        int j = 0;
        int[] newArray = new int[even];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 0 && inputArray[i] != 0) {
                newArray[j] = inputArray[i];
                j++;
            }
        }
        return newArray;
    }
}
