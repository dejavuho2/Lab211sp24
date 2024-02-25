package Views;

import Common.Validation;

public class DictionaryView {
    public int displayMenuAndGetChoice() {
        System.out.println("1. Add new word.");
        System.out.println("2. Delete word.");
        System.out.println("3. Search word.");
        System.out.println("4. Exit.");
        System.out.print("Enter your choice: ");
        return Validation.checkInputIntLimit(1, 4);
    }

    public String getEnglishWordFromUser() {
        System.out.print("Enter English: ");
        return Validation.checkInputString();
    }

    public String getVietnameseTranslationFromUser() {
        System.out.print("Enter Vietnamese: ");
        return Validation.checkInputString();
    }

    public void displayTranslation(String translation) {
        System.out.println("Vietnamese: " + translation);
    }

    public void displayMessage(String message) {
        System.err.println(message);
    }
}
