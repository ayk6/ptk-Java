import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double boy;
        int kilo;
        double bmi;
        Scanner scan = new Scanner(System.in);
        System.out.print("boyunuzu metre olarak yazın (örn:1,75) : ");
        boy=scan.nextDouble();
        System.out.print("kilonuzu yazın : ");
        kilo=scan.nextInt();
        bmi=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksi : "+bmi);

    }
}
