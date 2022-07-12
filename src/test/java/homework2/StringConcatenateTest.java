package homework2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringConcatenateTest {

    @Test
    void concatenate() {
        assertEquals("PHP Exercises andPython Exercises", StringConcatenate.concatenate("PHP Exercises and","Python Exercises"));
    }

    @Test
    void characterPRemove() {
        assertEquals("H Exercises andython Exercises", StringConcatenate.characterPRemove("PHP Exercises andPython Exercises"));
    }

    @Test
    void test() {
        assertEquals("H Exercises andython Exercises", StringConcatenate2.concatenateAndRemoveP("PHP Exercises and","Python Exercises"));
    }
}