package homework2;

public class StringConcatenate {

    public static String concatenateAndRemove(String firstString, String secondString) {
        return firstString.concat(secondString).replaceAll("([p,P])", "");
    }
}