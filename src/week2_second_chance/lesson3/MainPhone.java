package week2_second_chance.lesson3;


public class MainPhone {
    public static void main(String[] args) {

        Phone phone1 = new Phone("1111");
        Phone phone2 = new Phone("2222");

        phone2.call("1111");
        System.out.println();
        phone1.sendSMS("2222", "Hello Dolly!");

    }

}

