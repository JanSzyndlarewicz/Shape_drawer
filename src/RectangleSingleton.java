import java.awt.*;

public class RectangleSingleton extends Rectangle{


    public RectangleSingleton(int width, int height) {
        super(width, height);
        Scene.removeAllRectangleSingletons();
    }

    public RectangleSingleton(int width, int height, boolean isFilled) {
        super(width, height, isFilled);
        Scene.removeAllRectangleSingletons();
    }

    public RectangleSingleton(Point position, int width, int height) {
        super(position, width, height);
        Scene.removeAllRectangleSingletons();
    }

    public RectangleSingleton(Point position, int width, int height, boolean isFilled) {
        super(position, width, height, isFilled);
        Scene.removeAllRectangleSingletons();
    }

    @Override
    public Point getPosition() {
        return super.getPosition();
    }

    @Override
    public void setPosition(Point position) {
        super.setPosition(position);
    }

    @Override
    public void translate(Point vector) {
        super.translate(vector);
    }

    @Override
    public Point[] getBoundingBox() {
        return super.getBoundingBox();
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }
}
