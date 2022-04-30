package Loops;

import java.util.Scanner;

public class MinMaxValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Girilen sayılardan min-max değerleri bulma programı");
        System.out.print("Kaç adet sayı girilecek : ");
        int n = scan.nextInt();
        int min=0, max=0;

        if (n<=1) {
            System.out.println("Birden fazla sayı girilmelidir.");
        }
        else {
            for (int i=1; i<=n; i++) {
                System.out.print(i+". sayıyı yazın : ");
                int num = scan.nextInt();

                if (num>max){
                    max=num;
                }
                if (num<min){
                    min=num;
                }
            }System.out.println("Girilen değerlerden en büyüğü : "+max+"\n" +
                    "en küçüğü : "+min);
        }
    }
}
