package week_1.lesson_2;

/*Task 5. Дополнить классы Car и MainCar.
Для автомобиля добавить цвет(String) и обновить метод printAboutMe.
Создать в MainCar 3 автомобиля, установить им цвета и номера.
Вывести на экран состояние каждого объекта.
Task 6. Дополнить классы Car и MainCar.
Методы: start,move() stop(). Эти объекты выводят на экран сообщение:
авто с номером таким-то завелась/начала движение/остановилась(с выключением двигателя).
Для автомобиля эти методы должны менять состояние авто(заводим соответсвующе поле/поля)
Если авто уже завелась, то выводит сообщение:
  - авто такое-то не могу завестись так как уже заведена или
  - авто такое-то не могу ехать так как уже еду
  и т.д.
Автомобиль не может ехать если не заведен двигатель, не может остановиться если не едет и так далее.
Продумать все ограничения и реализовать эти 3 метода с учетом состояния авто.

В MainCar:
  - создать 3 авто
  - все 3 авто завести*/
public class Car {
    String number;
    String colour;
    boolean isStarted;
    boolean isMoving;

    public void printAboutMe() {
        System.out.println("авто с номером " + number
                + " и цветом " + colour);
    }

    public void start() {
        if (isStarted == true) {
            System.out.println("I've already started");
        } else {
            System.out.println("авто с номером " + number + " завелась");
            isStarted = true;
        }
    }

    public void move() {
        if ((isStarted == true)&&(isMoving == false)){
            System.out.println(number + " начала движение ");
            isMoving = true;
        }else{
            System.out.println("I can't move, sorry");
    }}

    public void stop() {
        if(isMoving == true){
        System.out.println(number + " остановилась(с выключением двигателя) ");
        }else{
            System.out.println("I've already stoped");
        }
    }

}



