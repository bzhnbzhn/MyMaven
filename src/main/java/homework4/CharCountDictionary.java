package homework4;

import java.util.Map;
import java.util.TreeMap;

public class CharCountDictionary {

    public static Map<Character, Integer> getDictionary(String text) {
        Map<Character, Integer> map = new TreeMap<>();
        for (char letter : text.toCharArray()) {
            map.merge(letter, 1, Integer::sum);
        }
        return map;
    }
}

