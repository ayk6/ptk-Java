package locations;

import creatures.Zombie;
import game.Player;

public class Cave extends BattleField{
    public Cave(Player player) {
        super(player, "Magara", new Zombie(), "food",3);
    }
}
