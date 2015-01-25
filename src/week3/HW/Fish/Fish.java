package week3.HW.Fish;

/*Создать класс Рыба на основе класса "Продукт в супермаркете".
Классы Fish и Product.
Рыба должна уметь:
- Вывести свою цену, метод void printPrice()
- Вывести срок хранения, метод void printStoragePeriod()
- Проплыть, метод void swim()
- Проглотить другую рыбу, метод void cannibalism(Fish fish)
- Вывести свой штрихкод и цену, метод void printBarAndPrice()*/
public class Fish extends Product {


    public Fish(double price) {
        super(price);
    }

    public void swim() {
        System.out.println("I can swim!");
    }


    public void cannibalism(Fish fish) {
        System.out.println("Cannibalism");
    }

}

