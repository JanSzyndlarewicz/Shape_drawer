import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Scene i = new Scene();

        Triangle t = new Triangle(new Point(100, 100), new Point(200, 200), new Point(300, 100), false);
        //i.addItem(t);
        Rectangle r = new Rectangle(new Point(100, 100), 100, 100, false);
        i.addItem(r);
        Circle c = new Circle(new Point(100, 100), 100, false);
        //i.addItem(c);
        TextItem ti = new TextItem(new Point(100, 100), "Hello World", new Font("Arial", Font.BOLD, 20));
        //i.addItem(ti);
        Spiral s = new Spiral(new Point(100, 100), 10, 5, 10, 20);
        //i.addItem(s);
//        ComplexItem ci = new ComplexItem();
//        ci.addItem(t);
//        ci.addItem(r);
//        ci.addItem(c);
//        ci.addItem(ti);
//        ci.addItem(s);
//        i.addItem(ci);

        RectangleSingleton rs = new RectangleSingleton(100, 500, false);
        i.addItem(rs);

        RectangleSingleton rs2 = new RectangleSingleton(100, 100, false);
        i.addItem(rs2);



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

    }
}