package hometaskstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordFinder {

    public static List<String> findWordsByLetter(String text, String letter) {
        List<String> wordList = new ArrayList<>(Arrays.asList(text.toLowerCase().split(" ")));
        return wordList
                .stream()
                .filter(word -> word.startsWith(letter.toLowerCase()))
                .collect(Collectors.toList());
    }
}