package homework1;

import java.util.*;

public class DuplicateInArray {

    public static Set<Integer> findDuplicate(int[] array) {

        HashSet<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicates.add(array[i]);
                }
            }
        }
        System.out.println("The duplicate value in array " + Arrays.toString(array) + " is " + duplicates);
        return duplicates;
    }
}
