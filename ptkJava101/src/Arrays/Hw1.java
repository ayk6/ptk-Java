package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutu : ");
        int length = scan.nextInt();
        int[] array = new int[length];
        System.out.println("Dizinin elemanlarını yazın : ");
        for (int i = 0; i < length; i++) {
            System.out.print((i+1)+". eleman : ");
            array[i]=scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Sıralama : "+ Arrays.toString(array));
    }
}
