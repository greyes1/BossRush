package rush.boss.edu.bossrush;

import android.util.Log;

public class heroCards extends Card  {
    private static heroCards[] heroDeck = {
        new heroCards("HERO0001", "The Lost Boy", 100, 5, 5, "N" ),
        new heroCards("HERO0002", "The Weaponsmith", 100, 7, 3, "R"),
        new heroCards("HERO0003", "The Medicine Man", 75, 3, 7, "R"),
        new heroCards("HERO0004", "The Martial Artist", 125, 3, 4, "R")
    };


    public heroCards(String id) {
        super(id);
        Card hero = getCard(id);
        setName(hero.getName());
        setHealth(hero.getHealth());
        setAttack(hero.getAttack());
        setDefense(hero.getDefense());
        setRarity(hero.getRarity());
        setType("HERO");
    }

    private heroCards(String id, String name, int health, int attack, int defense, String rarity) {
        super(id, name, health, attack, defense, rarity);
        setType("HERO");
    }

    private Card[] getCards() {
        return heroDeck;
    }

    public Card getCard(String id){
        for(int i = 0; i<heroDeck.length-1; i++){
            if (heroDeck[i].getId().equals(id)) return heroDeck[i];
        }
        return null;
    }

}
