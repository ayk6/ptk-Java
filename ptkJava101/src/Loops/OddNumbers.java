package Loops;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        int num;
        int result = 0;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.print("Sayı yazın : ");
            num = scan.nextInt();
            if (num%2==1){
                result +=num;
            }
        }
        while (num>0);
        System.out.println("sonuç : "+result);
    }
}
