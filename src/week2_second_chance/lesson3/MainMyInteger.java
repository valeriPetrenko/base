package week2_second_chance.lesson3;

/**
 Задача 4. Написать класс число (MyInteger).
 Хранить значение в поле private int value, соответсвенно
 к полю геттер и сеттер.
 Реализовать метод plus.
 class MainMyInteger{
 public static void main(String[] args){
 MyInteger a = new MyInteger(10);
 MyInteger b = new MyInteger(20);
 MyInteger c = a.plus( b );
 System.out.println(a.getValue() + " + " + b.getValue() + " = " + c.getValue())
 }
 }*/

public class MainMyInteger {
    public static void main(String[] args){
        MyInteger a = new MyInteger(100);
        MyInteger b = new MyInteger(20);
        MyInteger c = a.plus(b);
        System.out.println(a.getValue() + " + " + b.getValue() + " = " + c.getValue());
    }
}
