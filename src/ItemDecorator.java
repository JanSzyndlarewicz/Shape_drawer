import java.awt.*;

public class ItemDecorator implements ItemInterface{
    private final ItemInterface item;

    public ItemDecorator(ItemInterface item) {
        this.item = item;
    }

    @Override
    public Point[] getBoundingBox() {
        return item.getBoundingBox();
    }

    @Override
    public void draw(Graphics g) {
        item.draw(g);
        g.setColor(Color.RED);
        g.drawRect(item.getBoundingBox()[0].getX(), item.getBoundingBox()[0].getY(),
                item.getBoundingBox()[3].getX() - item.getBoundingBox()[0].getX(),
                item.getBoundingBox()[3].getY() - item.getBoundingBox()[0].getY());
        g.setColor(Color.BLACK);
    }

    @Override
    public void translate(Point vector) {
        item.translate(vector);
    }

    @Override
    public boolean contains(Point point) {
        return item.contains(point);
    }

    public ItemInterface getItem() {
        return item;
    }
}
