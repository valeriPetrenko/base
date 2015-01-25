package CarsV2;


public class Car {
    String colour;
    String model;
    boolean engineIsStarted;
    boolean carIsMoving;
    Trailer connectedTo;

    public void connect(Trailer track){
        this.connectedTo = track;
        track.connect(this);
        System.out.println("Trailer " + track.number + " has connected to car " + model);
    }

    Car(String colour, String model) {
        this.colour = colour;
        this.model = model;
        this.engineIsStarted = false;
        this.carIsMoving = false;
    }

    public void start(String model) {
        if (engineIsStarted == false) {
            System.out.println(colour + " car #" + model + " started");
            engineIsStarted = true;
        } else {
            System.out.println("Car has already started");
        }
    }

    public void move(String model) {
        if (engineIsStarted == true && carIsMoving == false) {
            System.out.println(colour + " car #" + model + " is moving");
            carIsMoving = true;

        } else {
            System.out.println("Car has already moved or not started yet");
        }
    }

    public void stop(String model) {
        if (carIsMoving == true) {
            System.out.println(colour + " car #" + model + " has stoped");
            carIsMoving = false;
            engineIsStarted = false;
        } else {
            System.out.println("Car has not moved, bitch");
        }
    }

}
