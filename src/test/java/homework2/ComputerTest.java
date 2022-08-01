package homework2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputerTest {

    @Test
    void getScreenSize() {
        Computer lenovoComputer = new Computer("Lenovo", 21);
        Computer workComputer = new Computer("MacBook", 15, 5, "laptop");
        Computer personalComputer = new Computer("Samsung", 2);
        assertEquals(21, lenovoComputer.getScreenSize(), "Incorrect screen size");
        assertEquals(5, workComputer.getNumberOfCores(), "Incorrect number of cores");
        assertEquals(2, personalComputer.getScreenSize(), "Incorrect screen size");
    }
}