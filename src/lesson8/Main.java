package lesson8;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] atgs) {
        String str = "1111, qqq, 1111, qqq, 1q1q";
        String numbs = str.substring(0, 4);
        String numbs1 = str.substring(11, 15);
        String litters = str.substring(6, 9);
        String litters1 = str.substring(17, 20);
        System.out.println(str.length());
        System.out.println(str.charAt(25));
        String blocNumbs = String.join(" ", numbs, numbs1);
        System.out.println(blocNumbs);
        String repStar = str.replace("qqq", "***");
        System.out.println(repStar);
        String numbsDoc = str.replace(", ", "/");
        System.out.println(numbsDoc);
        String litterrsAll = String.join("/", litters, litters1);
        System.out.println(litterrsAll);
        System.out.println(str.toUpperCase(Locale.ROOT));
        StringBuilder srt1 = new StringBuilder("1111, qqq, 1111, qqq, 1q1q");
        System.out.println("Letters: " + litterrsAll.toUpperCase(Locale.ROOT));
        boolean isContail1 = str.contains("abc");
        System.out.println(isContail1);
        boolean isNumbs = str.startsWith("555");
        System.out.println(isNumbs);
        boolean isEndConsistency = str.endsWith("1a2b");
        System.out.println(isEndConsistency);
    }
}
