package lesson1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_Bubbles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 10;
        int[] array = new int[10];
        initiallization(array);
        printArray(array);
        System.out.println();
        bubble(array);

    }
       public static void initiallization(int[]array){
           for(int i = 0; i < array.length; i++){
               array[i] = (int)(Math.random()*10);
           }
       }
        public static void printArray(int[]array){
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
        }

        public static void bubble(int[]array){

            for(int j = 0; j < 9; j++){
                for(int i = 0; i < 9; i++){
                    if(array[i] > array[i + 1]){
                        array[i] = array[i] + array[i+1];
                        array[i+1] = array[i] - array[i + 1];
                        array[i] = array[i] + array[i + 1];
                    }

                }System.out.print(array[j] + " ");
            }
        }


}