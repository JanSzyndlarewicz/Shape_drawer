import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Scene extends JPanel {
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 1000;
    private static final String TITLE = "Paint";
    protected static ArrayList<Item> items;

    public Scene() {
        items = new ArrayList<>();
        JFrame frame = new JFrame(TITLE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
    }

    public static void removeAllRectangles() {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) instanceof Rectangle) {
                items.remove(i);
                i--;
            }
        }
    }

    public static void addItem(Item item) {
        items.add(item);
    }
    public static void translateItem(Item item, Point vector) {
        for (Item value : items)
            if (value.equals(item))
                value.translate(vector);
    }

    public static void translateItem(int itemIndex, Point vector) {
        if(itemIndex >= 0 && itemIndex < items.size())
            items.get(itemIndex).translate(vector);
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(Item item : items)
            item.draw(g);
    }

}
