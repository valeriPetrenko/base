package week3.HW.Cats;

/*
 */
public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }
    public void riseHair(){
        System.out.println("rise Hair");
    }
    public void yellIfNotGorged(){
        if(this.bellyfull < 4){
            System.out.println("Feed me!");
        }else{
            System.out.println("I'll tell u, if I'm hungry");
        }
    }
    public void say(){
        System.out.println("mi");
    }

}
