package hometask3.shape;

public class Circle extends Round {

    public Circle(int radius) {
        super(radius);
    }

    @Override
    double getSquare() {
        return Math.PI*Math.pow(radius,2);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("The circle square is " + circle.getSquare());
    }

}