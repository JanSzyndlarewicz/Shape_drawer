import java.awt.*;
import java.util.HashMap;

public class RectangleSingleton extends Shape implements RectangleMixIn{

    private int width;
    private int height;


    public RectangleSingleton(int width, int height) {
        //super(width, height);
        super();
        this.width = width;
        this.height = height;
        removeAllRectangleSingletons();
    }

    public RectangleSingleton(int width, int height, boolean isFilled) {
        //super(width, height, isFilled);
        super(isFilled);
        this.width = width;
        this.height = height;
        removeAllRectangleSingletons();
    }

    public RectangleSingleton(Point position, int width, int height) {
        //super(position, width, height);
        super(position);
        this.width = width;
        this.height = height;
        removeAllRectangleSingletons();
    }

    public RectangleSingleton(Point position, int width, int height, boolean isFilled) {
        //super(position, width, height, isFilled);
        super(position, isFilled);
        this.width = width;
        this.height = height;
        removeAllRectangleSingletons();
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
        Point[] points = new Point[4];
        points[0] = new Point(position.getX(), position.getY());
        points[1] = new Point(position.getX() + width, position.getY());
        points[2] = new Point(position.getX(), position.getY() + height);
        points[3] = new Point(position.getX() + width, position.getY() + height);

        return points;
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(position.getX(), position.getY(), width, height);

        if(isFilled)
            g.fillRect(position.getX(), position.getY(), width, height);
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
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

    @Override
    public void removeAllRectangleSingletons() {
        for (int i = 0; i < Scene.items.size(); i++) {
            if (Scene.items.get(i) instanceof RectangleSingleton) {
                Scene.items.remove(i);
                i--;
            }
        }
    }
}
