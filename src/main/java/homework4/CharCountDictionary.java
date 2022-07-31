package homework4;

import java.util.Map;
import java.util.TreeMap;

public class CharCountDictionary {

    public static Map<Character, Integer> getDictionary(String text) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        char[] letters = text.toCharArray();
        for (char letter : letters) {
            map.merge(letter, 1, Integer::sum);
        }
        return map;
    }
}

