package Task_5;

import java.util.ArrayList;

public class UppercaseBasic {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("aBc");
        names.add("d");
        names.add("ef");

        for (String name : names) {
            System.out.println(name.toUpperCase());
        }
    }
}

