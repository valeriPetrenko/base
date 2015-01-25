package Ducks;

public class Main {
    public static void main(String[] args) {
        Duck pacificBlackDuck = new Duck("Pacific black Duck");
        Duck mandarinDuck = new Duck("Mandarin Duck");
        Duck rubberDuck = new Duck("Rubber Duck");

        FlyBehavior withRocket = new FlyWithRocket();//одно поведение тремя разными реализациями и поэтому 3 разных объекта
        FlyBehavior withWings = new FlyWithWings();
        FlyBehavior cantFly = new CantFly();

        pacificBlackDuck.setFlyAbillity(withRocket);
        mandarinDuck.setFlyAbillity(withWings);
        rubberDuck.setFlyAbillity(withRocket);

        pacificBlackDuck.actualFly();
        mandarinDuck.actualFly();
        rubberDuck.actualFly();

        rubberDuck.setFlyAbillity(cantFly);
        rubberDuck.actualFly();

    }
}
