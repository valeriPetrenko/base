package CarsV2;

/**2) Создать класс Track()(String number )
 Методы:
 roll() - начать катиться( не должен повторно катиться, если уже катится)
 stop() - остановить качение( не должен повторно остановиться, если уже остановлено)  */

public class Trailer {
    String number;
    Car connectedTo;
    boolean isRolling;


    public Trailer(String number){
        this.number = number;
        this.connectedTo = null;
    }

    public void connect(Car automobile){
        this.connectedTo = automobile;
        System.out.println("Trailer " + number + " has connected to car " + automobile.model);
    }

    public void roll(){
        if(isRolling == false){
            System.out.println(number + " trailer has rolled");
            isRolling = true;
        }else{
            System.out.println("Trailer has already moved");
        }
    }

    public void stop(){
        if(isRolling == true){
            System.out.println("The trailer " + number + " has stopped");
            isRolling = false;
        }else{
            System.out.println("Trailer can't stop, 'cause it didn't move");
        }
    }


}
