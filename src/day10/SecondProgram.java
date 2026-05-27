package day10;

import java.util.Scanner;

public class SecondProgram {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n =sc.nextInt();
        for(int i=1;i<n;i+=2)
        {
            System.out.println("Hello");
        }
        sc.close();
    }
}
