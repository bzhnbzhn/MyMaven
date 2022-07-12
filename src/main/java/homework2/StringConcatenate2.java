package homework2;

public class StringConcatenate2 {

    public static String concatenateAndRemoveP(String firstString, String secondString) {
        String concatenate = firstString.concat(secondString);
        String removePLetter = concatenate.replaceAll("([p,P])", "");
        return removePLetter;
    }
}