import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Scene i = new Scene();
        i.addItem(new Circle(new Point(100, 400), 50, false));
        i.addItem(new Rectangle(new Point(200, 200), 50, 50, false));
        i.addItem(new Triangle(new Point(300, 300), new Point(350, 350), new Point(400, 300), false));
        i.addItem(new TextItem(new Point(400, 400), "Hello Worljd", new Font("Arial", Font.BOLD, 20)));
        ComplexItem ci = new ComplexItem();
        ci.addItem(new Circle(new Point(600, 600), 50, true));
        ci.addItem(new Rectangle(new Point(500, 500), 50, 50, false));
        ci.addItem(new Triangle(new Point(500, 500), new Point(350, 350), new Point(400, 300), false));
        //ci.translate(new Point(100, 100));
        i.addItem(ci);
        i.addItem(new Spiral(new Point(100, 100),10, 5,10, 20));
        Rectangle r = new Rectangle(new Point(400, 100), 50, 50, false);
        r.translate(new Point(300, 300));
        i.addItem(r);
        i.addItem(new Segment(new Point(100, 100), new Point(200, 200)));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i.translateItem(3, new Point(200, 200));

    }
}