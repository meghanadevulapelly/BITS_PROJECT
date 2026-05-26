package day9;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorHashSet {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(3);
        s1.add(5);
        Iterator<Integer> s = s1.iterator();
        while(s.hasNext())
        {
            System.out.println(s.next());
        }
    }
}
