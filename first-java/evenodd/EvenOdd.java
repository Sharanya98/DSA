package DSA.firstjava.E1;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = num%2 ==0? false: true;
        if(result){
            System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is even");
        }
    }
}
