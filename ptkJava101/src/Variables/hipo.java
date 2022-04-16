import java.util.Scanner;

public class hipo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a, b;
        double c;

        System.out.print("1. kenarı girin : ");
        a=scan.nextInt();
        System.out.print("2. kenarı girin : ");
        b= scan.nextInt();
        c=Math.sqrt(a*a+b*b);
        System.out.println("hipotenüs uzunluğu : "+c);


    }
}
