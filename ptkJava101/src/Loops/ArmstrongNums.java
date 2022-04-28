package Loops;

import java.util.Scanner;

public class ArmstrongNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı yazın : ");
        int num = scan.nextInt();
        int digit=0; // basamak sayısı
        int digitVal=0; // basamak değeri
        int digitUp;
        int result = 0;
        int temp = num;

        while (temp !=0){
            temp/=10;
            digit++;
        } // basamak sayısı belirlendi

        temp=num;

        while (temp !=0) {
            digitVal = temp % 10;
            digitUp=1;
            for (int i=1; i<=digit; i++) {
                digitUp*=digitVal;
            }
            result+=digitUp;
            temp/=10;
        }
        if (num== result){
            System.out.println("Girilen sayı Armstrong sayıdır");
        }
        else System.out.println("Girilen sayı Armstrong sayı değildir");
    }
}
