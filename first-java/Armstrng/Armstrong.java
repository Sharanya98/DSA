package DSA.firstjava.E9;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int originalnum=num;
        double sum =0;
        while(num>0){
            int r = num%10;
            sum = sum + Math.pow(r,3);
            num = num/10;
        }
        if(sum==originalnum){
            System.out.println("Number is armstrong number");
        }
        else{
            System.out.println("Number is not armstrong number");
        }

    }
}
