package main.java.rush.boss.edu.bossrush.deckcards;

import java.util.ArrayList;

public class environmentCards {

    private static ArrayList<Card> environments = new ArrayList<>();

    public ArrayList<Card> getCards() {
        return environments;
    }

    static {
        Card environment1 = new Card("ENV00001", "Desolate City", 0, 0, 0);
        Card environment2 = new Card("ENV00002", "Ancient Temple", 0, 0, 0);
        Card environment3 = new Card("ENV00003", "Volcanic Island", 0, 0, 0);
        Card environment4 = new Card("ENV00004", "Sinking Ship", 0, 0, 0);
        Card environment5 = new Card("ENV00005", "Cosmic Space", 0, 0, 0);

        environments.add(environment1);
        environments.add(environment2);
        environments.add(environment3);
        environments.add(environment4);
        environments.add(environment5);
    }
}
