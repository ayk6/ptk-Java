package Others;

import java.util.Scanner;

public class IsPalindrome {
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static boolean isPalindrome2(String str){
        String reverse="";
        for (int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        if (reverse.equalsIgnoreCase(str))
        {return true;}
        else {return false;}
    }

    public static void main(String[] args) {
        System.out.print("kelime yazın : ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if (isPalindrome2(str)){
            System.out.println("girilen kelime palindrom kelimedir");
        }
        else System.out.println("girilen kelime palindrom değildir");
    }
}
