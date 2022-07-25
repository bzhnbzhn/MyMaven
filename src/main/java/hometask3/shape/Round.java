package hometask3.shape;

abstract class Round implements Shape {

    int width;
    int height;

    public Round(){

    }

    public Round(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getSquare(){
        return Math.PI * height * width;
    }
}
