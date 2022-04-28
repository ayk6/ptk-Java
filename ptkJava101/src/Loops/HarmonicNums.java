package Loops;

import java.util.Scanner;

public class HarmonicNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı yazın : ");
        int num = scan.nextInt();
        double result =0;

        for (double i = 1; i <= num; i++) {
            result+=(1/i);
        }
        System.out.println(result);
    }
}
