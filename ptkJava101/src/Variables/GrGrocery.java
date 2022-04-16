import java.util.Scanner;

public class GrGrocery {
    public static void main(String[] args) {
        double apple=3.67, tomato=1.11, peach=2.14, banana=0.95, eggplant=5;
        int applekg, tomatokg, peachkg, bananakg, eggplantkg;
        Scanner scan = new Scanner(System.in);
        System.out.print("Almak istediğiniz ürün miktarını kg olarak yazın.\n" +
                "Armut : ");
        peachkg= scan.nextInt();
        System.out.print("Elma : ");
        applekg= scan.nextInt();
        System.out.print("Domates : ");
        tomatokg= scan.nextInt();
        System.out.print("Muz : ");
        bananakg= scan.nextInt();
        System.out.print("Patlıcan : ");
        eggplantkg= scan.nextInt();

        double result=(apple*applekg)+(peach*peachkg)+(tomato*tomatokg)+
                (banana*bananakg)+(eggplant*eggplantkg);

        System.out.println("Toplam tutar : "+result+ " TL.");
    }
}
