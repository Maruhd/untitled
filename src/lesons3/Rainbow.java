package lesons3;

import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int i = scan.nextInt();
        switch (i) {
            case 1:
            System.out.println("Red");
            break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Blue");
                break;
            case 5:
                System.out.println("Blue1");
                break;
            case 6:
                System.out.println("Purple");
                break;
            case 7:
                System.out.println("Green");
                break;
            default:
                System.out.println("Error");
        }
    }
}
