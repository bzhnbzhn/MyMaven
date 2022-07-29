package homework4;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionWithoutDuplicates {

    public static <T> Set<T> removeDuplicatesFromCollection(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
