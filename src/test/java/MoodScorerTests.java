import org.example.MoodScorer;
import org.example.MoodWordList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodScorerTests {
    @Test
    public void testCalculateMoodScore() {
        MoodWordList wordList = new MoodWordList();
        wordList.loadDefaultWords();
        String content = "радость и счастье повсюду";
        int expectedScore = 2; // 2 positive words
        assertEquals(expectedScore, MoodScorer.calculateMoodScore(content, wordList.getPositiveWords(), wordList.getNegativeWords()));
    }
}