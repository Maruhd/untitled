package lesson17;

import java.util.Scanner;
import java.util.SplittableRandom;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {

        String enterIP = "192.168.01.01";
        Pattern pt = Pattern.compile("\\d{3}.\\d{3}.\\d{2}.\\d{2}");
        Matcher mc = pt.matcher(enterIP);
        System.out.println(mc.matches());
    }
}
