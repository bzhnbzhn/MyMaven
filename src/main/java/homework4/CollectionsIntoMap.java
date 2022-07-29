package homework4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class CollectionsIntoMap {

    public static HashMap<Integer, Integer> collectionsIntoMapB(List<Integer> collection1, List<Integer> collection2) throws Exception {

        HashMap<Integer, Integer> collectionsIntoMap = new HashMap<>();
        if (collection1.size() > collection2.size())
            throw new Exception("Value is not enough for the Map");
        if (collection1.size() < collection2.size())
            throw new Exception("Key is not enough for the Map");
        for (int i = 0; i < collection1.size(); i++) {
            collectionsIntoMap.put(collection1.get(i), collection2.get(i));
        }
        return collectionsIntoMap;
    }

    public static HashMap<Integer, Integer> collectionsIntoMapA(List<Integer> collection1, List<Integer> collection2) {

        HashMap<Integer, Integer> collectionsIntoMap = new HashMap<>();
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

    public static void main(String[] args) {
        ArrayList<Integer> alOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> alTwo = new ArrayList<>(Arrays.asList(6, 7, 8, 9));
        System.out.println(collectionsIntoMapA(alOne, alTwo));
    }
}


