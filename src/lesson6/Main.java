package lesson6;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        double summery = 0;
        Figures[] array = new Figures[] {
                new Traingle(5, 6, 7),
                new Rectangle(7, 8),
                new Circle(3)
        };
        for (int i = 0; i<array.length; i++) {
            summery += array[i].calculaterPerimetr();
        }
        System.out.println(summery);
    }
}
