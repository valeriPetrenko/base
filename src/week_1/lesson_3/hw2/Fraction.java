package week_1.lesson_3.hw2;

/*Написать класс дробь (hw2.Fraction), выполняющий следующие действия:
	- сложение дробей (метод Fraction add(Fraction frac))
	- вычитание (метод Fraction sub(Fraction frac))
	- умножение (метод Fraction mul(Fraction frac))
	- деление (метод Fraction div(Fraction frac))
	- приведение к строке(метод String toString())
	- вывод (метод void print())
 */
public class Fraction {
    private double fraction = 0;

    public Fraction(double fraction){
       this.fraction = fraction;
    }

    public Fraction add(Fraction frac){
        return new Fraction(this.fraction + frac.fraction);
    }
    public Fraction sub(Fraction frac){
        return new Fraction(this.fraction - frac.fraction);
    }
    public Fraction mul(Fraction frac){
        return new Fraction(this.fraction * frac.fraction);
    }
    public Fraction div(Fraction frac){
        return new Fraction(this.fraction / frac.fraction);
    }
    public String toString(){
        return Double.toString(fraction);
    }
    public void print(){
        System.out.println(fraction);
    }



}
