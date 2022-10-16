package fixture;

public class Main {
    public static void main(String[] args) {
        Teams teams= new Teams();

        teams.teamList.add("City");
        teams.teamList.add("Barca");
        teams.teamList.add("Manu");
        teams.teamList.add("Liv");
        teams.teamList.add("Milan");
        teams.teamList.add("PSG");

        teams.printFixture();
    }
}
