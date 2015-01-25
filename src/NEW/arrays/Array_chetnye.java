package NEW.arrays;

/*Создайте массив из всех чётных чисел от 2 до 30 и выведите элементы массива на экран.
 */
public class Array_chetnye {
    public static void main(String[] args) {
        int[] array = new int[16];
        for (int i = 1; i < array.length; i++) {
            array[i] = i+i;
            System.out.print(array[i] + " ");

        }
    }
}
