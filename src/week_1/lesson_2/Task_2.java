package week_1.lesson_2;

import java.util.Scanner;

/*Task3. Шифр Цезаря с ключом например 3.
        Написать метод, который принимает имя файла и шифрует содержимое файла шифром Цезаря.
        Реализовать Шифрование (каждый символ смещается по таблице символов на 3 элемента вправо А в D)
         и Дешифрование (каждый символ смещается по таблице символов на 3 элемента влево E в B)*/

public class Task_2 {
    public static void main(String[] args) {

        int a = (int) 'a';
        int z = (int) 'z';
        System.out.println(a);
        System.out.println(z);
        System.out.println((char) 120);
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);

            if ((int) k > 119) {
                k = (char) (k - 25 + 3);
                System.out.println(k);
            }
        else{
                System.out.print((char) (k + 3));
            }
        }
        returnPrevious(s);
    }

    public static void returnPrevious(String s){
       Scanner scan = new Scanner(System.in);
         s = scan.nextLine();
        for(int i = 0; i < s.length(); i++){
            char k = s.charAt(i);

            if((int)k <= 100){
                k = (char) (k + 25 - 3);
                System.out.println(k);
            }
            else {
                System.out.println((char)(k - 3));
            }
        }
    }

    }

