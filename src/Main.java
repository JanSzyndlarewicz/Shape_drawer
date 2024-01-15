import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SceneBoundingBoxPicker i = new SceneBoundingBoxPicker();
//        i.addItem(new Circle(new Point(100, 400), 50, false));
          //i.addItem(new Rectangle(new Point(200, 200), 50, 50, false));
//        i.addItem(new Triangle(new Point(300, 300), new Point(350, 350), new Point(400, 300), false));
//        i.addItem(new TextItem(new Point(400, 400), "Hello Worljd", new Font("Arial", Font.BOLD, 20)));
//        ComplexItem ci = new ComplexItem();
//        ci.addItem(new Circle(new Point(600, 600), 50, true));
//        ci.addItem(new Rectangle(new Point(500, 500), 50, 50, false));
//        ci.addItem(new Triangle(new Point(500, 500), new Point(350, 350), new Point(400, 300), false));
//        ci.translate(new Point(-150, -150));
//        i.addItem(ci);
//        i.addItem(new Spiral(new Point(100, 100),10, 5,10, 20));
//        Rectangle r = new Rectangle(new Point(400, 100), 50, 50, false);
//        r.translate(new Point(300, 300));
//        i.addItem(r);
//        i.addItem(new Segment(new Point(100, 100), new Point(200, 200)));
//
        Triangle t = new Triangle(new Point(100, 100), new Point(200, 200), new Point(300, 100), false);
        i.addItem(t);
        Rectangle r = new Rectangle(new Point(200, 400), 100, 100, false);
        i.addItem(r);
        Circle c = new Circle(new Point(400, 100), 100, false);
        i.addItem(c);
        TextItem ti = new TextItem(new Point(100, 100), "Hello World", new Font("Arial", Font.BOLD, 20));
        //i.addItem(ti);
        Spiral s = new Spiral(new Point(100, 100), 10, 5, 10, 20);

        ArrayList<Item> items = new ArrayList<>();
        items.add(t);
        items.add(r);
        //items.add(c);
        i.pickItems(items);
        //i.addItem(s);
        /*ComplexItem ci = new ComplexItem();
        ci.addItem(t);
        ci.addItem(r);
        ci.addItem(c);
        ci.addItem(ti);
        ci.addItem(s);
        i.addItem(ci);*/

        //r.translate(new Point(300, 300));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //ci.translate(new Point(100, 100));
//        t.translate(new Point(100, 100));
//        r.translate(new Point(100, 100));
//        c.translate(new Point(100, 100));
//        ti.translate(new Point(100, 100));
//        s.translate(new Point(100, 100));

        //ci.translate(new Point(100, 100));
//        i.translateItem(3, new Point(200, 200));

    }
}