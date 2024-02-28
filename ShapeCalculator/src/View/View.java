// View: InputView.java
package View;

import Model.Circle;
import Model.Rectangle;
import Model.Triangle;
import Util.Input;

public class View {
    private Input input = new Input();

    public Rectangle inputRectangle() {
        return input.inputRectangle();
    }

    public Circle inputCircle() {
        return input.inputCircle();
    }

    public Triangle inputTriangle() {
        return input.inputTriangle();
    }

    public void displayResults(Triangle triangle, Rectangle rectangle, Circle circle) {
        System.out.println("----Rectangle----");
        rectangle.printResult();
        System.out.println("----Circle----");
        circle.printResult();
        System.out.println("----Triangle----");
        triangle.printResult();
    }
}
