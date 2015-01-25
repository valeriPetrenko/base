package week4.lesson2;

import java.util.Scanner;

/*писать рекурсивный метод принимает параметр  оn 2 до к */
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        returnMethod(k);

    }

    private static int n = 2;

    public static void returnMethod(int k) {
        if (n == k) {
            System.out.print(k);
        } else {
            System.out.print(n++ + " ");
            returnMethod(k);
        }
    }
}
