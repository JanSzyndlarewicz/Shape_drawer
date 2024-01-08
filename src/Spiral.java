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

    public Spiral(Point startingPoint,int numSpirals, int depth, int width, int height) {
        super();
        this.startingPoint = startingPoint;
        this.numSpirals = numSpirals;
        this.depth = depth;
        this.width = width;
        this.height = height;
    }


    @Override
    public Point[] getBoundingBox() {
        return new Point[0];
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
