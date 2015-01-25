package NEW.arrays;

/*Создайте массив из 20-ти первых чисел Фибоначчи
 и выведите его на экран. Напоминаем, что первый и второй
 члены последовательности равны единицам, а каждый следующий —
 сумме двух предыдущих.
 */
public class Fibbonachi_20 {
    public static void main(String[] args) {
        int[] array =new int[20];
        array[0] = 0;
        array[1] = 1;

        for(int i = 2; i < array.length; i++){

            array[i] = array[i - 1] + array[i - 2];

            System.out.print(array[i]+ " ");
        }
    }
}
