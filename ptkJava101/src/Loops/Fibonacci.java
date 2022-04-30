package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonnacci Serisi");
        System.out.print("Eleman sayısı yazın : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int first = 0, second = 1;
        int total = 0;
        System.out.print(first + " " + second + " ");

        for (int i = 2; i <= num; i++) {
            total = first + second;
            first=second;
            second =total;
            System.out.print(total+" ");
        }
    }
}
