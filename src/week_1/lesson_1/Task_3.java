package week_1.lesson_1;
import java.util.Scanner;
//Task3. Написать метод, принимающий в качестве параметра строку.
// Возвращающий перевернутую строку, не
// использующий дополнительной строки.

public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        for(int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(s.length() - 1 - i));
        }

    }
}
