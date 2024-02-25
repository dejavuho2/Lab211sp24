package Controller;

import Model.DictionaryModel;
import Views.DictionaryView;

public class DictionaryController {
    private final DictionaryModel model;
    private final DictionaryView view;

    public DictionaryController(DictionaryModel model, DictionaryView view) {
        this.model = model;
        this.view = view;
    }

    public void processUserInput() {
        int choice;
        do {
            choice = view.displayMenuAndGetChoice();
            switch (choice) {
                case 1:
                    addNewWord();
                    break;
                case 2:
                    deleteWord();
                    break;
                case 3:
                    translateWord();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    view.displayMessage("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
    }

    private void addNewWord() {
        String english = view.getEnglishWordFromUser();
        if (model.isKeywordExist(english)) {
            if (!Validation.checkInputYN()) {
                return;
            }
        }
        String vietnamese = view.getVietnameseTranslationFromUser();
        model.addWord(english, vietnamese);
        view.displayMessage("Add successful.");
    }

    private void deleteWord() {
        String english = view.getEnglishWordFromUser();
        model.deleteWord(english);
        view.displayMessage("Delete successful.");
    }

    private void translateWord() {
        String english = view.getEnglishWordFromUser();
        String translation = model.translate(english);
        view.displayTranslation(translation);
    }
}
