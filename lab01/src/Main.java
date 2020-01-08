import aggregation.Car;
import aggregation.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name age weight");
        String name = scan.next();
        int age = scan.nextInt();
        int weight = scan.nextInt();

        System.out.println("Enter type price");
        String type = scan.next();
        String price = scan.next();
        Car car = new Car(type, price);
        Person person = new Person(name, age, weight, car);
        System.out.println(person.toString());
    }
}
