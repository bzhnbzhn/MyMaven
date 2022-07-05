package homework1;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

class SumInArrayTest {

    @Test
    void sum() {
        assertEquals(100, SumInArray.sum(new int[]{5, 6, 7, 12, -5, 32, 43}),"Incorrect result of sum in array operation");
    }
}