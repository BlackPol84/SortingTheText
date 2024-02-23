package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TextHandler {

    public List<String> alphabeticalOrder(List<String> line) {

        Collections.sort(line);
        return line;
    }

    public List<String> placementByNumberOfCharacters(List<String> line) {

        line.sort(Comparator.comparingInt(String::length));
        return line;
    }

    public List<String> placementBySecondWord(List<String> line) {

        line.sort((str1, str2) -> {
            String[] words1 = str1.split(" ");
            String[] words2 = str2.split(" ");

            return words1[1].compareTo(words2[1]);
        });
        return line;
    }
}
