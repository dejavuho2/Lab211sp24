
import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.normalizeTextFile("test.txt", "output.txt");
    }
}
