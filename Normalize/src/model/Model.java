
package model;

import java.util.function.Function;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Model {
    public String normalizeText(String text) {
        // Normalization logic
        text = text.trim();
        text = capitalizeFirstWord(text);
        text = normalizeSpaces(text);
        text = normalizePunctuation(text);
        text = normalizeQuotes(text);
        text = ensureDotAtEnd(text); 
        return text;
    }

    private String capitalizeFirstWord(String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }

    private String normalizeSpaces(String line) {
        return line.replaceAll("\\s+", " ");
    }

    private String normalizePunctuation(String line) {
        // One space after comma, dot, and colon
        line = line.replaceAll("\\s*,\\s*", ", ");
        line = line.replaceAll("\\s*\\.\\s*", ". ");
        line = line.replaceAll("\\s*:\\s*", ": ");

        // Capitalize first word after dot
        Matcher matcher = Pattern.compile("\\.\\s*\\b(\\w*)").matcher(line);
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            matcher.appendReplacement(result, capitalizeFirstWord(matcher.group(0)));
        }

        matcher.appendTail(result);
        line = result.toString();

        return line;
    }

    private String normalizeQuotes(String line) {
        return line.replaceAll("\\s*\"\\s*", "\"");
    }

    private String ensureDotAtEnd(String text) {
        if (!text.endsWith(".")) {
            return text + ".";
        }
        return text;
    }
}
