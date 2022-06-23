package lesson3;

public class NumbersOTR {
    public static void main(String[] args) {
        int i = 0;
        int j = 5;
        int sum = 1;
        while (sum <= 15) {
            System.out.println(i + " ");
            i = i - j;
            sum++;
        }
    }
}
