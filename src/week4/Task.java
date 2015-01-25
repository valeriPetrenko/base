package week4;

import java.util.Scanner;

/*Степень
 */
public class Task {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
       // int k = scan.nextInt();
       // power(n, k);
        System.out.println(power(2, 10));
    }
    public static int power(int n, int k){
        if (k == 1) {
            return n;
        } else {
            return n * power(n, k - 1);
        }
    }
}