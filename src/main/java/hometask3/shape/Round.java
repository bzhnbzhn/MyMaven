package hometask3.shape;

abstract class Round implements Shape {

    int radius;
    int a;
    int b;


    public Round(int radius) {
        this.radius = radius;
    }

    public Round(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract double getSquare();
}
