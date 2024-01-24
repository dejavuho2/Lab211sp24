package counter.view;

import java.util.Map;

public class View {

    public void display(Map<Character, Integer> charCounter, Map<String, Integer> wordCounter) {
        System.out.println("Word Counts: " + wordCounter);
        System.out.println("Character Counts: " + charCounter);
    }
}
