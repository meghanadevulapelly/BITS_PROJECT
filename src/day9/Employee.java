package day9;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Employee {
    public static void main(String[] args) {
        ArrayList<String> emd = new ArrayList<>();
        emd.add("raj");
        emd.add("ritesh");
        emd.add("raj");

        LinkedHashSet<String> lhs = new LinkedHashSet<>(emd);
        System.out.println(lhs);
    }
}
