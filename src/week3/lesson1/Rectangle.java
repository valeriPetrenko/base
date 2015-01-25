package week3.lesson1;

    public class Rectangle extends Figure {
        private double sideB;

        public Rectangle(double xPos, double yPos, double sideA, double sideB) {
            super(xPos, yPos, sideA);
            this.sideB = sideB;
        }
        @Override //переопределяем периметр
        public double getPerimetre(){
             double perimetre = 2 * (getSideA() + sideB);
             return perimetre;
        }
        @Override
        public double getSquare(){
            double square = getSideA() * sideB;
            return square;
        }
        }



