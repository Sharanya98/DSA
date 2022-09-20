package DSA.firstjava.E6;

import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Currency in rupee");
        int inr = sc.nextInt();
        System.out.println("INR to USD: $"+inr*0.013);
    }
}
