package lesson6;

public class Traingle implements Figures {
    private double a;
    private double b;
    private double c;

    public Traingle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public double calculaterPerimetr() {
        return a + b + c;
    }

    @Override
    public double calculaterArea() {
        return Math.sqrt(calculaterPerimetr() / 2 * (calculaterPerimetr() / 2 - a) * (calculaterPerimetr() / 2 - b) *
                (calculaterPerimetr() / 2 - c));
    }
}
