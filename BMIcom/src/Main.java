

import controller.Controller;
import view.View;

public class Main {
    public static void main(String[] args) {
        while (true) {
            int choice = View.menu();
            switch (choice) {
                case 1:
                    Controller.normalCalculator();
                    break;
                case 2:
                    Controller.BMICalculator();
                    break;
                case 3:
                    return;
            }
        }
    }
}
