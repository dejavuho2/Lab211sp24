
package View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Model.Student;

public class View {
    private final Scanner in = new Scanner(System.in);

    public String getInputString(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }

    public float getInputFloat(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Float.parseFloat(in.nextLine());
            } catch (NumberFormatException ex) {
                System.err.println("Invalid input. Please enter a number.");
            }
        }
    }

    public boolean getInputYN(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = in.nextLine().toUpperCase();
            if (input.equals("Y")) {
                return true;
            } else if (input.equals("N")) {
                return false;
            } else {
                System.err.println("Invalid input. Please enter Y or N.");
            }
        }
    }

    public void displayStudentInfo(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        Collections.sort(students);
        for (int i = 0; i < students.size(); i++) {
            System.out.println("--------Student " + (i + 1) + "--------");
            System.out.println("Name: " + students.get(i).getName());
            System.out.println("Classes: " + students.get(i).getClasses());
            System.out.println("Mark: " + students.get(i).getMark());
        }
    }
}
