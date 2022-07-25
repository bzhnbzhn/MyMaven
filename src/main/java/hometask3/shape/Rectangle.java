package hometask3.shape;

public class Rectangle extends Rectangular {
    public Rectangle(int width, int height) {
        super(width, height);
    }

    public static void main(String[] args) {
        Rectangle rectangular = new Rectangle(10,10);
        System.out.println("The square square is " + rectangular.getSquare());
    }
}

