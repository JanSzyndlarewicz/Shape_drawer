import java.awt.*;

public class Rectangle extends Shape implements RectangleSingletonService {
    private int width;
    private int height;

    public Rectangle() {
        super();
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height, boolean isFilled) {
        super(isFilled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point position, int width, int height) {
        super(position);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point position, int width, int height, boolean isFilled) {
        super(position, isFilled);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point[] getBoundingBox() {
        Point[] points = new Point[4];
        points[0] = new Point(position.getX(), position.getY());
        points[1] = new Point(position.getX() + width, position.getY());
        points[2] = new Point(position.getX(), position.getY() + height);
        points[3] = new Point(position.getX() + width, position.getY() + height);

        return points;
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(position.getX(), position.getY(), width, height);

        if(isFilled)
            g.fillRect(position.getX(), position.getY(), width, height);
    }

    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", position=" + position +
                '}';
    }

    @Override
    public void createSingletonOnScene() {
        Scene.removeAllRectangles();
        Scene.addItem(this);
        System.out.println("Rectangle Singleton Created");
    }


}
