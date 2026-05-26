package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AcceptNoOfTestCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {  
            int ArrListSize=sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>(); 
            for(int i=0;i<ArrListSize;i++)
            {
                int value = sc.nextInt();
                arr.add(value);
            }
            
            System.out.println(Collections.max(arr));
            
        } 
        sc.close();
    }

}
