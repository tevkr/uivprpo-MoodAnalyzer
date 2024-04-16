package org.example;

import java.io.IOException;

public class MoodAnalyzer {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\monst\\Desktop\\Пример текста.txt";
        MoodWordList wordList = new MoodWordList();
        wordList.loadDefaultWords(); // Загружаем стандартные слова

        try {
            String content = FileReader.readFromFile(filePath);
            int moodScore = MoodScorer.calculateMoodScore(
                    content,
                    wordList.getPositiveWords(),
                    wordList.getNegativeWords()
            );
            System.out.println("Mood Score: " + moodScore);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}