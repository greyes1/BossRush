package main.java.rush.boss.edu.bossrush.Cards;

public class deckCard {
    String name;
    int cardID;
    String type;
    String rarity;

    deckCard(int cardID, String name, String type, String rarity) {
        this.cardID = cardID;
        this.name = name;
        this.type = type;
        this.rarity = rarity;

    }
}
