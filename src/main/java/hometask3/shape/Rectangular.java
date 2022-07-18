package hometask3.shape;

public abstract class Rectangular implements Shape{
    int a;
    int b;

    public Rectangular(int a) {
        this.a = a;
    }

    public Rectangular(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract int getSquare();
}
