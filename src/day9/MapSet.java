package day9;

import java.util.HashMap;

public class MapSet {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ravi", 89);
        map.put("raj", 99);
        map.put("sai", 99);
        map.put("tarun",99);
        for(String c : map.keySet()) 
        {
            if(map.get(c)==99)
            {
                System.out.println(c);
            }
             
        }
       

    }
}
