package Minesweeper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
    Scanner scan = new Scanner(System.in);

    int line;
    int col;
    String[][] map;
    String[][] gameMap;
    boolean isOver = false;

    public Minesweeper(int line, int col) {
        this.line = line;
        this.col = col;
        this.map = new String[line][col];
        this.gameMap = new String[line][col];
    }

    public void createMap() {
        int minePiece = (line * col)/4;
        Random rand = new Random();
        while (minePiece > 0) {
            int randomLİne = rand.nextInt(line);
            int randomCol = rand.nextInt(col);
            if (map[randomLİne][randomCol] !="*") {
                map[randomLİne][randomCol] = "*";
                minePiece--;
            }
        }
        for (int i = 0; i < line; i++) {
            for (int j = 0; j <col;j++){
                if (map[i][j]!="*"){
                    map[i][j]="-";
                }
            }
        }
    }

    boolean checkRange(int x,int y){
        return (x<line&&y<col)||(x>=0&&y>=0);
    }
    boolean checkMine (int x, int y){
        return map [x][y].equals("*");
    }
    int check(int x,int y){
        int count=0;
        if (y-1>=0){
            if (x-1>=0){
                if (map[x-1][y-1].equals("*")){
                    count++;
                }
            }
            if (x<col){
                if (map[x][y-1].equals("*")){
                    count++;
                }
            }if (x+1<col){
                if (map[x+1][y-1].equals("*")){
                    count++;
                }
            }

        }
        if (y<line){
            if (x-1>=0){
                if (map[x-1][y].equals("*")){
                    count++;
                }
            }
            if (x+1<col){
                if (map[x+1][1].equals("*")){
                    count++;
                }
            }

        }
        if (y+1<line){
            if (x-1>=0){
                if (map[x-1][y+1].equals("*")){
                    count++;
                }
            }
            if (x<col){
                if (map[x][y+1].equals("*")){
                    count++;
                }
            }if (x+1<col){
                if (map[x+1][y+1].equals("*")){
                    count++;
                }
            }

        }
        return count;
    }

    boolean checkWin(){
        for (int i=0;i<line;i++){
            for (int j = 0; j <col;j++){
                if (map[i][j].equals("-")){
                        return false;
                }
            }
        }
        return true;
    }

    public void run() {
        createMap();
        print(map);
        System.out.println("oyun başladı");
        while (!isOver){
            printGame();
            System.out.print("satır : ");
            int selectLine=scan.nextInt();
            System.out.print("sütun : ");
            int selectCol=scan.nextInt();
            if (!checkRange(selectLine,selectCol)){
                System.out.println("oyun alanı sınırlarında seçim yapılmalı");
                continue;
            }
            if (checkMine(selectLine,selectCol)){
                System.out.println("oyunu kaybettiniz");
                break;
            }
            gameMap[selectLine][selectCol]= String.valueOf(check(selectLine,selectCol));
            map[selectLine][selectCol]= String.valueOf(check(selectLine,selectCol));
            System.out.println(check(selectLine,selectCol));
            if (checkWin()){
                System.out.println("kazandınız");
                break;
            }

        }
    }
    public void print(String[][] map) {
        System.out.println("==================");
        for (int i=0; i< line; i++){
            for (int j=0; j <col;j++){
                System.out.print(map[i][j]);
            }
            System.out.println("");
        }
        System.out.println("==================");
    }
    public void printGame() {
        System.out.println("==================");
        for (String[] i : this.gameMap) {
            for (String j : i) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println("==================");
    }
}
