package homework4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static homework4.CharCountDictionary.getDictionary;
import static homework4.CollectionWithoutDuplicates.removeDuplicatesFromCollection;
import static homework4.CollectionsIntoMap.collectionsIntoMapA;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeTask4Test {

    ArrayList<Integer> alOne = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
    ArrayList<Integer> alTwo = new ArrayList<Integer>(Arrays.asList(6,7,8,9,10));
    ArrayList<Integer> alThree = new ArrayList<Integer>(Arrays.asList(6,7,8,9));
    ArrayList<Integer> alFour = new ArrayList<Integer>(Arrays.asList(6,7,8,9,10,11));

    @Test
    void charCountDictionary() {
        assertEquals(Map.of('e', 1, 's', 1, 't', 2), getDictionary("test"));
    }

    @Test
    void noDuplicates() {
        assertEquals(3, removeDuplicatesFromCollection(List.of(1, 1, 2, 3, 3)).size());
    }

    @Test
    void collectionsIntoMapOriginalCase() {
        assertEquals(Map.of(1,6,2,7,3,8,4,9,5,10), collectionsIntoMapA(alOne,alTwo));
    }

    @Test
    void collectionsIntoMapCaseA() {
        assertEquals(Map.of(1,6,2,7,3,8,4,9,5,"null"), collectionsIntoMapA(alOne,alThree));
    }

    @Test
    void collectionsIntoMapCase1() {
        assertEquals(Map.of(1,6,2,7,3,8,4,9,5,10), collectionsIntoMapA(alOne,alFour));
    }
}