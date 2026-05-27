package day9;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Convert LinkedList to ArrayList
        ArrayList<String> arr = new ArrayList<>(list);

        System.out.println("LinkedList : " + list);
        System.out.println("ArrayList  : " + arr);
    }
}
