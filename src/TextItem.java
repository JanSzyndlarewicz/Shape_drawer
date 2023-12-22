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
        return new Point[0];
    }

    @Override
    public void draw(Graphics g) {
        g.drawString(text, position.getX(), position.getY());
    }
}
