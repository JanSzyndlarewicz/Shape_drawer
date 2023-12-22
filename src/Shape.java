public abstract class Shape extends Item{

    public Shape() {
        super();
    }
    public Shape(Point position) {
        super(position);
    }
    public boolean getFilled() {
        return true;
    }
}
