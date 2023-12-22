import javax.swing.*;
import java.awt.*;

public class Interface extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final String TITLE = "Paint";

    public Interface() {
        JFrame frame = new JFrame(TITLE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Rectangle r = new Rectangle(new Point(20, 30), 10, 20);
        r.draw(g);
        System.out.println(r.getBoundingBox()[0] + " " + r.getBoundingBox()[1] + " " + r.getBoundingBox()[2] + " " + r.getBoundingBox()[3]);

        //draw rectangle


        Circle c = new Circle(new Point(50, 50), 10);
        c.draw(g);


        Triangle t = new Triangle(new Point(100, 100), new Point(150, 250), new Point(300, 50));
        t.draw(g);
        System.out.println(t.getBoundingBox()[0] + " " + t.getBoundingBox()[1] + " " + t.getBoundingBox()[2] + " " + t.getBoundingBox()[3]);
    }
}
