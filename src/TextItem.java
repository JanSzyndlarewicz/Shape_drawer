import java.awt.*;

public class TextItem extends Item{

    private String text;
    private Font font;
    private int width;
    private int height;
    private int tmp;

    public TextItem() {
        super();
        font = new Font("Arial", Font.PLAIN, 20);
        this.text = "";
    }

    public TextItem(String text) {
        super();
        font = new Font("Arial", Font.PLAIN, 20);
        this.text = text;
    }

    public TextItem(String text, Font font) {
        super();
        this.font = font;
        this.text = text;
    }

    public TextItem(Point position, String text) {
        super(position);
        this.text = text;
    }

    public TextItem(Point position, String text, Font font) {
        super(position);
        this.font = font;
        this.text = text;
    }

    @Override
    public Point[] getBoundingBox() {
        Point[] points = new Point[4];

        points[0] = new Point(position.getX(), position.getY() - tmp);
        points[1] = new Point(position.getX() + width, position.getY() - tmp);
        points[2] = new Point(position.getX(), position.getY() - tmp + height);
        points[3] = new Point(position.getX() + width, position.getY() - tmp + height);
        return points;
    }

    @Override
    public void draw(Graphics g) {
        g.setFont(font);
        g.drawString(text, position.getX(), position.getY());

        width = g.getFontMetrics().stringWidth(text);
        tmp = g.getFontMetrics().stringWidth("W");
        height = g.getFontMetrics().getHeight();
    }

    @Override
    public boolean contains(Point point) {
        Point[] points = getBoundingBox();
        return point.getX() >= points[0].getX() && point.getX() <= points[3].getX()
                && point.getY() >= points[0].getY() && point.getY() <= points[3].getY();
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
