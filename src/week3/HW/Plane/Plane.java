package week3.HW.Plane;
/* Создать класс Самолет на основе класса Крыло.
 Классы Plane и Wing.
 Самолет должен уметь:
 - Взлетать (это возможно если в обоих крыльях достаточно топлива для взлета,
     которое тратится при взлете, метод void takeoff())
 - Задавать маршрут (маршрут состоит из последовательности координат, метод void selectRoute(int[][] coordinates))
 - Вывести на экран маршрут, метод void printRoute()*/
public class Plane extends Wing {

    public Plane(int toplivo) {
        super(toplivo);
    }

    public void printRoute(){
        System.out.println("my route");
    }
}
