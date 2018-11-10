package main.java.rush.boss.edu.bossrush.deckcards;

import java.util.ArrayList;

public class monsterCards {

    private static ArrayList<Card> monsters = new ArrayList<>();

    public ArrayList<Card> getCards() {
        return monsters;
    }

    static {
        Card monster1 = new Card("MON00001", "Violet Sorceress", 75, 11, 2);
        Card monster2 = new Card("MON00002", "Last Defender", 125, 10, 3);
        Card monster3 = new Card("MON00003", "Enraged Warrior", 100, 12, 1);

        monsters.add(monster1);
        monsters.add(monster2);
        monsters.add(monster3);
    }
}
