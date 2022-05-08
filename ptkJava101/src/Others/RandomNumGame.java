package Others;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class RandomNumGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100);
        // int num= (int) (Math.random()*100);

        Scanner scan = new Scanner(System.in);

        int rights =0;
        int guess;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (rights < 5) {
            System.out.print("Lütfen tahmininizi giriniz (0-100) : ");
            guess = scan.nextInt();

            if (guess < 0 || guess > 99) {
                System.out.println("0-100 arasında bir değer girilmeli");
                continue;
            }

            if (guess == num) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı : " + num);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı tahmin !");
                if (guess > num) {
                    System.out.println(guess + " , gizli sayıdan büyüktür.");
                } else {
                    System.out.println(guess + " , gizli sayıdan küçüktür.");
                }

                wrong[rights++] = guess;
                System.out.println("Kalan tahmin hakkı : " + (5 - rights));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
    }
}
