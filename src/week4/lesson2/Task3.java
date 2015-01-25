package week4.lesson2;
import java.util.Scanner;

/* Task3. Написать метод, который считает факториал для числа n.*/

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
        return n * factorial(n-1);
        }
    }
}