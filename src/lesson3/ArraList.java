package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraList {
    public static void main(String[] args) {
        int[] numbs = new int[10];
        for (int i = 0; i < numbs.length; i++)
            numbs[i] = ((int) (Math.random() * 100));
        {
            System.out.println("unsorted numbs");
            System.out.println(Arrays.toString(numbs));
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 1; i < numbs.length; i++) {
                    if (numbs[i] < numbs[i - 1]) {
                        int temp = numbs[i];
                        numbs[i - 1] = temp;
                        isSorted = false;
                    }
                }
            }
        }
    }
}
