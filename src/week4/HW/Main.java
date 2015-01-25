package week4.HW;

public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();


        list.add(13);
        list.add(8);
        list.add(0);
        list.add(-1);
        list.add(5);
        list.add(8);
        list.add(4);
        list.add(33);
        list.add(51);
        list.add(12);
        list.add(-6);
        list.add(90);
        list.add(38);
        list.add(46);

        list.print();

        list.remove(2);
        
        list.print();

        list.size();
    }

}
