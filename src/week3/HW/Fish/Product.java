package week3.HW.Fish;
/*Создать класс Рыба на основе класса "Продукт в супермаркете".
Классы Fish и Product.
Рыба должна уметь:
- Вывести свою цену, метод void printPrice()
- Вывести срок хранения, метод void printStoragePeriod()
- Проплыть, метод void swim()
- Проглотить другую рыбу, метод void cannibalism(Fish fish)
- Вывести свой штрихкод и цену, метод void printBarAndPrice()*/
public class Product {
    double price;
    int bar;
    int storage;

    public Product(double price){
        this.price = price;
    }

    public void printBarAndPrice(){
        System.out.println(bar + price);
    }
    public void printStoragePeriod() {
        System.out.println(storage);
    }
    public void printPrize() {
        System.out.println(price);
    }
}
