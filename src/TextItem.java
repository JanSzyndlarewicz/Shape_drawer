import java.awt.*;

public class TextItem extends Item{

    private String text;

    public TextItem() {
        super();
        this.text = "";
    }

    public TextItem(String text) {
        super();
        this.text = text;
    }

    public TextItem(Point position, String text) {
        super(position);
        this.text = text;
    }

    @Override
    public Point[] getBoundingBox() {
        Point[] points = new Point[4];

        points[0] = position;

        return points;
    }

    @Override
    public void draw(Graphics g) {
        g.drawString(text, position.getX(), position.getY());
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "TextItem{" +
                "text='" + text + '\'' +
                ", position=" + position +
                '}';
    }
}
