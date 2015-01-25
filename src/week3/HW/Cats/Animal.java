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
public class Animal {
    String name;
    int bellyfull = 0;

    public Animal(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }

    public void eat(int amoung) {
        bellyfull ++;
    }


}
