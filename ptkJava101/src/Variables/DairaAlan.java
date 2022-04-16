import java.util.Scanner;

public class DairaAlan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r;
        System.out.print("yarıçapı yazın : ");
        r=scan.nextInt();
        double pi=3.1415926535798932384626;
        double result=pi*r*r;
        double cevre=2*pi*r;
        System.out.println("dairenin alanı : "+result+"\ndairenin çevresi : "
        +cevre);

    }
}
