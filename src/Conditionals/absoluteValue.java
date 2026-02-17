package Conditionals;

import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        // Absolute Number : |-4| = 4
        // Absolute Number : |4| = 4
        // Absolute Number : Always Positive

        if (n<0) System.out.println(-n);
        else System.out.println(n);
    }
}