package homework1;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

class FiveInOneTest {

    @Test
    void sum() {
        assertEquals(149, FiveInOne.sum(125, 24),"Incorrect result of sum operation");
    }

    @Test
    void multiply() {
        assertEquals(3000, FiveInOne.multiply(125, 24),"Incorrect result of multiply operation");
    }

    @Test
    void subtract() {
        assertEquals(101, FiveInOne.subtract(125,24),"Incorrect result of subtract operation");
    }

    @Test
    void divide() {
        assertEquals(5, FiveInOne.divide(125,24),"Incorrect result of divide operation");
    }

    @Test
    void remainder() {
        assertEquals(5, FiveInOne.remainder(125,24),"Incorrect result of remainder operation");
    }
}