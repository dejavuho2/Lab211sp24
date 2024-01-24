package counter.model;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Model {

    private Map<Character, Integer> charCounter = new HashMap<>();
    private Map<String, Integer> wordCounter = new HashMap<>();

    public void analyze(String content) {
        for (char ch : content.toCharArray()) {
            if (Character.isSpaceChar(ch))
                continue;
            charCounter.put(ch, charCounter.getOrDefault(ch, 0) + 1);
        }

        StringTokenizer tokenizer = new StringTokenizer(content);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            wordCounter.put(token, wordCounter.getOrDefault(token, 0) + 1);
        }
    }

    public Map<Character, Integer> getCharCounter() {
        return charCounter;
    }

    public Map<String, Integer> getWordCounter() {
        return wordCounter;
    }
}
