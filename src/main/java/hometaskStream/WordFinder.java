package hometaskStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WordFinder {

    public static List<String> findWordsByLetter(String text, String letter) {
        List<String> wordsArray = new ArrayList<>(Arrays.asList(text.toLowerCase().split(" ")));
        Function<String, Predicate<String>> createCharTest = findChar -> (str -> str.startsWith(findChar));
        List<String> longWords = wordsArray
                .stream()
                .filter(createCharTest.apply(letter.toLowerCase()))
                .collect(Collectors.toList());
        return longWords;
    }
}