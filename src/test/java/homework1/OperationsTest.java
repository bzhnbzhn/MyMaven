package homework1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void aOperations() {
        assertEquals(43, Operations.aOperations());
    }

    @Test
    void bOperations() {
        assertEquals(1, Operations.bOperations());
    }

    @Test
    void cOperations() {
        assertEquals(19, Operations.cOperations());
    }

    @Test
    void dOperations() {
        assertEquals(13, Operations.dOperations());
    }
}