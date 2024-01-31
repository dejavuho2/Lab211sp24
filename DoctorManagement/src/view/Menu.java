package view;

import java.util.ArrayList;
import controller.Manager;
import model.Doctor;

public class Menu {
    public static void displayMenu(ArrayList<Doctor> ld) {
        Manager manager = new Manager(); // create an instance of Manager
        while (true) {
            int choice = manager.menu(); // call the non-static method on the instance
            switch (choice) {
                case 1:
                    manager.addDoctor(ld);
                    break;
                case 2:
                    manager.updateDoctor(ld);
                    break;
                case 3:
                    manager.deleteDoctor(ld);
                    break;
                case 4:
                    manager.searchDoctor(ld);
                    break;
                case 5:
                    return;
            }
        }
    }
}
