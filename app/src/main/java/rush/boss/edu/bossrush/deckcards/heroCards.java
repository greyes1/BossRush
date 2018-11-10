package main.java.rush.boss.edu.bossrush.deckcards;

import java.util.ArrayList;

public class heroCards {

    ArrayList<Card> heroes = new ArrayList<Card>();

    public ArrayList<Card> getCards() {
        return heroes;
    }

    Card hero1 = new Card("HER00001", "The Lost Boy", 100, 5, 5);
    Card hero2 = new Card("HER00002", "The Weaponsmith", 100, 7, 3);
    Card hero3 = new Card("HER00003", "The Medicine Man", 75, 3, 7);
    Card hero4 = new Card("HER00004", "The Martial Artist", 125, 3, 4);

    heroes.add(hero1);
    heroes.add(hero2);
    heroes.add(hero3);
    heroes.add(hero4);
}
