package evenArray;

import java.util.ArrayList;

public class EvenArray {

    public int[] evenArray(int[] inputArray) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 0 && inputArray[i] != 0) {
                arrayList.add(inputArray[i]);
            }
        }
    }

}
