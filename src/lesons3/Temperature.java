package lesons3;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature outside: ");
        int t = scan.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        } else if (-5 >= t && t > -20) {
            System.out.println("Fine");
        } else if (-20 >= t) {
            System.out.println("Cold");
        }
        else {
            System.out.println("Error");
        }
    }
}
