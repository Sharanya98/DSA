package DSA.firstjava.E4;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number1");
        float a = sc.nextFloat();
        System.out.println("enter Number2");
        float b = sc.nextFloat();
        System.out.println("enter operation +,-,*,/");
        char op = sc.next().charAt(0);
        if (op == '+') {
            System.out.println("The addition is " + (a + b));
        } else if (op == '-') {
            System.out.println("The subtraction is " + (a - b));
        } else if (op == '*') {
            System.out.println("The multiplication is " + (a * b));
        } else if (op == '/') {
            System.out.println("The division is " + (a / b));
        } else {
            System.out.println("The operation is invalid ");
        }
    }
}
