package homework4;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static homework4.CharCountDictionary.getDictionary;
import static homework4.CollectionWithoutDuplicates.removeDuplicatesFromCollection;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeTask4Test {

    @Test
    void charCountDictionary() {
        assertEquals(Map.of('e', 1, 's', 1, 't', 2), getDictionary("test"));
    }

    @Test
    void noDuplicates() {
        assertEquals(3, removeDuplicatesFromCollection(List.of(1, 1, 2, 3, 3)).size());
    }
}