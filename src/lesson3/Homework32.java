package lesson3;

import java.util.Scanner;

public class Homework32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("outside temperature");
        int t = scan.nextInt();
        if (t > -5) {
            System.out.println("hot");
        } else if (t <= -5 && t > -20) {
            System.out.println("norm");
        } else if (t <= -20 && t > -40) {
            System.out.println("Cold");
        } else {
            System.out.println("You will die");
        }
    }
}