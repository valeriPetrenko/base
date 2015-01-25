package week4.HW;

/*Написать собственную реализацию динамического массива MyArrayList,
содержащего целые числа. Реализовать следующие методы:
+ Добавление элемента в конец списка, void add(int value)
+ Получение элемента по индексу, int get(int index)
+ Замена элемента, boolean set(int index, int value)
+ Вставка элемента, boolean add(int index, int value)
+ Поиск элемента, int indexOf(int value)
+ Получение размера списка, int size()
+ Удаление элемента по индексу, int remove(int index)
*/
public class MyArrayList {
    private int[] list;
    int size = 0;

    public MyArrayList() {
        list = new int[0];
    }

    private boolean ensureCapacity() {
        return size >= (0.9 * list.length);
    }

    public void add(int value) {
        if (ensureCapacity()) {
            int[] newList = new int[2 * list.length];
            System.arraycopy(list, 0, newList, 0, size);
//            for(int i = 0; i < size; i++){
//                newList[i] = list[i];
//            }
//
            list = newList;
        }
        list[size++] = value;
    }

    public int get(int index) {
        return list[index];
    }

    public int remove(int index) {
        int result = list[index];
        System.arraycopy(list, index + 1, list, index, size-- - index - 1);
        return result;
    }

    public int size() {
        return list.length;
    }

    public int indexOf(int value) {
        int i;
        for (i = 0; i < list.length; i++) {
            if (list[i] == value) {
            } else {
                return -1;
            }
        }
        return i;
    }

    public boolean add(int index, int value) {
        if (index <= list.length) {
            int[] newList = new int[list.length + 1];
            System.arraycopy(list, index, newList, index + 1, newList.length - 1 - index);

            newList[index] = value;
            list = newList;
            return true;

        } else {
            return false;
        }
    }

    public boolean set(int index, int value) {

        if (index <= list.length) {
            int[] newList = new int[list.length];
            System.arraycopy(list, index, newList, index, newList.length);
            newList[index] = value;
            newList = list;
            return true;
        } else {
            return false;
        }
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

}
