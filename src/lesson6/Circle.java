package lesson6;

public class Circle implements Figures {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculaterPerimetr() {
        return 2 * Math.PI * r;
    }

    @Override
    public double calculaterArea() {
        return Math.PI * Math.pow(r, 2);
    }
}
