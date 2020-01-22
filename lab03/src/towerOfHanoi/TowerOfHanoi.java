package towerOfHanoi;

public class TowerOfHanoi {
    public void towerOfHanoi(int n, String source, String temp, String destination) {
        if (n == 1) {
            System.out.println(source + " " + destination);
        } else {
            towerOfHanoi(n - 1, source, destination, temp);
            System.out.println(source + " " + destination);
            towerOfHanoi(n - 1, temp, source, destination);
        }
    }
}
