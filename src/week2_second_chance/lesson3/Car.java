package week2_second_chance.lesson3;

/**Дополнить класс Car полем String marka(BMW,Audi,VW)
 и соответствующими методами.
 Дополнить класс Car чтобы ог умел считать
 количесвто созданных объектов этого класса (static)
 */
public class Car {
    private String number;
    private String colour;
    private String model;
    private static int CarCounter = 0;

    public void setColour(String colour) {
        if (colour.equals("Black")) this.colour = colour;
        if (colour.equals("Red")) this.colour = colour;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public Car() { //конструктор без параметров
        this("AA 11");
    }

    public Car(String number) {
        this(number, "Black");
    }

    public Car(String number, String colour) {
        this(number, colour, "Audi");
    }

    public Car(String number, String colour, String model) {
        CarCounter++;
        this.number = number;
        this.colour = colour;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
       this.number = number;
    }

    public void setModel(String model) {
       this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getCarCounter() {
        return CarCounter;
    }
}
