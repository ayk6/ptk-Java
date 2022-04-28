package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("sayı yazın : ");
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        int result= 1;

        for (int i=1; i<=num; i++) {
            result*=i;
        }

        System.out.println("Sonuç("+num+"!) : "+result);
    }

}
