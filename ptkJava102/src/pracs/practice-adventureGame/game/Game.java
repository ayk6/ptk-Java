package game;

import locations.*;

import java.util.Scanner;

public class Game {
    public void start() {
        System.out.println("Welcome to Adventure game.Game !");
        //System.out.print("Please enter character name : ");
        Scanner scan = new Scanner(System.in);
        //String playerName= scan.nextLine();

        Player player = new game.Player("plyr1");
        System.out.println(player.getPlayerName() + " welcome to game!");
        System.out.println("Choose your character...");
        player.selectChar();

        Location location = null;

        while (true) {
            System.out.println("===========LOCATIONS============");
            System.out.println("1-Safe House");
            System.out.println("2-Item Store(you can buy weapons and armor)");
            System.out.println("3-Cave   (zombie threat - food looting area)");
            System.out.println("4-Jungle (vampire threat - wood looting area)");
            System.out.println("5-River  (Bear threat - water looting area)");
            System.out.println("6-Mine   (Snake threat - drop looting area)");
            System.out.print("select the location  you want to go to : ");
            int selectLoc = scan.nextInt();
            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ItemStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Jungle(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = new Mine(player);
                    break;
            }
            if (!location.onLocation()){
                System.out.println("You're dead...");
                break;
            }
            if (player.getInventory().isFood()  && player.getInventory().isFood() && player.getInventory().isWater()) {
                System.out.println("winner winner...");
                break;
            }
        }
    }
}
