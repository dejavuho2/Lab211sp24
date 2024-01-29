package controller;

import java.util.Scanner;
import model.BMI;
import view.View;

public class Controller {
    public static void normalCalculator() {
        System.out.println("enter a number to start calculate");
        Scanner sc = new Scanner(System.in);
        double memory = sc.nextDouble();
        while (true) {
            System.out.print("Enter operator: ");
            String operator = View.checkInputOperator();
            if (operator.equalsIgnoreCase("=")) {
                System.out.println("Result: " + memory);
                return;
            }

            double number = View.inputNumber();
            switch (operator) {
                case "+":
                    memory += number;
                    break;
                case "-":
                    memory -= number;
                    break;
                case "*":
                    memory *= number;
                    break;
                case "/":
                    if (number != 0) {
                        memory /= number;
                    } else {
                        System.err.println("Cannot divide by zero.");
                    }
                    break;
                case "^":
                    memory = Math.pow(memory, number);
                    break;
                default:
                    System.err.println("Invalid operator");
            }

            System.out.println("Memory: " + memory);
        }
    }

    public static BMI calculateBMI(double weight, double height) {
        double bmiValue = weight * 10000 / (height * height);
        return new BMI(bmiValue);
    }

    public static String BMIStatus(double bmi) {
        if (bmi < 19) {
            return "Under-standard.";
        } else if (bmi >= 19 && bmi < 25) {
            return "Standard.";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight.";
        } else if (bmi >= 30 && bmi < 40) {
            return "Fat-should lose weight";
        } else {
            return "Very fat - should lose weight immediately";
        }
    }

    public static void BMICalculator() {
        System.out.print("Enter Weight(kg): ");
        double weight = View.checkInputDouble();
        System.out.print("Enter Height(cm): ");
        double height = View.checkInputDouble();
        
        BMI bmi = calculateBMI(weight, height);
        System.out.printf("BMI number: %.2f\n", bmi.getBmiValue());
        System.out.println("BMI Status: " + BMIStatus(bmi.getBmiValue()));
    }
}
