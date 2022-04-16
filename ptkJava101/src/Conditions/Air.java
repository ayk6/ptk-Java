package Conditions;

import java.util.Scanner;

public class Air {
    public static void main(String[] args) {
        int heat;

        Scanner scan = new Scanner(System.in);
        System.out.print("Sıcaklık değerini yazın(C) : ");
        heat= scan.nextInt();

        if (heat<5){
            System.out.println("Hava sıcaklığı kayak için uygun");
        }else if (heat<25){
            if (heat<15){
                System.out.println("Hava sıcaklığı sinema için uygun");
            }
            if (heat>=10){
                System.out.println("Hava sıcaklığı piknik için uygun");
            }
        }else System.out.println("Hava sıcaklığı yüzme için uygun");
    }
}
