package week3.HW.Plane;
/* Создать класс Самолет на основе класса Крыло.
 Классы Plane и Wing.
 Самолет должен уметь:
 - Взлетать (это возможно если в обоих крыльях достаточно топлива для взлета, которое тратится при взлете, метод void takeoff())
 - Задавать маршрут (маршрут состоит из последовательности координат, метод void selectRoute(int[][] coordinates))
 - Вывести на экран маршрут, метод void printRoute()*/
public class Wing {
    int toplivo;
    int[][] coordinates;

    public Wing(int toplivo){
        this.toplivo = toplivo;
    }

    public void takeoff(){
        if (toplivo > 1){
            System.out.println("Start to fly");
        }else{
            System.out.println("cannot fly");
        }
    }
    public void selectRoute(int[][] coordinates){
    }

}
