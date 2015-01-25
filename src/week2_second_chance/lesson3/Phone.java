package week2_second_chance.lesson3;

import java.util.Scanner;

public class Phone {
    private static String[] numbers = new String[10];
    private String myNumber;
    private static int counter = 0;

    public Phone(String myNumber) {
        this.myNumber = myNumber;
        numbers[counter] = myNumber;
        counter++;
    }

    public boolean isNumberExist(String number) {
        for (int i = 0; i < counter; i++) {
            if (numbers[i].equals(number)) {
                return true;
            }
        }
        return false;
    }

    public void call(String number) {
        System.out.print("Phone " + myNumber + " calls to " + number);
    }

    public void sendSMS(String number, String text) {
        if (isNumberExist(number) == true) {
            System.out.println("Phone " + number + " is receiving sms " + text);
        } else {
            System.out.println("Number doesn't exist");
        }
    }


}
