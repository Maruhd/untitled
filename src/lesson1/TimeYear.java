package lesson1;

import java.util.Scanner;

public class TimeYear  {
    public static void main(String[] args) {
        System.out.println("Enter month: ");
        Scanner monthNumber = new Scanner(System.in);
        int i = monthNumber.nextInt();
        if (i <= 3) {
            System.out.println("Winter");
        }
        else if (i > 3 && i <= 6) {
            System.out.println("Spring");
        } else if (i > 6 && i <= 9) {
            System.out.println("Summer");
        } else if (i > 9 && i <= 12) {
            System.out.println("Othem");
        }
        else {
            System.out.println("Error");
        }
    }
}
