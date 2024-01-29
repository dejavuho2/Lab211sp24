
package test;

import controller.ListCandidate;
import view.MainMenu;

public class Main {
    
    public static ListCandidate list = new ListCandidate();

    public static void main(String[] args) {
        String[] choices = {"Experience", "Fresher", "Internship", "Search", "Exit"};
        new MainMenu("-----MENU-----", choices).run();
    }
    
}
