package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int) (Math.random() * 10));
            sum1 = sum1 + array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            array2[j] = ((int) (Math.random() * 10));
            sum2 = sum2 + array2[j];
        }
        System.out.println("your first array");
        System.out.println(Arrays.toString(array1));
        System.out.println("your second array");
        System.out.println(Arrays.toString(array2));
        double everage1 = sum1 / array1.length;
        double everage2 = sum2 / array2.length;
        if (everage1 > everage2) {
            System.out.println("Average of the first array is greater");
        } else if (everage1 < everage2) {
            System.out.println("Average of the second array is greater");
        } else {
            System.out.println("Both arrays have the same average number");
        }
    }
}
