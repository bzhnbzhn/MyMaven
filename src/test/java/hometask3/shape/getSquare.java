package hometask3.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class getSquare {

    @Test
    void getOvalSquare() {
        assertEquals(31.41592653589793, new Oval(5, 2).getSquare());
    }

    @Test
    void getCircleSquare() {
        assertEquals(314.1592653589793, new Circle(10).getSquare());
    }

    @Test
    void getRectangleSquare() {
        assertEquals(100, new Rectangle(10, 10).getSquare());
    }

    @Test
    void getSquareSquare() {
        assertEquals(25, new Square(5).getSquare());
    }
}