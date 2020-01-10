package array.implementation;

import array.interfaces.ArrayInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array implements ArrayInterface {
    int[] array;

    @Override
    public String displayArray() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("|");
        for (int i : array) {
            stringBuffer.append(i);
            stringBuffer.append("|");
        }
        return stringBuffer.toString();
    }

    @Override
    public void insert(int size) {
        Scanner scan = new Scanner(System.in);
        array = new int[10];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element");
            try {
                array[i] = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Enter value correctly");
                i--;
            } catch (Exception e) {
                System.out.println("Enter value correctly");
                i--;
            }
        }
    }

    @Override
    public int sum() {
        int sumValue = 0;
        for (int i : array) {
            sumValue += i;
        }
        return sumValue;
    }

    @Override
    public float average() {
        float averageValue = 0.0f;
        for (int i : array) {
            averageValue += i;
        }
        return averageValue / array.length;
    }

    @Override
    public void deleteValueOnIndex(int index) {
        if (index < 0) {
            System.out.println("Wrong index given.");
            return;
        }

        if (index >= array.length) {
            System.out.println("Wrong index given.");
            return;
        }

        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length] = -99999;
    }

    @Override
    public void deleteValue(int value) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == value) {
                for (int j = i; i < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length] = -99999;
            }
        }
    }

    @Override
    public int searchValue(int value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public void sortArray() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
