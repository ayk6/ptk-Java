package Conditions;

import java.util.Scanner;

public class Nums {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan = new Scanner(System.in);

        System.out.print("İlk sayıyı yazın : ");
        a =scan.nextInt();
        System.out.print("İkinci sayıyı yazın : ");
        b=scan.nextInt();
        System.out.print("Üçüncü (son) sayıyı yazın : ");
        c=scan.nextInt();

        if((a>b)&&(a>c)){
            if (b>c){
                System.out.println(a+">"+b+">"+c);
            }else System.out.println(a+">"+c+">"+b);
        } else if ((b>a)&&(b>c)){
            if (a>c){
                System.out.println(b+">"+a+">"+c);
            }else System.out.println(b+">"+c+">"+a);}
        else {
            if (a>c){
                System.out.println(c+">"+a+">"+b);
            }else System.out.println(c+">"+b+">"+a);}
    }
}
