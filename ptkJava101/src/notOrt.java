import java.util.Scanner;

public class notOrt {
    public static void main(String[] args) {

        int mat , fizik, kimya, turkce, tarih, muzik;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notu : ");
        mat = scan.nextInt();

        System.out.print("Fizik notu : ");
        fizik = scan.nextInt();

        System.out.print("Kimya notu : ");
        kimya = scan.nextInt();

        System.out.print("Türkçe notu : ");
        turkce = scan.nextInt();

        System.out.print("Tarih notu : ");
        tarih = scan.nextInt();

        System.out.print("Müzik notu : ");
        muzik = scan.nextInt();

        double result= (mat+fizik+kimya+turkce+tarih+muzik)/6;

        System.out.println("Not ortalaması : "+result);

        String resultStr = result>=60?"sınıfı geçti":"sınıfta kaldı";
        System.out.println(resultStr);

    }
}
