package week3.lesson1;

public class Triangle extends Figure {
    private double sideB;

    public Triangle(double xPos, double yPos,double sideA, double sideB){
        super(xPos, yPos, sideA);
        this.sideB = sideB;
    }
    @Override
    public double getPerimetre(){
        double perimetre = getSideA() + sideB + Math.sqrt(getSideA()*getSideA() + sideB*sideB);
            return perimetre;
        }
    }

