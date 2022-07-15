package homework2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberHolderTest {

    @Test
    public void testConstructor(){
        NumberHolder box = new NumberHolder(10,10.1F);
        NumberHolder plate = new NumberHolder(5,5.1F);
        NumberHolder bucket = new NumberHolder();

        assertEquals(10, box.getAnInt());
        assertEquals(5.1F, plate.getaFloat());

        bucket.setAnInt(10);
        assertEquals(10,bucket.getAnInt());
    }
}