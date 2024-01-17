import java.awt.*;

public abstract class Item implements ItemInterface{
    protected Point position;

    public Item() {
        this.position = new Point();
    }

    public Item(Point position) {
        this.position = position;
    }
    public abstract Point[] getBoundingBox();
    public abstract void draw(Graphics g);
    public abstract boolean contains(Point point);
    public void translate(Point vector){
        this.position.translate(vector);
    }
}
