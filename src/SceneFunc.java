import java.awt.*;

public interface SceneFunc {
    void addItem(Item item);
    public void translateItem(Item item, Point vector);

    public void translateItem(int itemIndex, Point vector);
    //public Point[] getBoundingBoxOfPickedItems();
    void paintComponent(Graphics g);
}
