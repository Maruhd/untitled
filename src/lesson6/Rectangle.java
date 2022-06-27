package lesson6;

public class Rectangle implements Figures {
    double x;
    double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double calculaterPerimetr() {
        return 2 * (x + y);
    }

    @Override
    public double calculaterArea() {
        return x * y;
    }
}
