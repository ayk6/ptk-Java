package Conditions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Öğrenmek istediğiniz yılı yazın : ");
        int year =scan.nextInt();

        if (year%100==0){
            if (year%400==0)
            System.out.println(year+" artık yıldır.");
            else System.out.println(year+" artık yıl değildir.");
        }else if (year%4==0){
            System.out.println(year+" artık yıldır.");
        }else System.out.println(year+" artık yıl değildir.");
    }
}
