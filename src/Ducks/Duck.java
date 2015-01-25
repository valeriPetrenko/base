package Ducks;

public class Duck {
    private String specie;
    private FlyBehavior flyAbillity;

    public Duck(String specie){
        this.specie = specie;
    }

    public void actualFly(){
        System.out.print("I'm " + specie + " ");
        flyAbillity.fly();
    }

    public void setFlyAbillity(FlyBehavior flyBehavior){
       this.flyAbillity = flyBehavior;
    }
}
