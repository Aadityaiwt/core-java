package Basics;

import java.util.Scanner;

public class ascii {
    // ASCII value : 'A'=65, 'a'=97, '0'=48
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char ch = sc.next().charAt(0);
        System.out.println((int)ch);
    }
}
