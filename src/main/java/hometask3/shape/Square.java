package hometask3.shape;

public class Square extends Rectangular {
    public Square(int a) {
        super(a);
    }

    @Override
    int getSquare() {
        return a * a;
    }

    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println("The square square is " + square.getSquare());
    }
}
