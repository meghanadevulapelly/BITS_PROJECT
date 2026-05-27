package day9;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");

        // Convert ArrayList to Array
        String[] arr = list.toArray(new String[0]);

        System.out.println("Array Elements:");

        for(String i : arr) {
            System.out.println(i);
        }
    }
}
