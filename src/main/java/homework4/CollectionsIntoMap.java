package homework4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsIntoMap {

    public static <K, V> Map<K, V> convertCollectionsIntoMapException(List<K> collection1, List<V> collection2) throws Exception {

        HashMap<K, V> collectionsIntoMap = new HashMap<>();
        if (collection1.size() > collection2.size())
            throw new Exception("Value is not enough for the Map");
        if (collection1.size() < collection2.size())
            throw new Exception("Key is not enough for the Map");
        for (int i = 0; i < collection1.size(); i++) {
            collectionsIntoMap.put(collection1.get(i), collection2.get(i));
        }
        return collectionsIntoMap;
    }

    public static <K, V> Map<K, V> convertCollectionsIntoMap(List<K> collection1, List<V> collection2) {
        HashMap<K, V> collectionsIntoMap = new HashMap<>();
        if (collection1.size() > collection2.size()) {
            for (int i = 0; i < collection1.size(); i++) {
                while (i < collection2.size()) {
                    collectionsIntoMap.put(collection1.get(i), collection2.get(i));
                    i++;
                }
                collectionsIntoMap.put(collection1.get(i), null);
            }
        } else {
            for (int i = 0; i < collection1.size(); i++) {
                collectionsIntoMap.put(collection1.get(i), collection2.get(i));
            }
        }
        return collectionsIntoMap;
    }
}


