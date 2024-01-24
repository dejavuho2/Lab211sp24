
package controller;

import model.Model;
import model.InputOutput;
import java.io.IOException;

public class Controller {
    private Model textNormalizer;
    private InputOutput fileHandler;

    public Controller() {
        this.textNormalizer = new Model();
        this.fileHandler = new InputOutput();
    }

    public void normalizeTextFile(String inputFileName, String outputFileName) {
        try {
            String inputText = fileHandler.readFromFile(inputFileName);
            String normalizedText = textNormalizer.normalizeText(inputText);
            fileHandler.writeToFile(outputFileName, normalizedText);
            System.out.println("Normalization complete.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
