package my.Soft.hello;

/*Вопрос а собеседовании:
Дан код:
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}
Необходимо переписать код так, что бы в нем не было точки с запятой.
*/
public class Hello {
    public static void main(String[] args) {

        System.out.println("Hello world");


        int i, N = 20;
        for (i = 0; i < N; i--) {
            System.out.print("*");
        }


    }
}
