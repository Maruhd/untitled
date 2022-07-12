package Lesson10;


import java.io.File;

public class ReadingFromFile {
    public static final String PATH = "D:\\Test.txt";

    public static void main(String[] args) {

        File file = new File(PATH);
        if (file.exists()) {
            System.out.println("True");
        } else {
            System.out.println("Fols");
        }
        File[] fileArray = file.listFiles();
        if (fileArray == null) {
            System.out.println("Pupka pysta");
            return;
        }
        for (File file1 : fileArray) {
            System.out.println(file.getName());
        }
    }
}
