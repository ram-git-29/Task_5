package Task_5;

import java.util.ArrayList;

public class NonEmptyBasic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("");
        list.add("bc");
        list.add("efg");
        list.add("abcd");
        list.add("");
        list.add("jkl");

        for (String s : list) {
            if (!s.equals("")) {
                System.out.println(s);
            }
        }
    }
}

