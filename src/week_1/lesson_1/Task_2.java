package week_1.lesson_1;
import java.util.Scanner;
//Task2. Написать метод, принимающий в качестве параметра строку. Возвращающий перевернутую строку.

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
    PerevernutayaStroka(s);
    }
    public static void PerevernutayaStroka(String s){
        String s1 = " ";
        for(int i = 0; i < s.length(); i++){
             s1 = s.charAt(i) + s1;}
        System.out.print(s1);
    }
}
