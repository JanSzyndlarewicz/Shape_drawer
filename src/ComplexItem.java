import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ComplexItem extends Item{

    protected List<Item> items;

    public ComplexItem() {
        super();
        items = new ArrayList<>();
    }

    public ComplexItem(Point position) {
        super(position);
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getChildren() {
        return items;
    }

    private Point findMaxPoint(){
        int maxX = 0;
        int maxY = 0;

        for(Item item : items) {
            Point[] points = item.getBoundingBox();

            for(Point point : points) {
                if(point.getX() > maxX)
                    maxX = point.getX();
                if(point.getY() > maxY)
                    maxY = point.getY();
            }
        }

        return new Point(maxX, maxY);
    }


    @Override
    public Point[] getBoundingBox() {
        Point[] points = new Point[4];
        points[0] = position;
        points[1] = new Point(position.getX() + findMaxPoint().getX(), position.getY());
        points[2] = new Point(position.getX(), position.getY() + findMaxPoint().getY());
        points[3] = new Point(position.getX() + findMaxPoint().getX(), position.getY() + findMaxPoint().getY());

        return points;
    }

    @Override
    public void draw(Graphics g) {
        for(Item item : items) {
            System.out.println(item.getPosition());
            item.translate(position);
            System.out.println(item.getPosition());
            item.draw(g);
        }
    }
}
