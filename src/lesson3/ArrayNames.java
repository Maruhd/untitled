package lesson3;

import java.util.Arrays;

public class ArrayNames {
    public static void main(String[] args) {
        String[] names = {"name1", "name2", "name3", "name4" };
        for (int i = 0; i < 4; i++){
            Arrays.sort(names);
            System.out.println(names[i]);
        }
    }
}
