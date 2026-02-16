package Basics;

import java.util.Scanner;

public class sumOfTwoNumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int b = sc.nextInt();
        System.out.println("The concatenation is  : "+a+b); // concatenation
        System.out.println("The sum of "+a+" and "+b+" is  : "+(a+b));
    }
}
