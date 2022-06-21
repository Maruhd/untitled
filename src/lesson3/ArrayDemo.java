package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter random number from 1 to 19");
        int randomNumber = cs.nextInt();
        System.out.println("All matches will be converted to null");
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 20));
        }
        System.out.println("Your current array");
        System.out.println(Arrays.toString(array));
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == randomNumber) {
                array[i] = 0;
                counter++;
            }
        }
        System.out.println("Match(es) found: \" + counter");
        System.out.println("Your modified array");
        System.out.println(Arrays.toString(array));
    }
}