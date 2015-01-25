package week4.lesson2;
import java.util.Scanner;
/* Написать метод, который выводит n-ный член последовательности Фибоначчи
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        fibonachi(n);
        System.out.println(fibonachi(n-1));
    }
public static int fibonachi(int n){
    if (n == 0)
        return 0;
    if( n == 1)
        return 1;
    return fibonachi(n - 1) + fibonachi(n - 2);
}
}
