package towerOfHanoi;

public class TowerOfHanoi {
    public int towerOfHanoi(int n, String source, String temp, String destination) {
        int count = 1;
        if (n == 1) {
            System.out.println(source + " " + destination);
            return 1;
        } else {
            count += towerOfHanoi(n - 1, source, destination, temp);
            System.out.println(source + " " + destination);
            count += towerOfHanoi(n - 1, temp, source, destination);
        }
        return count;
    }
}
