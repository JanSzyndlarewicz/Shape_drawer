import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scene scene = new Scene();

//        Triangle t = new Triangle(new Point(100, 100), new Point(200, 200), new Point(300, 100), false);
//        //Scene.addItem(t);
//        Rectangle r = new Rectangle(new Point(200, 400), 100, 100, false);
//        //Scene.addItem(r);
//        Circle c = new Circle(new Point(100, 200), 100, false);
//        //Scene.addItem(c);
//        TextItem ti = new TextItem(new Point(100, 100), "Hello World", new Font("Arial", Font.BOLD, 20));
//        //Scene.addItem(ti);
        Spiral s = new Spiral(new Point(200, 200), 10, 5, 0, 0);
        Scene.addItem(s);
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