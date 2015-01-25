package week_1.lesson_3.hw2;
import java.lang.Math;
import java.util.Scanner;

/* Написать класс число (hw2.Number), выполняющий следующие операции:
     - получение примитива (метод int get())
     - сложение (метод Number add(Number num))
     - вычитание (метод Number sub(Number num))
     - умножение (метод Number mul(Number num))
     - деление (метод Number div(Number num))
     - возведение в степень (метод Number pow(Number exponent))
     - вычисление факториала (метод Number fact())
     - вычисление остатка от деления (метод Number mod(Number num))
     */

public class Number {

    private int number = 0;

    public Number(int number){
        this.number = number;
    }

    public int get(){
        return number;
    }

    public Number add(Number num){
        return new Number(this.number + num.get());
    }
    public Number sub(Number num){
        return new Number(this.number - num.get());
    }
    public Number mul(Number num){
        return new Number (this.number * num.get());
    }
    public Number div(Number num){
        return new Number(this.number/num.get());
    }
    public Number pow(Number exponent){
        return new Number((int)Math.pow(this.number, exponent.get()));
    }
    public Number fact(){
        int res = 1;
        for(int i = 1; i <= this.number; i ++)
            res *= i;
        return new Number(res);
    }
    public  Number mod(Number num){
        return new Number(this.number%num.get());
    }
}