package hometask3.shape;

public class Oval extends Round {

    public Oval(int a, int b) {
        super(a, b);
    }

    @Override
    double getSquare() {
        return Math.PI * a * b;
    }

    public static void main(String[] args) {
        Oval oval = new Oval(10, 10);
        System.out.println("The oval square is " + oval.getSquare());
    }
}
