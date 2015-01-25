package week_1.lesson_3;


public class MainMyInteger {
public static void  main(String []  args){
    MyInteger a = new MyInteger(11);
    MyInteger b = new MyInteger(12);
    MyInteger c = a.plus(b);
    System.out.println(c.getValue());

}
}
