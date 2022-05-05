package Methods;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("İstenen eleman : ");
        int num = scan.nextInt();
        num = fib(num);
        System.out.println(num);
    }
    static int fib(int num){
        if (num == 1|| num ==2){
            return 1;
        }
        return fib(num-1)+fib(num-2);
    }
}
