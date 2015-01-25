package CarsV2;

import NEW.arrays.Array_chetnye;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       // ArrayList<Car> listOfCars = new ArrayList<Car>(10);
       // listOfCars.add(new Car("yellow", "bmw");

        Car bmw = new Car("yellow", "bmw" );
        Car audi= new Car("red", "audi");
        Car lexus = new Car("white", "lexus");

        Trailer caterpillar = new Trailer("0001");
        Trailer cat = new Trailer("0002");

        lexus.connect(cat);
        caterpillar.connect(bmw);
        audi.connect(caterpillar);

        bmw.start("bmw");
        bmw.stop("bmw");
        bmw.move("bmw");

        caterpillar.roll();
        caterpillar.stop();
        cat.stop();
    }
}
