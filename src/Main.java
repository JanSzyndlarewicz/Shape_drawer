public class Main {
    public static void main(String[] args) {

        Scene i = new Scene();
        i.addItem(new Circle(new Point(100, 100), 50, false));
        i.addItem(new Rectangle(new Point(200, 200), 50, 50, false));
        i.addItem(new Triangle(new Point(300, 300), new Point(350, 350), new Point(400, 300), false));
        i.addItem(new TextItem(new Point(400, 400), "Hello World"));
        ComplexItem ci = new ComplexItem();
        ci.addItem(new Circle(new Point(600, 600), 50, true));
        ci.addItem(new Rectangle(new Point(500, 500), 50, 50, false));
        ci.addItem(new Triangle(new Point(500, 500), new Point(350, 350), new Point(400, 300), false));
        i.addItem(ci);
        i.addItem(new Spiral(new Point(100, 100),5, 10,20, 20));

    }
}