package lesson11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Pasha", 2f);
        Student student2 = new Student("Sasha", 3f);
        Student student3 = new Student("Igor", 4f);
        Student student4 = new Student("Masha", 5f);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students);

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMark() < 3f) {
                students.remove(students.get(i));
                i--;
            }
        }
        System.out.print(students);
    }
}
