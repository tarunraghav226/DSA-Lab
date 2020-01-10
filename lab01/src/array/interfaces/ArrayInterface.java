package array.interfaces;

public interface ArrayInterface {
    String displayArray();

    void insert(int size);

    int sum();

    float average();

    void deleteValueOnIndex(int index);

    void deleteValue(int value);

    int searchValue(int value);

    void sortArray();
}
