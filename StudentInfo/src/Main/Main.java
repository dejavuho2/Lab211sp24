package Main;

import Controller.Controller;
import View.View;

public class Main {
    public static void main(String[] args) {
        View View = new View();
        Controller Controller = new Controller(View);
        Controller.displayStudentInformation();
    }
}
