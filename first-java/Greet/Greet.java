package DSA.firstjava.E2;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        System.out.println("Input your unique name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello "+name+".Have a nice day ahead!!");
    }
}
