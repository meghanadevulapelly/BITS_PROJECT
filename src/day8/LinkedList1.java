package day8;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(90);
        System.out.println(ll);
        ll.addFirst(89);
        System.out.println(ll);
        ll.addLast(890);
        System.out.println(ll);
    }
}
