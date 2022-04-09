import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        double value;
        Scanner scan = new Scanner(System.in);
        System.out.print("Tutarı girin : ");
        value= scan.nextInt();
        double kdv=0.18;
        double result=value*kdv;
        System.out.println("kdv oranı : "+kdv);
        System.out.println("kdv tutarı : "+result);
        System.out.println("kdv dahil tutar : "+(result+value));
    }
}
