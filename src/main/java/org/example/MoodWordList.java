package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoodWordList {
    private List<String> positiveWords;
    private List<String> negativeWords;
    public MoodWordList() {
        positiveWords = new ArrayList<>();
        negativeWords = new ArrayList<>();
    }
    public void addPositiveWord(String word) {
        positiveWords.add(word);
    }
    public void addNegativeWord(String word) {
        negativeWords.add(word);
    }
    public List<String> getPositiveWords() {
        return Collections.unmodifiableList(positiveWords);
    }
    public List<String> getNegativeWords() {
        return Collections.unmodifiableList(negativeWords);
    }
    // Инициализация списка стандартными значениями
    public void loadDefaultWords() {
        positiveWords.addAll(Arrays.asList("счастье", "радость", "удовольствие", "любовь", "восторг"));
        negativeWords.addAll(Arrays.asList("грусть", "печаль", "разочарование", "беда", "боль"));
    }
}