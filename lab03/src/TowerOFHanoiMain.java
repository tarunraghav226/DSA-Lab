import towerOfHanoi.TowerOfHanoi;

import java.util.Scanner;

public class TowerOFHanoiMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TowerOfHanoi obj = new TowerOfHanoi();
        System.out.println("Enter number of disk");
        System.out.println("Numer of steps --> " + obj.towerOfHanoi(scan.nextInt(), "1", "2", "3"));
    }
}
