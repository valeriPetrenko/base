package NEW.arrays;

import java.util.Scanner;

/* Пользователь вводит высоту и ширину двумерного массива (матрицы). Заполнить матрицу случайными числами [0..9] и вывести на экран.
При вводе неверных размеров массива, выдавать сообщение "Не верный размер массива" и вызодить из программы.
Перед вводом значений НЕ нужно пользователю выдавать сообщений, типа: "Введите ширину".
Пример:
3
4
1234
5678
9123*/
public class BaseWeek1_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int m = scan.nextInt();

        int[][] array = new int[k][m];
        if (k < 0 | m < 0) {
            System.out.println("Неверный размер матрицы");
        } else {
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = (int) (10 * Math.random());
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }


        }

    }

}
