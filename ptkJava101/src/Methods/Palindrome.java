package Methods;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Palindrom sayı programı\n-----------------------" +
                "\nBir sayı yazın : ");
        int num = scan.nextInt();
        if(isPalindrom(num)) System.out.println( num + " Palindrom sayıdır");
        else System.out.println(num+" Palindrom sayı değildir");
    }

    private static boolean isPalindrom(int num) {
        int temp= num, reverseNumber = 0, lastNumber;
        while(temp != 0)
        {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if(num == reverseNumber)
        {
            return  true;
        }
        else
        {
            return false;
        }
    }
}