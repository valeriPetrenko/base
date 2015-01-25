package week4.lesson2;

import java.util.Scanner;

/* Написать рекурсивный метод, проверяющий является ли число простым.
*/
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int k = 2;
        prostoe(m, k);

    }

    public static int prostoe(int m, int k) {
        if (m < k) {
            if (m % k != 0) {
                System.out.print("not simple ");
                prostoe(m, k);
            }
            k++;
        }
        return 0;
    }
}