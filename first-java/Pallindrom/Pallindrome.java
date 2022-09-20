package DSA.firstjava.E8;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
         String input = sc.nextLine();
         int i=0;
         int j=input.length()-1;
         boolean flag=true;
         while(i<j){
             if(input.charAt(i)!=input.charAt(j)){
                 flag = false;
             }
             i++;
             j--;
         }
         if(flag){
             System.out.println("String is pallindrome");
         }
         else {
             System.out.println("String is not pallindrome");
         }

    }
}
