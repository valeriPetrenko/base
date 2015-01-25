package week_1.lesson_3;

public class MyInteger {
    private int value;
    public MyInteger(int k){
    value = k;
    }

    public MyInteger plus (MyInteger v){
        int sum = value + v.value;
        MyInteger res = new MyInteger(sum);
        return res;
    }
    public int getValue(){
    return value;
    }}