import java.awt.*;

public interface ItemInterface {
    Point[] getBoundingBox();
    void draw(Graphics g);
    void translate(Point vector);
    boolean contains(Point point);
}
