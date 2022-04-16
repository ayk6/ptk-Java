package Conditions;

import java.util.Scanner;

public class FlightCalc {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double km,age,totalprize=0.1;

    System.out.print("Mesafe (km): ");
    km = scan.nextDouble();

    System.out.print("Yaş : ");
    age = scan.nextDouble();

    System.out.println("Yolculuk türü seçin :\n1 - Gidiş\n2 - Gidiş-Dönüş");
    int isReturn = scan.nextInt();

    if (km < 0 || age < 0 || isReturn <0  || isReturn > 2) {
        System.out.println("Hatalı veri girişi");
    } else {
        totalprize=totalprize*km;
        if (age < 12) {
            totalprize=(totalprize*0.5);
        } else if (age >= 12 && age < 24) {
            totalprize=(totalprize*0.9);
        } else if (age > 65) {
            totalprize=(totalprize*0.7);
        }
        if (isReturn == 2) {
            totalprize = (totalprize * 1.6);
        }
        System.out.print("Toplam ücret : " + totalprize);
    }
}
}

