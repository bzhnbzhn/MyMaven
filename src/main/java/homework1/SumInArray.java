package homework1;

import java.util.Arrays;

public class SumInArray {

    public static int sum(int[] array) {
        int result = 0;
        for (int element : array) {
            result += element;
        }
        System.out.println("The sum values of an array " + Arrays.toString(array) + " is " + result);
        return result;
    }
}