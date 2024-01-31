package DoctorManagement;

import view.Menu;
import model.Doctor;
import controller.Manager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Doctor> ld = new ArrayList<>();
        Menu.displayMenu(ld);
    }
}