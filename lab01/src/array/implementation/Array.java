package array.implementation;

import array.interfaces.ArrayInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array implements ArrayInterface {
    int[] array;
    int size;

    @Override
    public String displayArray() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("|");
        for (int i = 0; i < this.size; i++) {
            stringBuffer.append(array[i]);
            stringBuffer.append("|");
        }
        return stringBuffer.toString();
    }

    @Override
    public void insert(int size) {
        this.size = size;
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
        for (int i = 0; i < this.size; i++) {
            sumValue += array[i];
        }
        return sumValue;
    }

    @Override
    public float average() {
        float averageValue = 0.0f;
        averageValue = (float) this.sum() / this.size;
        return averageValue;
    }

    @Override
    public void deleteValueOnIndex(int index) {
        if (index < 0) {
            System.out.println("Wrong index given.");
            return;
        }

        if (index >= this.size) {
            System.out.println("Wrong index given.");
            return;
        }

        for (int i = index; i < this.size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[this.size - 1] = -99999;
        this.size--;
    }

    @Override
    public void deleteValue(int value) {
        for (int i = 0; i < this.size; i++) {
            if (array[i] == value) {
                for (int j = i; j < this.size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = -99999;
                this.size--;
            }
        }
    }

    @Override
    public int searchValue(int value) {
        int index = -1;
        for (int i = 0; i < this.size; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public void sortArray() {
        boolean flag = false;
        for (int i = 0; i < this.size - 1; i++) {
            flag = false;
            for (int j = 0; j < this.size - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false)
                return;
        }
    }
}
