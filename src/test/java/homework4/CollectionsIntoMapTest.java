package homework4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import static homework4.CollectionsIntoMap.convertCollectionsIntoMap;
import static homework4.CollectionsIntoMap.convertCollectionsIntoMapException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CollectionsIntoMapTest {

    ArrayList<Integer> firstFiveDimensionalList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    ArrayList<Integer> secondFiveDimensionalList = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
    ArrayList<Integer> secondFourDimensionalList = new ArrayList<>(Arrays.asList(6, 7, 8, 9));
    ArrayList<Integer> secondSixDimensionalList = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10, 11));

    @Test
    void twoCollectionsSameSize() {
        assertEquals(Map.of(1, 6, 2, 7, 3, 8, 4, 9, 5, 10), convertCollectionsIntoMap(firstFiveDimensionalList, secondFiveDimensionalList));
    }

    @Test
    void firstCollectionSizeGreaterThanSecond() {
        assertEquals(Map.of(1, 6, 2, 7, 3, 8, 4, 9, 5, "null"), convertCollectionsIntoMap(firstFiveDimensionalList, secondFourDimensionalList));
    }

    @Test
    void secondCollectionSizeGreaterThanFirst() {
        assertEquals(Map.of(1, 6, 2, 7, 3, 8, 4, 9, 5, 10), convertCollectionsIntoMap(firstFiveDimensionalList, secondSixDimensionalList));
    }

    @Test
    void firstCollectionSizeGreaterThanSecondWithException() throws Exception {
        assertThrows(new Exception("Key is not enough for the Map"), convertCollectionsIntoMapException(firstFiveDimensionalList, secondFourDimensionalList));
    }

    @Test
    void secondCollectionSizeGreaterThanFirstWithException() throws Exception {
        assertThrows(new Exception("Key is not enough for the Map"), convertCollectionsIntoMapException(firstFiveDimensionalList, secondSixDimensionalList));
    }
}