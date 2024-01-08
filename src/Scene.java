import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Scene extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final String TITLE = "Paint";
    private final ArrayList<Item> items;

    public Scene() {
        this.items = new ArrayList<>();
        JFrame frame = new JFrame(TITLE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(Item item : items) {
            item.draw(g);
        }
    }
}
