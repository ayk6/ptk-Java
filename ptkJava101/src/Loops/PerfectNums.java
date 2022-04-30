package Loops;

import java.util.Scanner;

public class PerfectNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Mükemmel sayı bulma programı");
        System.out.print("Sayıyı yazın : ");
        int num = scan.nextInt();
        int res=0;

        for (int i = 1; i < num; i++) {
            if (num%i==0){
                res+=i;
            }
        }
        if (num==res){
            System.out.println("Girilen sayı mükemmel sayıdır.");
        }
        else System.out.println("Girilen sayı mükemmel sayı değildir.");
    }
}
