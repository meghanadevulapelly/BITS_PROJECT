package day8;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentAvgMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                int SubMarks = sc.nextInt();
                arr.add(SubMarks);
            }
            int s=0;
            for(int c : arr)
            {
                s+=c;
            }
            double avg = (double)s/5;
            System.out.println(j+1 + "st student average is " +avg);
            
        }
        sc.close();
    }
        
}
