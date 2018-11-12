package main.java.rush.boss.edu.bossrush.Cards;

//import java.util.ArrayList;
import java.util.HashMap;

public class environmentCards {

//    private static ArrayList<starterCard> environments = new ArrayList<>();
    private static HashMap<String, String> environments = new HashMap<>();

//    public ArrayList<starterCard> getCards() {
//        return environments;
//    }
    public HashMap<String, String> getCards() {
        return environments;
    }

    static {
//        starterCard environment1 = new starterCard("ENV00001", "Desolate City", 0, 0, 0);
//        starterCard environment2 = new starterCard("ENV00002", "Ancient Temple", 0, 0, 0);
//        starterCard environment3 = new starterCard("ENV00003", "Volcanic Island", 0, 0, 0);
//        starterCard environment4 = new starterCard("ENV00004", "Sinking Ship", 0, 0, 0);
//        starterCard environment5 = new starterCard("ENV00005", "Cosmic Space", 0, 0, 0);
//
//        environments.add(environment1);
//        environments.add(environment2);
//        environments.add(environment3);
//        environments.add(environment4);
//        environments.add(environment5);

        environments.put("ENV00001", "Desolate City");
        environments.put("ENV00002", "Ancient Temple");
        environments.put("ENV00003", "Volcanic Island");
        environments.put("ENV00004", "Sinking Ship");
        environments.put("ENV00005", "Cosmic Space");
    }
}
