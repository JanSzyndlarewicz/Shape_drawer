import java.awt.*;

public class Spiral extends Shape{
    private int depth;
    private int width;
    private int height;
    private int numSpirals;
    private Point startingPoint;

    public Spiral() {
        super();
    }

    public Spiral(Point position) {
        super(position);
    }

    public Spiral(Point startingPoint, int numSpirals, int depth, int width, int height) {
        super(new Point(startingPoint.getX()-numSpirals*depth*2, startingPoint.getY()-numSpirals*depth*2));
        this.startingPoint = startingPoint;
        this.numSpirals = numSpirals;
        this.depth = depth;
        this.width = width;
        this.height = height;
    }


    @Override
    public Point[] getBoundingBox() {
        Point[] points = new Point[4];
        points[0] = new Point(startingPoint.getX()-numSpirals*depth*2, startingPoint.getY()-numSpirals*depth*2);
        points[1] = new Point(startingPoint.getX()+numSpirals*depth*2+width, startingPoint.getY()-numSpirals*depth*2);
        points[2] = new Point(startingPoint.getX()-numSpirals*depth*2, startingPoint.getY()+numSpirals*depth*2+height);
        points[3] = new Point(startingPoint.getX()+numSpirals*depth*2+width-depth, startingPoint.getY()+numSpirals*depth*2+height);
        return points;
    }

    @Override
    public void draw(Graphics g) {
        int x = startingPoint.getX() ;
        int y = startingPoint.getY();
        int width = this.width;
        int height = this.height;
        int arcAngle = 180;

        for (int i = 0; i < numSpirals*2; i++)
            if (i % 2 == 0) {
                y = y - depth;
                width = width + 2 * depth;
                height = height + 2 * depth;
                g.drawArc(x, y, width, height, 0, -arcAngle);
            } else {
                x = x - 2 * depth;
                y = y - depth;
                width = width + 2 * depth;
                height = height + 2 * depth;
                g.drawArc(x, y, width, height, 0, arcAngle);
            }
    }
}
