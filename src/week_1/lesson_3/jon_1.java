package week_1.lesson_3;

import java.util.Scanner;

/*Пользователь вводит высоту и ширину двумерного массива (матрицы). Заполнить матрицу случайными числами [0..9] и вывести на экран.
       При вводе неверных размеров массива, выдавать сообщение "Не верный размер массива" и вызодить из программы.
       Перед вводом значений НЕ нужно пользователю выдавать сообщений, типа: "Введите ширину".
       Пример:
       3
       4
       1234
       5678*/
public class jon_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        int[][] array = new int[h][w];
        if ((h <= 0) || (w <= 0)) {
            System.out.print("Не верный размер массива");
        } else {
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    array[i][j] = (int) (10 * Math.random());
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }

        }

    }
}