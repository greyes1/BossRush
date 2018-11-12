package main.java.rush.boss.edu.bossrush.Cards;

public class starterCard {
    String name;
    String cardID;
    int health;
    int baseAttack;
    int baseDefense;

    starterCard(String cardID, String name, int health, int baseAttack, int baseDefense) {
        this.cardID = cardID;
        this.name = name;
        this.health = health;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
    }
}


