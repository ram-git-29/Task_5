package Task_5;

import java.util.ArrayList;

public class StudentNameCheck {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Ankit");
        students.add("David");
        students.add("Anu");
        students.add("Steve");
        students.add("Aman");
        students.add("Mike");
        students.add("Arun");
        students.add("John");

        for (String name : students) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
    }
}

