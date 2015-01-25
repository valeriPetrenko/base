package week3.lesson1;

/* Написать класс BlockConditioners, Conditioner и MainConditioners.
В блоке управления 10 кондиционеров.
Делегирование.
Класс Conditioner: int temperature, setTemperature(int k), turnOn(),turnOff(), getTemperature(),?? getTurn()
Класс MainConditioner: консольное меню, где вызываются только методы объекта  BlockConditioners.
Консольное меню:
1. Отобразить состояние всех кондиционеров
2. Включить кондиционер с индексом...
3. Выключить кондиционер с индексом...
4. Установить температуру для кондиционера с индексом...
5. Выход.
 */
public class Conditioner {
    private int temperature;
    private int turn = 0;

    public int getTemperature(){
        return temperature;
    }
    public void setTemperature(int k){
        temperature = k;
    }
    public void turnOn(){
        turn = 1;
    }
    public void turnOff(){
        turn = 0;
    }
}
