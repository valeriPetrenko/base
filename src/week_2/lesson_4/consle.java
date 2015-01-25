package week_2.lesson_4;
import java.util.Scanner;

public class consle {
   // public class ConsoleMenuExmple {
      private static
        String[] operationNames =
           {"1. Прийти","2. Уйти","3. Зайти","4. Выйти"};
        public static void printMenu(){
            for(String m:operationNames)
                System.out.println( m );
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            boolean runWhile = true;
            while(runWhile){
                printMenu();
                System.out.println("Выберите операцию:");
                int k = scan.nextInt();
                switch (k){
                    case 1:System.out.println("fucntion Прийти");break;
                    case 2:System.out.println("fucntion Уйти");break;
                    case 3:System.out.println("fucntion Зайти");break;
                    case 4:runWhile = false;
                }
            }
        }
    }

