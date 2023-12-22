public abstract class Shape extends Item{
    protected boolean isFilled;

    public Shape() {
        super();
        isFilled = false;
    }
    public Shape(Point position) {
        super(position);
        isFilled = false;
    }

    Shape(boolean isFilled) {
        super();
        this.isFilled = isFilled;
    }

    public Shape(Point position, boolean isFilled) {
        super(position);
        this.isFilled = isFilled;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
}
