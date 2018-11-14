package rush.boss.edu.bossrush;

import java.util.ArrayList;
import java.util.HashMap;

public class monsterCards extends Card {

    private static monsterCards[] monDeck = {
            new monsterCards("MONS0001", "Violet Sorceress", 75,11,2, "R"),
            new monsterCards("MONS0002", "Violet Sorceress", 125, 10, 3, "R"),
            new monsterCards("MONS0003", "Enraged Warrior", 100, 12, 1, "R"),
    };

    public monsterCards(String id) {
        super(id);
        Card monster = getCard(id);
        setName(monster.getName());
        setHealth(monster.getHealth());
        setAttack(monster.getAttack());
        setDefense(monster.getDefense());
        setRarity(monster.getRarity());
    }

    public monsterCards(String id, String name, int health, int attack, int defense, String rarity) {
        super(id, name, health, attack, defense, rarity);
        setType("MONSTER");
    }

    public Card[] getCards(String id) {
        return monDeck;
    }
    public Card getCard(String id){
        for(int i = 0; i<monDeck.length-1; i++){
            if (monDeck[i].getId().equals(id)) return monDeck[i];
        }
        return null;
    }
    public void monsterTimer(String name, int time){
        timers.put(name,time);
    }

}
