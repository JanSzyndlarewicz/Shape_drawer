import java.awt.*;

import static java.lang.Math.min;

public class Triangle extends Shape{

    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle() {
        super();
        this.point1 = new Point(0,0);
        this.point2 = new Point(0 , 10);
        this.point3 = new Point(10, 0);
    }

    public Triangle(Point point1, Point point2, Point point3) {
        super(new Point(0, 0));
        if(point1.getX() == point2.getX() && point1.getX() == point3.getX()
                || point1.getY() == point2.getY() && point1.getY() == point3.getY())
            throw new IllegalArgumentException("All points have the same x coordinate");
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Triangle(Point point1, Point point2, Point point3, boolean isFilled) {
        super(new Point(0, 0), isFilled);
        if(point1.getX() == point2.getX() && point1.getX() == point3.getX()
                || point1.getY() == point2.getY() && point1.getY() == point3.getY())
            throw new IllegalArgumentException("All points have the same x coordinate");
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public Point[] getBoundingBox() {
        Point[] points = new Point[4];
        int minX = min(min(point1.getX(), point2.getX()), point3.getX());
        int minY = min(min(point1.getY(), point2.getY()), point3.getY());
        int maxX = Math.max(Math.max(point1.getX(), point2.getX()), point3.getX());
        int maxY = Math.max(Math.max(point1.getY(), point2.getY()), point3.getY());

        points[0] = new Point(minX, minY);
        points[1] = new Point(maxX, minY);
        points[2] = new Point(minX, maxY);
        points[3] = new Point(maxX, maxY);

        return points;
    }

    @Override
    public void draw(Graphics g) {
        g.drawLine(point1.getX()+position.getX(), point1.getY()+position.getY(), point2.getX()+position.getX(), point2.getY()+position.getY());
        g.drawLine(point2.getX()+position.getX(), point2.getY()+position.getY(), point3.getX()+position.getX(), point3.getY()+position.getY());
        g.drawLine(point3.getX()+position.getX(), point3.getY()+position.getY(), point1.getX()+position.getX(), point1.getY()+position.getY());

        if(isFilled)
            g.fillPolygon(new int[]{point1.getX(), point2.getX(), point3.getX()}, new int[]{point1.getY(), point2.getY(), point3.getY()}, 3);
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                ", position=" + position +
                '}';
    }
}
