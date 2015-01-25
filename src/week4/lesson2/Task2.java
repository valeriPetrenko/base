package week4.lesson2;

import java.util.Scanner;

/*Написать рекурсивный метод принимает параметр от к до 2
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        returnMethod(k);
    }

    public static void returnMethod(int k) {
        if (k == 2) {
            System.out.print(2);
        } else {
            System.out.print(k + " ");
            returnMethod(k - 1);
        }
    }

}
