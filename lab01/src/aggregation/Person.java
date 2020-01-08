package aggregation;

public class Person {
    private String name;
    private int age;
    private int weight;
    private Car car;

    public Person(String name, int age, int weight, Car car) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String toString() {
        return this.name + " " + this.age + " " + this.weight + " " + this.car.toString();
    }
}
