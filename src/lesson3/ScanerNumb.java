package lesson3;

import java.util.Scanner;

public class ScanerNumb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Input whole positive number");

        if (scan.hasNextInt()) {
            int number = scan.nextInt();
            int i = 1;
            while (i <= number) {
                sum = sum + i;
                i++;
            }
        }
        System.out.println(sum);
    }
}