package Ducks;

public class CantFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Oh, I can't fly, I'm retarded duck :( ");
    }
}
