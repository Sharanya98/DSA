package DSA.firstjava.E3;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Principle");
        int Principle = sc.nextInt();
        System.out.println("enter Rate");
        float rate = sc.nextFloat();
        System.out.println("enter Time");
        int time = sc.nextInt();
        System.out.println("Simple Interest: "+(Principle+rate+time)/100);

    }
}
