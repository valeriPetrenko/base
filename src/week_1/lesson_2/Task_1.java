package week_1.lesson_2;
import java.util.Scanner;

//Task2. Написать метод принимающий две строки и возвращающий количество второй строки в первой.

public class Task_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s_1 = scan.nextLine();
        String s_2 = scan.nextLine();
        vozvratKolichestva(s_1, s_2);
    }
     public static void vozvratKolichestva(String s_1, String s_2){
         String s;
         int k = 0;
         for(int i = 0; i < s_1.length() - (s_2.length() - 1); i++){
             s = s_1.substring(i, i + s_2.length());
             if(s.equals(s_2)){
             k++;}
         }
         System.out.println(k);

  }

}

