package Loops;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("üçgenin boyunu yazın : ");
        int num = scan.nextInt();
        for (int i=0;i<=num;i++) {
            for (int j=0;j<i;j++) {
                System.out.print(" ");
            }
            for (int k=1;k<(2*num)-(2*i);k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
