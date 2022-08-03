package homework4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static homework4.CollectionsIntoMap.convertCollectionsIntoMap;
import static homework4.CollectionsIntoMap.convertCollectionsIntoMapException;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectionsIntoMapTest {

    List<Integer> firstFiveDimensionalList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    List<Integer> secondFiveDimensionalList = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
    List<Integer> secondFourDimensionalList = new ArrayList<>(Arrays.asList(6, 7, 8, 9));
    List<Integer> secondSixDimensionalList = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10, 11));

    @Test
    void twoCollectionsSameSize() {
        assertEquals(
                Map.of(1, 6, 2, 7, 3, 8, 4, 9, 5, 10),
                convertCollectionsIntoMap(firstFiveDimensionalList, secondFiveDimensionalList));
    }

    @Test
    void firstCollectionSizeGreaterThanSecond() {
        Map<Integer, Integer> expectedMap = new HashMap<>();
        expectedMap.put(1, 6);
        expectedMap.put(2, 7);
        expectedMap.put(3, 8);
        expectedMap.put(4, 9);
        expectedMap.put(5, null);
        assertEquals(expectedMap, convertCollectionsIntoMap(firstFiveDimensionalList, secondFourDimensionalList));
    }

    @Test
    void secondCollectionSizeGreaterThanFirst() {
        assertEquals(
                Map.of(1, 6, 2, 7, 3, 8, 4, 9, 5, 10),
                convertCollectionsIntoMap(firstFiveDimensionalList, secondSixDimensionalList));
    }

    @Test
    void convertCollectionsIntoMapExceptionWithSameSize() {
        assertEquals(
                Map.of(1, 6, 2, 7, 3, 8, 4, 9, 5, 10),
                convertCollectionsIntoMapException(firstFiveDimensionalList, secondFiveDimensionalList));
    }

    @Test
    void firstCollectionSizeGreaterThanSecondWithException() {
        Exception exception = Assertions.assertThrows(
                Exception.class,
                () -> convertCollectionsIntoMapException(firstFiveDimensionalList, secondFourDimensionalList),
                "Exception for K>V case wasn't thrown"
        );
        Assertions.assertEquals("Value is not enough for the Map", exception.getMessage(), "Incorrect Exception message");
    }

    @Test
    void secondCollectionSizeGreaterThanFirstWithException() {
        Exception exception = Assertions.assertThrows(
                Exception.class,
                () -> convertCollectionsIntoMapException(firstFiveDimensionalList, secondSixDimensionalList),
                "Exception for K<V case wasn't thrown"
        );
        Assertions.assertEquals("Key is not enough for the Map", exception.getMessage(), "Incorrect Exception message");
    }
}