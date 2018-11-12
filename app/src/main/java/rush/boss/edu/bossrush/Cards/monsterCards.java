package main.java.rush.boss.edu.bossrush.Cards;

import java.util.ArrayList;

public class monsterCards {

    private static ArrayList<starterCard> monsters = new ArrayList<>();

    public ArrayList<starterCard> getCards() {
        return monsters;
    }

    static {
        starterCard monster1 = new starterCard("MON00001", "Violet Sorceress", 75, 11, 2);
        starterCard monster2 = new starterCard("MON00002", "Last Defender", 125, 10, 3);
        starterCard monster3 = new starterCard("MON00003", "Enraged Warrior", 100, 12, 1);

        monsters.add(monster1);
        monsters.add(monster2);
        monsters.add(monster3);
    }
}
