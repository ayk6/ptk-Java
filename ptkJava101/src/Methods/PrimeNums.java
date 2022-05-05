package Methods;

import java.util.Scanner;

public class PrimeNums {
    public static void main(String[] args) {
        System.out.println("Sayı girin : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPrime(num, 2);
    }

    static void isPrime(int num, int i) {
        if (i == num) {
            System.out.println(num + " asal sayıdır.");
            return;
        } else if (num % i == 0) {
            System.out.println(num + " asal sayı değildir.");
            return;
        }
        isPrime(num,i+1);
    }
}