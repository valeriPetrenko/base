package week_1.lesson_1;
import java.util.Scanner;

//Task1. Ввести с консоли строку с символами и пробелами. Посчитать количество слов в предлождении.

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        kolichestvoSlov(s1);
    }
        public static void kolichestvoSlov(String s1){
            char a = ' ';
            int m = 1;
            for(int i = 0; i < s1.length(); i++){
                if(s1.charAt(i) == a){
                    m++;
                }
            }
            System.out.println(m);
        }
    }


