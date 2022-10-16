package fixture;

import java.util.*;

public class Teams {
    List<String> teamList = new ArrayList<>();

    public void printFixture() {
        if (teamList.size() % 2 != 0) teamList.add("pass");

        System.out.println("--- TEAMS ---");
        for (String team : teamList) {
            System.out.println("- " + team);

        }
        match();
    }

    private void match() {
        List<String> tempTeams = new ArrayList<>();

        while (teamList.size()>0){
            int index= (int) (Math.random()*teamList.size());
            tempTeams.add(teamList.get(index));
            teamList.remove(index);
        }
        teamList=tempTeams;

        int totalRound=teamList.size()-1;
        int matchPerRound=teamList.size()/2;

        LinkedHashMap<String,ArrayList<ArrayList<String>>> rounds = new LinkedHashMap<>();

        for (int i=0;i<totalRound;i++){
            String round = String.valueOf(i+1);
            rounds.put(round,new ArrayList<ArrayList<String>>());
        }

        for (int i=0;i<totalRound;i++){
            ArrayList<String> home = new ArrayList<>();
            ArrayList<String> away = new ArrayList<>();

            for (int j=0; j<matchPerRound;j++){
                home.add(teamList.get(j));
                away.add(teamList.get((teamList.size()-1)-j));
            }

            String round = String.valueOf(i+1);
            rounds.get(round).add(home);
            rounds.get(round).add(away);

            List<String> newTeams = new ArrayList<>();

            newTeams.add(teamList.get(0));
            newTeams.add(teamList.get((teamList.size() - 1)));

            for (int k=1;k<teamList.size()-1;k++){
                newTeams.add(teamList.get(k));
            }

            teamList=newTeams;

        }
        System.out.println("");

        for (int i =0;i<totalRound*2;i++){
            System.out.println((i+1+". round"));
            for (int j=0;j<matchPerRound;j++){
                if (totalRound>i){
                    System.out.println(rounds.get(String.valueOf(i+1)).get(0).get(j)
                    +" - "+rounds.get(String.valueOf(i+1)).get(1).get(j));
                }
                else {
                    System.out.println(rounds.get(String.valueOf(i+1-totalRound)).get(1).get(j)
                    +" - "+rounds.get(String.valueOf(i+1-totalRound)).get(0).get(j));
                }
            }
            System.out.println("");
        }
    }
}


