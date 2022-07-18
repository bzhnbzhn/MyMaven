package homework2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberHolderTest {

    @Test
    public void testConstructor(){
        NumberHolder box = new NumberHolder(10,10.1F);
        NumberHolder plate = new NumberHolder(5,5.1F);
        NumberHolder bucket = new NumberHolder();

        assertEquals(10, box.getAnInt(),"Incorrect anInt variable");
        assertEquals(5.1F, plate.getaFloat(),"Incorrect aFloat variable");

        bucket.setAnInt(10);
        assertEquals(10,bucket.getAnInt(),"Incorrect anInt variable");
    }
}