package week3.HW.Cats;

/*Создать класс Кошка на основе класса Животное.
Классы Cat и Animal.
Кошка должна уметь:
- Вывести на экран имя, метод void printName()
- Подать голос, метод void say()
- Поднимать шерсть дыбом, метод void riseHair()
- Питаться, метод void eat()
- Орать если ненаелась, метод void yellIfNotGorged()

 */
public class Main {
    public static void main(String[] args) {
        Cat murchik = new Cat("Murchik");

        murchik.riseHair();
        murchik.eat(5);
        murchik.printName();
        murchik.yellIfNotGorged();
    }

}
