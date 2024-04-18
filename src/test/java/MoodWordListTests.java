import org.example.MoodWordList;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

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
