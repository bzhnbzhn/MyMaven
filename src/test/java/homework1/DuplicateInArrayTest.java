package homework1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.testng.Assert.assertEquals;

class DuplicateInArrayTest {

    @Test
    void duplicateInArray() {
        assertEquals(new HashSet<>(Arrays.asList(6, 12)), DuplicateInArray.findDuplicate(new int[]{5, 6, 7, 12, -5, 32, 43, 6, 6, 12}), "Incorrect duplicate/s was found");
    }
}