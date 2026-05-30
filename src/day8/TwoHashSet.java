package day8;

import java.util.HashSet;

public class TwoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(5);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(9);
        set2.add(4);
        set1.addAll(set2);
        System.out.println(set1);

    }
}
