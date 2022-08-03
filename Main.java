package Homework.lesson5.normal;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Driver driver = new Driver();
        Engine engine = new Engine();

        car.start();
        car.stop();
        car.turnRight();
        car.turnLeft();

        car.model = "Bmw m5";
        car.brand = "BMW";
        car.weight = 50;
    }

}

