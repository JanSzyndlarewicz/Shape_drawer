import java.awt.*;
import java.util.ArrayList;

public class SceneBoundingBoxPicker extends Scene {
    private ArrayList<Item> pickedItems = new ArrayList<>();
    public SceneBoundingBoxPicker() {
        super();
    }

    public void pickItems(ArrayList <Item> items){
        pickedItems = items;
    }

    public void pickItem(Item item){
        pickedItems.add(item);
    }

    public void clearPickedItems(){
        pickedItems.clear();
    }

    public void pickItemByIndex(int index){
        if(index >= 0 && index < items.size())
            pickedItems.add(items.get(index));
        else
            throw new IndexOutOfBoundsException();
    }

    @Override
    public void addItem(Item item) {
        super.addItem(item);
    }

    @Override
    public void translateItem(Item item, Point vector) {
        super.translateItem(item, vector);
    }

    @Override
    public void translateItem(int itemIndex, Point vector) {
        super.translateItem(itemIndex, vector);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Point[] boundingBoxOfPickedItems = getBoundingBoxOfPickedItems();

        for (Item item : items) {
            Point[] points = item.getBoundingBox();
            g.setColor(Color.RED);
            g.drawRect(points[0].getX(), points[0].getY(), points[3].getX() - points[0].getX(), points[3].getY() - points[0].getY());
        }

        System.out.println(boundingBoxOfPickedItems[0].getX() + " " + boundingBoxOfPickedItems[0].getY());
        System.out.println(boundingBoxOfPickedItems[3].getX() + " " + boundingBoxOfPickedItems[3].getY());

        g.setColor(Color.BLUE);
        g.drawRect(boundingBoxOfPickedItems[0].getX(),
                boundingBoxOfPickedItems[0].getY(),
                boundingBoxOfPickedItems[3].getX() - boundingBoxOfPickedItems[0].getX(),
                boundingBoxOfPickedItems[3].getY() - boundingBoxOfPickedItems[0].getY());
    }

    public Point[] getBoundingBoxOfPickedItems(){
        if(pickedItems.isEmpty()){
            Point[] points = new Point[4];
            points[0] = new Point(0, 0);
            points[1] = new Point(0, 0);
            points[2] = new Point(0, 0);
            points[3] = new Point(0, 0);
            return points;
        }

        Point minPoint = new Point(getWidth(), getHeight());
        Point maxPoint = new Point(0, 0);

        for (Item item : pickedItems) {
            Point[] points = item.getBoundingBox();
            if (points[0].getX() < minPoint.getX())
                minPoint.setX(points[0].getX());
            if (points[0].getY() < minPoint.getY())
                minPoint.setY(points[0].getY());

            if (points[3].getX() > maxPoint.getX())
                maxPoint.setX(points[3].getX());
            if (points[3].getY() > maxPoint.getY())
                maxPoint.setY(points[3].getY());
        }

        Point[] points = new Point[4];
        points[0] = new Point(minPoint.getX(), minPoint.getY());
        points[1] = new Point(maxPoint.getX(), minPoint.getY());
        points[2] = new Point(minPoint.getX(), maxPoint.getY());
        points[3] = new Point(maxPoint.getX(), maxPoint.getY());

        return points;
    }
}
