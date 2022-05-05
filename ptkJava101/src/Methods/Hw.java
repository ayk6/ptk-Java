package Methods;

import java.util.Scanner;

public class Hw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı yazın : ");
        int num = scan.nextInt();

        method(num);
    }
    private static void method(int num) {
        int temp=num;
        while (num>0){
            System.out.print(num+" ");
            num-=5;
            if (num<=0){
                for (int i=num;i<=temp;i=i+5){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
