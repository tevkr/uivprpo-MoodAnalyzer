package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    public static String readFromFile(String filePath) throws IOException {
        return Files.readString(Paths.get(filePath));
    }
}