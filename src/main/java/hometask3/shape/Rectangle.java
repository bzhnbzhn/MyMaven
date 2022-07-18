package hometask3.shape;

public class Rectangle extends Rectangular {
    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    int getSquare() {
        return a * b;
    }

    public static void main(String[] args) {
        Rectangle rectangular = new Rectangle(10,10);
        System.out.println("The square square is " + rectangular.getSquare());
    }
}

