package Conditionals;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price : ");
        int cp = sc.nextInt();

        System.out.print("Enter selling price : ");
        int sp = sc.nextInt();

        if (sp > cp) {
            System.out.print("Profit is ");
            System.out.println(sp-cp);
        }
        if (cp > sp) System.out.println("Loss is "+(cp-sp));
        if (sp == cp) System.out.println("No Profit No Loss");
    }
}
