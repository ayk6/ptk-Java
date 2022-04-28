package Loops;

import java.util.Scanner;

public class MathPrac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ebob-Ekok Programı");
        System.out.println("------------------");
        System.out.print("İlk sayıyı yazın : ");
        int num1 = scan.nextInt();
        System.out.print("İkinci sayıyı yazın : ");
        int num2 = scan.nextInt();
        int ebob = 0, ekok;

        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println("En büyük ortak bölen : " + ebob + "\n" +
                "----------------------");
        ekok=(num1*num2)/ebob;

        System.out.println("En küçük ortak kat : " +ekok);
    }
}
