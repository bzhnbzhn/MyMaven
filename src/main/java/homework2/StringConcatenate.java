package homework2;

public class StringConcatenate {

    public static String concatenate(String firstString, String secondString) {
        return firstString + secondString;
    }

    public static String characterPRemove(String concatenatedString) {
        char[] array = concatenatedString.toCharArray();
        StringBuilder result = new StringBuilder();
        int len = concatenatedString.length() - 1;

        for (int i = 0; i <= len; i++) {
            char letter = array[i];
            boolean charIsCapital = Character.isUpperCase(letter);

            if (charIsCapital) {
                if (letter == 'P') {
                    result.append("");
                } else {
                    result.append(letter);
                }
            } else {
                if (letter == 'p') {
                    result.append("");
                } else {
                    result.append(letter);
                }
            }
        }
        return result.toString();
    }
}