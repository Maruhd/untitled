package lesons3;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int i = scan.nextInt();
        if (i % 2 == 0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Not even number");
        }
    }
}
