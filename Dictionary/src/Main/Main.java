package Main;

import Controller.DictionaryController;
import Model.DictionaryModel;
import Views.DictionaryView;

public class Main {
    public static void main(String[] args) {
        DictionaryModel model = new DictionaryModel();
        DictionaryView view = new DictionaryView();
        DictionaryController controller = new DictionaryController(model, view);
        controller.processUserInput();
    }
}
