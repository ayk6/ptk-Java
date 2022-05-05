package Methods;

import java.util.Scanner;

public class AdvancedCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int process;

        do {
            System.out.println("Hesap Makinesi\n" +
                    "--------------\n" +
                    "\"   1- Toplama İşlemi\"\n" +
                    " + \"2- Çıkarma İşlemi\"\n" +
                    " + \"3- Çarpma İşlemi\"\n" +
                    " + \"4- Bölme işlemi\"\n" +
                    " + \"5- Üslü Sayı Hesaplama\"\n" +
                    " + \"6- Faktoriyel Hesaplama\"\n" +
                    " + \"0- Çıkış Yap\": ");
            System.out.print("Lütfen bir işlem seçiniz : ");
            process = scan.nextInt();
            switch (process) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (process != 0);


    }

    private static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print("(işlemi sonlandırmak için 0 yazın)\n"+i++ +". sayı : ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    private static void minus() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Girilecek sayı adedi : ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı : ");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    private static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı : ");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    private static void divided() {
        Scanner scan = new Scanner(System.in);
        double num1,num2, result = 0.0;
        num1=scan.nextDouble();
        num2=scan.nextDouble();
        result =(num1/num2);


        System.out.println("Sonuç : " + result);
    }

    private static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    private static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
}
