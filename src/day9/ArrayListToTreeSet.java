package day9;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayListToTreeSet {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(10);

        // Convert ArrayList to TreeSet
        TreeSet<Integer> set = new TreeSet<>(list);LinkedListToArrayList

        System.out.println("ArrayList : " + list);
        System.out.println("TreeSet   : " + set);
    }
}
