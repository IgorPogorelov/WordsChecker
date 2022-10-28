import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        String[] words = text.split("\\P{IsAlphabetic}+");
        Set<String> set = new HashSet<>(Arrays.asList(words));
        return set.contains(word);
    }
}
