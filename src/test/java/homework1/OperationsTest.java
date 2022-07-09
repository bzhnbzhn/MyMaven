package homework1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class OperationsTest {

    @Test
    void getA() {
        assertEquals(43, Operations.getA(),"Incorrect result of getA operation");
    }

    @Test
    void getB() {
        assertEquals(1, Operations.getB(),"Incorrect result of getB operation");
    }

    @Test
    void getC() {
        assertEquals(19, Operations.getC(),"Incorrect result of getC operation");
    }

    @Test
    void gedD() {
        assertEquals(13, Operations.getD(),"Incorrect result of getD operation");
    }
}