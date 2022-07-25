package hometask3.shape;

public abstract class Rectangular implements Shape {
    int width;
    int height;

    public Rectangular(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangular() {
    }

    public double getSquare() {
        return width * height;
    }
}
