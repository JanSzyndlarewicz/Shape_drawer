import java.awt.*;

public abstract class Item {
    protected Point position;


    public Item() {
        this.position = new Point();
    }

    public Item(Point position) {
        this.position = position;
    }

    public abstract Point[] getBoundingBox();

    public abstract void draw(Graphics g);


    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public void translate(Point vector) {
        this.position.translate(vector);
    }
}
