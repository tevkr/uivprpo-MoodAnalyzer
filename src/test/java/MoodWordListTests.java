import org.example.MoodWordList;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class MoodWordListTests {
    @Test
    public void testAddPositiveWord() {
        String newPositiveWord = "позитив";
        MoodWordList wordList = new MoodWordList();
        wordList.addPositiveWord(newPositiveWord);

        List<String> positiveWords = wordList.getPositiveWords();

        int expectedSize = 1;

        assertEquals(expectedSize, wordList.getPositiveWords().size());
        assumeTrue(positiveWords.contains(newPositiveWord));
    }
}
