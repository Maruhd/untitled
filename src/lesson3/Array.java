package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array lenght");
        int arrayLenght = scan.nextInt();
        int[] array = new int[arrayLenght];
        for (int i = 0; i < arrayLenght; i++) {
            array[i] = ((int) (Math.random() * 15));
        }
        System.out.println("Your array");
        System.out.println(Arrays.toString(array));
        int max = array[0];
        for (int i = 0; i < arrayLenght; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max value of array is " + max);
        int min = array[0];
        for (int i = 0; i < arrayLenght; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Mix value of array is " + min);
        double sum = 0;
        for (int i = 0; i < arrayLenght; i++) {
            sum = array[i];
        }
        double average = sum / arrayLenght;
        System.out.println("Average value of array is " + average);
    }
}
