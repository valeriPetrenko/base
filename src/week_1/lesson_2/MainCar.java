package week_1.lesson_2;

public class MainCar {
    public static void main(String[] args) {

        Car car_1 = new Car();
        Car car_2 = new Car();
        Car car_3 = new Car();

        car_1.number = "AA11";
        car_2.number = "BB22";
        car_3.number = "CC33";

        car_1.colour = "yellow";
        car_2.colour = "blue";
        car_3.colour = "red";

        car_1.printAboutMe();
        car_2.printAboutMe();
        car_3.printAboutMe();

        car_1.start();
        car_2.start();
        car_3.start();

        car_1.move();
        car_2.move();

        car_1.stop();
        car_2.stop();
        car_3.stop();

    }
}
