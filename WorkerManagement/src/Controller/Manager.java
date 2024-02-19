package Controller;

import java.util.ArrayList;
import Models.*;
import Common.Library;
import common.Validate;

public class Manager extends View.Menu<String> {
    ArrayList<Worker> lw = new ArrayList<>();
    ArrayList<History> lh = new ArrayList<>();
    static String[] mc = { "Add worker", "Increase salary", "Decrease salary",
            "Show adjusted salary", "Quit program" };

    public Manager() {
        super("======== Worker Management ========", mc);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                addWorker();
                break;
            case 2:
                adjustSalary(true); // Increase salary
                break;
            case 3:
                adjustSalary(false); // Decrease salary
                break;
            case 4:
                showAdjustedWorkers();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }

    // Option 1: Add a worker
    public void addWorker() {
        System.out.println(" ");
        System.out.println("-------------- Add Worker --------------");
        System.out.print("Enter code: ");
        String id = Validate.checkInputString();
        if (Validate.checkIdExist(lw, id)) {
            System.err.println("Code(id) must be unique.");
            return;
        }
        System.out.print("Enter name: ");
        String name = Validate.checkInputString();
        System.out.print("Enter age: ");
        int age = Validate.checkInputIntLimit(18, 50);
        System.out.print("Enter salary: ");
        int salary = Validate.checkInputSalary();
        System.out.print("Enter work location: ");
        String workLocation = Validate.checkInputString();
        lw.add(new Worker(id, name, age, salary, workLocation));
        System.err.println("Worker added successfully.");
    }

    // Option 2 and 3: Increase or Decrease salary
    public void adjustSalary(boolean increase) {
        System.out.println(" ");
        System.out.print("Enter code: ");
        String id = Validate.checkInputString();
        Worker worker = getWorkerByCode(id);
        if (worker == null) {
            System.err.println("Worker with the provided code doesn't exist.");
            return;
        }
        System.out.print("Enter amount of money to " + (increase ? "raise" : "cut") + ": ");
        int amount = Validate.checkInputPositiveInt();
        int newSalary = increase ? worker.getSalary() + amount : worker.getSalary() - amount;
        if (newSalary <= 0) {
            System.err.println("Salary cannot be less than or equal to 0.");
            return;
        }
        worker.setSalary(newSalary);
        lh.add(new History((increase ? "UP" : "DOWN"), getCurrentDate(), worker.getId(),
                worker.getName(), worker.getAge(), newSalary, worker.getWorkLocation()));
        System.err.println("Salary adjusted successfully.");
    }

    // Option 4: Show all workers with adjusted salary
    public void showAdjustedWorkers() {
        System.out.println(" ");
        if (lh.isEmpty()) {
            System.err.println("No workers have had their salary adjusted yet.");
            return;
        }
        System.out.println("-Display Information Salary-----------------------");
        System.out.printf("%-5s%-10s%-10s%-10s%-10s%-10s\n", "Code", "Name", "Age", "Salary", "Status", "Date");
        for (History history : lh) {
            System.out.printf("%-5s%-10s%-10d%-10d%-10s%-10s\n", 
                                history.getId(), 
                                history.getName(), 
                                history.getAge(), 
                                history.getSalary(), 
                                history.getStatus(), 
                                history.getDate());
        }
    }

    // Utility method to get a worker by code
    public Worker getWorkerByCode(String id) {
        for (Worker worker : lw) {
            if (id.equalsIgnoreCase(worker.getId())) {
                return worker;
            }
        }
        return null;
    }

    // Utility method to get current date
    public String getCurrentDate() {
        // Implement this method to get the current date
        return ""; // Placeholder implementation
    }
}
