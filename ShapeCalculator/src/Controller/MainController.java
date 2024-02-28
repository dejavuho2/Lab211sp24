
package Controller;

import Model.Circle;
import Model.Rectangle;
import Model.Triangle;
import View.View;

public class MainController {
    private View View;

    public MainController(View View) {
        this.View = View;
    }

    public void run() {
        Rectangle rectangle = View.inputRectangle();
        Circle circle =View.inputCircle();
        Triangle triangle = View.inputTriangle();
        View.displayResults(triangle, rectangle, circle);
    }
}
