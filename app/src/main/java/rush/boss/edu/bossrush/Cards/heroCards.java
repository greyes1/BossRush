package rush.boss.edu.bossrush.Cards;

import java.util.ArrayList;

public class heroCards {

    private static ArrayList<starterCard> heroes = new ArrayList<>();

    public ArrayList<starterCard> getCards() {
        return heroes;
    }

    static {
        starterCard hero1 = new starterCard("HER00001", "The Lost Boy", 100, 5, 5);
        starterCard hero2 = new starterCard("HER00002", "The Weaponsmith", 100, 7, 3);
        starterCard hero3 = new starterCard("HER00003", "The Medicine Man", 75, 3, 7);
        starterCard hero4 = new starterCard("HER00004", "The Martial Artist", 125, 3, 4);


        heroes.add(hero1);
        heroes.add(hero2);
        heroes.add(hero3);
        heroes.add(hero4);
    }
}
