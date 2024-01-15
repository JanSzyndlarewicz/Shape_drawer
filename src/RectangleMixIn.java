import java.awt.*;

public interface RectangleMixIn {
    Point[] getBoundingBox();
    void draw(Graphics g);
    int getWidth();
    int getHeight();
    void setWidth(int width);
    void setHeight(int height);
    String toString();
}
