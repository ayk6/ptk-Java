package Loops;

import java.util.Scanner;

public class ThirdPrac {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı yazın : ");
        num = scan.nextInt();

        for (int i = 1; i <=num;i*=2){
            System.out.println(i);
        }
    }
}
