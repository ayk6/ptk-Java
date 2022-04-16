package Conditions;

import java.util.Scanner;

public class Cls {
    public static void main(String[] args) {
        int mat,fizik,tr,kimya,muzik;

        Scanner scan = new Scanner(System.in);
        System.out.print("Matematik notu : ");
        mat = scan.nextInt();
        System.out.print("Fizik notu : ");
        fizik = scan.nextInt();
        System.out.print("Türkçe notu : ");
        tr = scan.nextInt();
        System.out.print("Kimya notu : ");
        kimya = scan.nextInt();
        System.out.print("Müzik notu : ");
        muzik = scan.nextInt();

        double average =(mat+fizik+tr+kimya+muzik)/5;
        if (mat<0||mat>100||fizik<0||fizik>100||tr<0||tr>100
        ||kimya<0||kimya>100||muzik<0||muzik>100){
            System.out.println("Hatalı not girişi");
        }else if (average<50){
            System.out.println("Sınıf tekrarı");
        }else System.out.println("Başarılı - Not Ortalaması : "+average);
    }
}
