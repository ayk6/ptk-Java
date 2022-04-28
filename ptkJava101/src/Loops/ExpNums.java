package Loops;

import java.util.Scanner;

public class ExpNums {
    public static void main(String[] args) {
        int num,num2,result=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        num=scan.nextInt();
        System.out.print("Üs sayı : ");
        num2=scan.nextInt();

        for (int i=1; i<=num2; i++) {
            result*=num;
        }
        System.out.println(num+"^"+num2+" = "+result);
    }
}
