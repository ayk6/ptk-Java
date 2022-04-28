package Loops;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        //     *
        //    ***
        //   *****
        //  *******
        // *********

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı yazın : ");
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= num - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k=1;k<=((2*num)-1)-(2*i);k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
