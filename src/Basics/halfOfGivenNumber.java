package Basics;

import java.util.Scanner;

public class halfOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        double typeCaste = (double) x;
        System.out.println(typeCaste/2);
//        double d = sc.nextDouble();
//        int n = (int) d;
//        System.out.println(n/2);
    }
}
