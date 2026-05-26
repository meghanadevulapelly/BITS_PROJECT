package day9;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSet1 {
    public static void main(String[] args)
    {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(7);
        set.add(78);
        set.add(7);
        System.out.println(set);
        LinkedList<Integer> s = new LinkedList<>(set);
        System.out.println(s);
        
    }
}
