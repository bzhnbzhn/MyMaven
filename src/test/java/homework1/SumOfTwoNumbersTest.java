package homework1;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SumOfTwoNumbersTest {
    @Test
    @DisplayName("Add two numbers")
    void sum() {
        assertEquals(110, SumOfTwoNumbers.sum(74, 36), "Incorrect result of sum operation");
    }

}