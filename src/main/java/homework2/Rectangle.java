package homework2;

public class Rectangle {
    private int width;
    private int height;

    int getArea(){
        return width * height;
    }
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
}