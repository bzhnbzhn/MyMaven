package hometask3.shape;

public class Square extends Rectangular {
    int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public double getSquare() {
        return width * width;
    }

    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println("The square square is " + square.getSquare());
    }
}
