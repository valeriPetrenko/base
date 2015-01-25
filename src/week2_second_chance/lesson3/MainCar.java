package week2_second_chance.lesson3;

import javax.smartcardio.CardChannel;

/*
 */
public class MainCar {
    public static void main(String[] args) {
        Car obj = new Car();
        Car car1 = new Car();
        obj.setColour("Black");
        System.out.println(obj.getColour());
        obj.setNumber("2211");
        obj.setModel("Audi");
        System.out.println(obj.getModel());
        System.out.println(obj.getNumber());
        System.out.println(obj.getCarCounter());
    }
}
