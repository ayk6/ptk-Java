package Minesweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("satır sayısı : ");
        int line = scan.nextInt();
        System.out.print("sütun sayısı : ");
        int col = scan.nextInt();
        Minesweeper mine = new Minesweeper(line,col);

        mine.run();
    }
}
