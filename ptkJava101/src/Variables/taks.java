import java.util.Scanner;

public class taks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int km, strPrice=10;
        double perKm=3.5;
        System.out.print("mesafeyi km olarak yazın : ");
        km = scan.nextInt();
        double result = km*perKm;
        result +=strPrice;

        result=(result<20)?20:result;

        System.out.println("toplam tutar : "+result+" TL");




    }
}
