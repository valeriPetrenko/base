package week_1.lesson_1;
import java.util.Scanner;
//Task4. Написать программу состоящую из методов:
          //- метод, считывает с консоли строку и возвращает ее
         //  - метод, считывает с консоли символ и возращает его
        //- метод, принимает строку и символ, делает поиск символа в строке, возвращает индекс последнего вхождения символа в строке
       // - главный метод, только вызовы методов.
public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char a = scan.findInLine(".").charAt(0);
        vozvratStroki(s);
        vozvratSimvola(a);
        poiskSimvola(a, s);
    }

    private static void poiskSimvola(int a, String s) {
       //  s = scan.nextLine();
       // a = scan.nextInt();
        int i = s.indexOf(a);
        System.out.println(i);
    }

    public static void vozvratStroki(String s){
        System.out.println(s);
    }
    public static void vozvratSimvola(char a){
        System.out.println(a);
    }


}
