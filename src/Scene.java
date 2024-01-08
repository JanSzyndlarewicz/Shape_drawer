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
    public void translateItem(Item item, Point vector) {
        item.translate(vector);
    }

    public void translateItem(int itemIndex, Point vector) {
        if(itemIndex >= 0 && itemIndex < items.size())
            items.get(itemIndex).translate(vector);
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(Item item : items)
            item.draw(g);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
