import java.awt.*;

public class ItemDecorator implements ItemHandler {
    private final ItemHandler wrapper;

    public ItemDecorator(ItemHandler item) {
        this.wrapper = item;
    }

    @Override
    public Point[] getBoundingBox() {
        return wrapper.getBoundingBox();
    }

    @Override
    public void draw(Graphics g) {
        wrapper.draw(g);
        g.setColor(Color.RED);
        g.drawRect(wrapper.getBoundingBox()[0].getX(), wrapper.getBoundingBox()[0].getY(),
                wrapper.getBoundingBox()[3].getX() - wrapper.getBoundingBox()[0].getX(),
                wrapper.getBoundingBox()[3].getY() - wrapper.getBoundingBox()[0].getY());
        g.setColor(Color.BLACK);
    }

    @Override
    public void translate(Point vector) {
        wrapper.translate(vector);
    }

    @Override
    public boolean contains(Point point) {
        return wrapper.contains(point);
    }

    public ItemHandler getWrapper() {
        return wrapper;
    }
}
