package week_1.lesson_3;
import java.util.Scanner;
import java.lang.Math;
/* Написать класс число (hw2.Number), выполняющий следующие операции:
 - получение примитива (метод int get())
 - сложение (метод Number add(Number num))
 - вычитание (метод Number sub(Number num))
 - умножение (метод Number mul(Number num))
 - деление (метод Number div(Number num))
 - возведение в степень (метод Number pow(Number exponent))
 - вычисление факториала (метод Number fact())
 - вычисление остатка от деления (метод Number mod(Number num))
 */
public class jon_2 {

    public static void main(String[] args) {
   //     Int_get();
        Number_add();
        Number_sub();
        Number_mul();
        Number_div();
        Number_pow();
        Number_fact();
        Number_mod();
    }

  /*  public static void Int_get(){
        Scanner scan = new Scanner(System.in);
        double Number1 = (double)scan.nextInt();
        double Number2 = (double)scan.nextInt();
        System.out.println(Number1);
        System.out.println(Number2);

    }*/

    public static void  Number_add(){
            Scanner scan = new Scanner(System.in);
            double Number1 = scan.nextDouble();
            double Number2 = scan.nextDouble();
            double add = Number1 + Number2;
            System.out.println("sum " + add);
            }

    public static void Number_sub(){
        Scanner scan = new Scanner(System.in);
        double Number1 = scan.nextDouble();
        double Number2 = scan.nextDouble();
        double sub = Number1 - Number2;
        System.out.println("subtraction " + sub);
    }
    public static void Number_mul() {
        Scanner scan = new Scanner(System.in);
        double Number1 = scan.nextDouble();
        double Number2 = scan.nextDouble();
        double mul = Number1 * Number2;
        System.out.println("multiple " + mul);
    }
    public  static  void  Number_div(){
        Scanner scan = new Scanner(System.in);
        double Number1 = scan.nextDouble();
        double Number2 = scan.nextDouble();
        double div = Number1 / Number2;
        System.out.println("division " + div);
    }
    public static void Number_pow(){
        Scanner scan = new Scanner(System.in);
        double Number1 = scan.nextDouble();
        double Number2 = scan.nextDouble();
        double pow = Math.pow(Number1, Number2);
        System.out.println("power " + pow);
    }
    public static void Number_fact(){
        Scanner scan = new Scanner(System.in);
        double Number1 = (int)scan.nextDouble();
        if (Number1 <= 0){
            System.out.println("I have not answer");
        }else {
            for(int i = 1; i <= Number1; i++) {
              double  fact = (int) Number1 * i;
                System.out.print("factorial " + fact);
            }
            System.out.println();
        }
    }
    public static void Number_mod(){
        Scanner scan = new Scanner(System.in);
        double Number1 = scan.nextDouble();
        double Number2 = scan.nextDouble();
        double mod = Number1%Number2;
        System.out.println("residue " + mod);
    }
}
