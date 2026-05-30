package day7;

import java.util.Scanner;

public class PowerOf4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int t = sc.nextInt();

            if (t > 0 && (t & (t - 1)) == 0) {
                System.out.println(t + " is power of 4");
            } else {
                System.out.println(t + " is not a power of 4");
            }
        }

        sc.close();
    }
}