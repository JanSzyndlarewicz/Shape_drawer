import java.awt.*;

public class TextItem extends Item{

    private String text;
    private Font font;
    private Point endPosition;

    public TextItem() {
        super();
        endPosition = new Point();
        font = new Font("Arial", Font.PLAIN, 20);
        this.text = "";
    }

    public TextItem(String text) {
        super();
        endPosition = new Point();
        font = new Font("Arial", Font.PLAIN, 20);
        this.text = text;
    }

    public TextItem(String text, Font font) {
        super();
        endPosition = new Point();
        this.font = font;
        this.text = text;
    }

    public TextItem(Point position, String text) {
        super(position);
        endPosition = position;
        this.text = text;
    }

    public TextItem(Point position, String text, Font font) {
        super(position);
        endPosition = position;
        this.font = font;
        this.text = text;
    }

    @Override
    public Point[] getBoundingBox() {
        Point[] points = new Point[4];

        points[0] = position;
        points[1] = new Point(position.getX(), endPosition.getY());
        points[2] = endPosition;
        points[3] = new Point(endPosition.getX(), position.getY());
        return points;
    }

    @Override
    public void draw(Graphics g) {
        g.setFont(font);
        g.drawString(text, position.getX(), position.getY());

        int width = g.getFontMetrics().stringWidth(text);
        int height = g.getFontMetrics().getHeight();

        endPosition = new Point(
                position.getX()+width,
                position.getY()-height);
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
