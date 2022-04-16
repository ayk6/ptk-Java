package Conditions;

import java.util.Scanner;

public class PrimCalc {
    // Hesap Makinesi
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.print("İşlem yapılacak ilk sayıyı yazın : ");
        num1=scan.nextInt();
        System.out.print("İşlem yapılacak ikinci sayıyı yazın : ");
        num2=scan.nextInt();
        System.out.println("Yapılacak işlemi girin ('+','-','/','*')");
        char op= scan.next().charAt(0);

        double result;
        if (op=='+'){
            result=num1+num2;
            System.out.println("İşlem sonucu : "+result);
        } else if (op=='-'){
            result=num1-num2;
            System.out.println("İşlem sonucu : "+result);
        } else if (op=='*'){
            result=num1*num2;
            System.out.println("İşlem sonucu : "+result);
        }else if (op=='/'){
            result=num1/num2;
            System.out.println("İşlem sonucu : "+result);
        }
        else System.out.println("Hatalı giriş");
    }
}
