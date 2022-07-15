package homework2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {
        assertEquals(100, new Rectangle(10,10).getArea());
    }
}