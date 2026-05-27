package day10;

import java.util.Scanner;

public class FourthProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= n; j += 2) {

                System.out.println("Hello");
            }
        }

        sc.close();
    }
}