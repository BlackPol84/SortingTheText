package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ServiceFile serviceFile = new ServiceFile();
        List<String> line = serviceFile.readingFromFile("Text.txt");

        TextHandler textHandler = new TextHandler();

        List<String> line1 = textHandler.alphabeticalOrder(line);
        serviceFile.recordFile(line1);

        List<String> line2 = textHandler.placementByNumberOfCharacters(line);
        serviceFile.recordFile(line2);

        List<String> line3 = textHandler.placementBySecondWord(line);
        serviceFile.recordFile(line3);
    }
}