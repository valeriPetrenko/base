package week2_second_chance.lesson3;

/**Задача 4. Написать класс число (MyInteger).
 Хранить значение в поле private int value,
 соответсвенно к полю геттер и сеттер.
 Реализовать метод plus.
*/
public class MyInteger {
    private int value;

    public MyInteger(int value ){
        this.value = value;
    }

    public void setValue(int value){
      this.value = value;

    }
    public int getValue(){
        return this.value;
    }

    public MyInteger plus(MyInteger b) {
    MyInteger c = new MyInteger(b.getValue());
        c.value = b.value + value;
        return c;

    }
}
