// Controller: InputController.java
package Controller;

import java.util.ArrayList;

import Model.Student;
import View.View;

public class Controller {
    private View View;

    public Controller(View View) {
        this.View = View;
    }

    public void addStudent(ArrayList<Student> students) {
        System.out.println("Please input student information ");
        String name = View.getInputString("Name: ");
        String classes = View.getInputString("Classes: ");
        float mark = View.getInputFloat("Mark: ");
        students.add(new Student(name, mark, classes));
    }

    public void displayStudentInformation() {
        ArrayList<Student> students = new ArrayList<>();
        addStudent(students);
        while (true) {
            if (!View.getInputYN("Do you want to enter more student information?(Y/N): ")) {
                break;
            }
            addStudent(students);
        }
        View.displayStudentInfo(students);
    }
}
