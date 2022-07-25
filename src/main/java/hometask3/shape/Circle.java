package hometask3.shape;

public class Circle extends Round {
    int height;

    public Circle(int height) {
        this.height = height;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(height, 2);
    }
}