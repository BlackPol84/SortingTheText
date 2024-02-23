package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceFile {

    public List<String> readingFromFile(String fileName) {

        List<String> lines = new ArrayList<>();

        try (InputStream inputStream = ServiceFile.class.getClassLoader().getResourceAsStream(fileName)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;

            while((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    public void recordFile(List<String> line) {

        try(FileWriter fileWriter = new FileWriter("ModifiedFile.txt",true)) {

            StringBuilder stringWithLength = new StringBuilder();

            for(String str : line) {
                stringWithLength.append(str).append(" ").append(str.length()).append("\n");
                fileWriter.write(stringWithLength.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
