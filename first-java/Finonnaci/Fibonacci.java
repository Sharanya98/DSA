package DSA.firstjava.E7;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number upto which you want the series:");
        int a = sc.nextInt();
        int first = 0;
        int second = 1;
        int temp = 0;
        System.out.print(first+" "+second);

        for (int i = 0; i < a; i++) {
            temp = first+second;
            first=second;
            second=temp;
            System.out.print(" "+temp);
        }

    }
}
