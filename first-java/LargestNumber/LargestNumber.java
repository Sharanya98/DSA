package DSA.firstjava.E5;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number1");
        int a = sc.nextInt();
        System.out.println("enter Number2");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+" is largest");
        }
        else{
            System.out.println(b+" is largest");
        }
    }
}
