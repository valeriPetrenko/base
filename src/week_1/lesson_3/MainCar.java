package week_1.lesson_3;


import week_2.lesson_4.Car;

public class MainCar {
    public static void main(String[] args) {

        Car car_1 = new Car();
        Car car_2 = new Car();
        Car car_3 = new Car();

      //  car_1.number("asd");

        car_1.setMark("BMw");
        car_2.setMark("Audi");
        car_3.setMark("VW");

        System.out.println("car_1.getMarka="+car_1.getMark());
        System.out.println("car_2.getMarka=" +car_2.getMark());
        System.out.println(Car.getCountCars());
    }
}
