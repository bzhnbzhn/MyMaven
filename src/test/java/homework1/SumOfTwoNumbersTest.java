package homework1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfTwoNumbersTest {
    @Test
    void sum() {
        assertEquals(110, SumOfTwoNumbers.sum(74, 36), "Incorrect result of sum operation");
    }

}