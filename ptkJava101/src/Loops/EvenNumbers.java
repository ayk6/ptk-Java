package Loops;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı yazın : ");
        num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
