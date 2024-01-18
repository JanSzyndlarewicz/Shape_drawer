import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scene scene = new Scene();

        Triangle t = new Triangle(new Point(400, 300), new Point(500, 500), new Point(600, 500), false);
        Scene.addItem(t);
        Rectangle r = new Rectangle(new Point(400, 400), 100, 100, true);
        Scene.addItem(r);

        /*Rectangle r3 = new Rectangle(new Point(100, 100), 100, 100, false);
        Scene.addItem(r3);*/
        Circle c = new Circle(new Point(700, 200), 100, false);
        Scene.addItem(c);

        Circle c2 = new Circle(new Point(100, 500), 100, false);
        Scene.addItem(c2);

        TextItem ti = new TextItem(new Point(100, 600), "Hello World", new Font("Arial", Font.BOLD, 20));
        Scene.addItem(ti);

        ComplexItem ci = new ComplexItem(new Point(0, 0));
        Triangle t2 = new Triangle(new Point(300, 100), new Point(500, 200), new Point(300, 300), false);
        ci.addItem(t2);
        Rectangle r2 = new Rectangle(new Point(0, 0), 100, 100, false);
        ci.addItem(r2);
        Circle c3 = new Circle(new Point(100, 100), 100, false);
        ci.addItem(c3);
        Scene.addItem(ci);



//        ComplexItem ci = new ComplexItem(new Point(100, 100));
//        ci.addItem(t);
//        ci.addItem(r);
//        ci.addItem(c);
//        ci.addItem(ti);
//        Scene.addItem(ci);
//        Rectangle r2 = new Rectangle(new Point(300, 100), 100, 100, true);
//        Scene.addItem(r2);

    }
}