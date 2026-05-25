package day8;

import java.util.Scanner;

public class UniqueArrayWithoutLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            int s=0;
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++)
                {
                    s=s^arr[i];
                }
                System.out.println(s);
                
        }
        sc.close();
    }
}
