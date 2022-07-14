package lesson4;

import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] mas = {4, 8, 7, 5, 2, 3};
        System.out.println(Arrays.toString(mas));
        System.out.println("Input namber: ");
        Scanner namb = new Scanner(System.in);
        int a = namb.nextInt();
        for (int i = 0; i < mas.length; i++)
            if (mas[i] == a) {
                mas[i] = 0;
            }
        System.out.println(Arrays.toString(mas));
    }
}
