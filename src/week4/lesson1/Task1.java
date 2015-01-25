package week4.lesson1;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
/*
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\prog");
        File[] files = f1.listFiles();
        System.out.println(Arrays.toString(files));

        for (File t : files) {
            System.out.print(t.getName() + ", ");
        }
        System.out.println();
        System.out.println();

        File f2 = new File(" D:\\Новая папка\\Music");
        if (f2.isDirectory())
            System.out.print("Это директория");
        else
            System.out.println(f2.getCanonicalPath());
        System.out.println(f2.getAbsolutePath());
        System.out.println(File.separatorChar);
        System.out.println();

        File f3 = new File("e://Connectify.Hotspot.PRO.7.1.0.29279");
        if (f3.isDirectory()) System.out.println("Это директория");
        else System.out.println("Это файл");


        if(!f3.exists()) {
            f3.createNewFile();
            System.out.println("Новый файл");
    }
    }

}
