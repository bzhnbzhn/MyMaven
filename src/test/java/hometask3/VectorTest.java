package hometask3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    @Test
    void getLength() {
        assertEquals(11.357816691600547,new Vector(2,5,10).getLength(),"Incorrect vector length");
    }

    @Test
    void getScalarMultiplication() {
        assertEquals(23, (Vector.getScalarMultiplication(new Vector(10,10,10), new Vector(1,2,3))));
    }

    @Test
    void printVector(){
        System.out.println(new Vector());
    }

    @Test
    void getRandomVectors(){
        System.out.println(Vector.getRandomVectors(5));
    }
}