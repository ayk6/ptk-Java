package ClassPrac;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;


    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge=dodge;
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " -> " + foe.name + " " +
                "" + this.damage + " hasar");
        if (foe.isDodge()) {
            System.out.println(foe.name + " blokladı");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge() {
        double randomNum = Math.random() * 100;
        return randomNum <= this.dodge;
    }
}
