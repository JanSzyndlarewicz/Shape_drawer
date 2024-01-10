import java.awt.*;
public class Segment extends Primitive{
    Point endPosition;

    public Segment() {
        super();
        endPosition = new Point();
    }

    public Segment(Point position) {
        super(position);
        endPosition = position;
    }

    public Segment(Point position, Point endPosition) {
        super(position);
        this.endPosition = endPosition;
    }

    @Override
    public Point[] getBoundingBox() {
        Point[] points = new Point[2];
        points[0] = position;
        points[1] = endPosition;
        return points;
    }

    @Override
    public void draw(Graphics g) {
        g.drawLine(position.getX(), position.getY(), endPosition.getX(), endPosition.getY());
    }
}
