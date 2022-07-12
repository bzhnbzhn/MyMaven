package homework2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputerTest {

    @Test
    void getScreenSize() {
        Computer lenovoComputer = new Computer("Lenovo", 21);
        assertEquals(21, lenovoComputer.getScreenSize());
    }
}