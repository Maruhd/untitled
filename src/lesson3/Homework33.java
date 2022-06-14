package lesson3;

import java.util.Scanner;

public class Homework33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entem numbers color");
        int n = scan.nextInt();
        if (n == 1) {
            System.out.println("Red");
        } else if (n == 2) {
            System.out.println("Orange");
        } else if (n == 3) {
            System.out.println("Yellow");
        } else if (n == 4) {
            System.out.println("Green");
        } else if (n == 5) {
            System.out.println("blue");
        } else if (n == 6) {
            System.out.println("dark blue");
        } else if (n == 7) {
            System.out.println("Purple");
        } else {
            System.out.println("color number does not exist");
        }
    }

}
