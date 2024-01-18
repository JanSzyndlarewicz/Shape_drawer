import java.awt.*;

public interface ItemHandler {
    Point[] getBoundingBox();
    void draw(Graphics g);
    void translate(Point vector);
    boolean contains(Point point);
}
