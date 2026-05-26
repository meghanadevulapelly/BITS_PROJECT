package day9;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(7);
        arr.add(10);
        arr.add(15);
        for(Integer a:arr)
        {
            System.out.println(a);
        }
        
    }
}
