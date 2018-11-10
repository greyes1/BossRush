package main.java.rush.boss.edu.bossrush.deckcards;

public class Card {
    String name;
    String cardID;
    int health;
    int baseAttack;
    int baseDefense;

    Card(String cardID, String name, int health, int baseAttack, int baseDefense) {
        this.cardID = cardID;
        this.name = name;
        this.health = health;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
    }
}


