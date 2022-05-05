package Methods;

import java.util.Scanner;

public class ExpNums {
    private static void Exp() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int num1 = scan.nextInt();
        System.out.print("Üs değeri giriniz : ");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= num1;
        }

        System.out.println("Sonuç ("+num1+"^"+exponent+") : " + result);
    }

    public static void main(String[] args) {
        System.out.println("Üslü sayı hesaplama programı" +
                "\n----------------------");
        Exp();
    }
}
