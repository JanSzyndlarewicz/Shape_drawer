import java.awt.*;
public class Segment extends Primitive{
   private Point endPosition;

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

    @Override
    public boolean contains(Point point) {
        return false;
    }

    public Point getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(Point endPosition) {
        this.endPosition = endPosition;
    }
}
