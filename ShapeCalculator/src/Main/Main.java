
package Main;

import Controller.MainController;
import View.View;

public class Main {
    public static void main(String[] args) {
        View inputView = new View();
        MainController mainController = new MainController(inputView);
        mainController.run();
    }
}
