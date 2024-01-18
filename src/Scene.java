import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Scene extends JPanel implements MouseListener{
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 1000;
    private static final String TITLE = "Paint";
    private static ArrayList<ItemHandler> items;
    private static Point pressedPoint;

    public Scene() {
        items = new ArrayList<>();
        JFrame frame = new JFrame(TITLE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        this.addMouseListener(this);
        frame.setVisible(true);
    }

    public static void addItem(Item item) {
        if(item instanceof Singleton)
            removeAllSingletons(item);
        items.add(item);
    }

    public static void removeAllSingletons(ItemHandler item) {
        for (int i = 0; i < Scene.items.size(); i++) {
            if (Scene.items.get(i).getClass().equals(item.getClass())) {
                Scene.items.remove(i);
                i--;
            }
        }
    }

    public void translateItem(Item item, Point vector) {
        for (ItemHandler value : items)
            if (value.equals(item))
                value.translate(vector);
    }

    public void translateItem(int itemIndex, Point vector) {
        if(itemIndex >= 0 && itemIndex < items.size())
            items.get(itemIndex).translate(vector);
    }

    public void clearItemsWithDecorator() {
        for(int i = 0; i < items.size(); i++)
            if(items.get(i) instanceof ItemDecorator)
                items.set(i, ((ItemDecorator) items.get(i)).getWrapper());
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(ItemHandler item : items)
            item.draw(g);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        pressedPoint = new Point(e.getX(), e.getY());
        clearItemsWithDecorator();
        this.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        for(int i = 0; i < items.size(); i++) {
            if(items.get(i).contains(pressedPoint)) {
                System.out.println("Item " + i + " selected");
                items.set(i, new ItemDecorator(items.get(i)));
            }
        }
        this.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
