package homework2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringConcatenateTest {

    @Test
    void characterPRemove() {
        assertEquals("H Exercises andython Exercises", StringConcatenate.concatenateAndRemove("PHP Exercises and", "Python Exercises"));
    }
}