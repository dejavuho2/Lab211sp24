package Model;

import java.util.HashMap;

public class DictionaryModel {
    private final HashMap<String, String> dictionary;

    public DictionaryModel() {
        dictionary = new HashMap<>();
    }

    public void addWord(String english, String vietnamese) {
        dictionary.put(english, vietnamese);
    }

    public void deleteWord(String english) {
        dictionary.remove(english);
    }

    public String translate(String english) {
        return dictionary.getOrDefault(english, "Not found in data");
    }

    public boolean isKeywordExist(String english) {
        return dictionary.containsKey(english);
    }
}
