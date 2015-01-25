package week3.lesson1.lesson2;

/* Написать класс телефонов.
 Phone(boolean touch, int number, boolean camera, int sideSize)
 Nokia, Samsung
 IPhone(int appleId),IPhone4, IPhone5
 Что умеют делать:
  - call(number)
  - getModel()
  - getAppleId()// для айфонов
 MainPhone(список телефонов)
Добавить пару телефонов с номерами каждого вида в список.
С консоли считать 2 (индекса)номера телефона и вызвать методы call  с одного номер на второй.
Затем считать с консоли номер телефона и вызвать для него getModel.
Затем считать с консоли номер телефона и вызвать для него getAppleId.
 */
  public class Phone {
    private String model;
    boolean touch;
    int number;
    boolean camera;
    int sideSize;

    public String getModel(){
        return model;
    }

    public Phone( int number, int sideSize, boolean camera, boolean touch, String model){
    }

    public int getAppleId(){
        return 0;
    }

    public void call(int number){

    }

}
