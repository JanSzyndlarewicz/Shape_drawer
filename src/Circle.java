import java.awt.*;

public class Circle extends Shape{
    private int radius;

    public Circle() {
        super();
        this.radius = 1;
    }

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    public Circle(Point position, int radius) {
        super(position);
        this.radius = radius;
    }

    @Override
    public Point[] getBoundingBox() {
        Point[] points = new Point[4];

        points[0] = position;
        points[1] = new Point(position.getX() + radius, position.getY());
        points[2] = new Point(position.getX(), position.getY() + radius);
        points[3] = new Point(position.getX() + radius, position.getY() + radius);

        return points;
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(position.getX(), position.getY(), radius, radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", position=" + position +
                '}';
    }
}
