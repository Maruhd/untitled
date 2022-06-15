package lesson3;

import java.util.Scanner;

public class Homework31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a numb");
        int n = scan.nextInt();
        if (n % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
}
