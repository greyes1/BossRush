package rush.boss.edu.bossrush;

import java.util.ArrayList;

public class monsterCard extends Card {

    private static ArrayList<Card> monsters = new ArrayList<>();

    public ArrayList<Card> getCards() {
        return monsters;
    }

    static {
        Card MONS0001 = new Card();
        MONS0001.setID ("MONS0001");
        MONS0001.setName("Violet Sorceress");
        MONS0001.setHealth(75);
        MONS0001.setAttack(11);
        MONS0001.setDefense(2);

        Card MONS0002 = new Card();
        MONS0002.setID ("MONS0002");
        MONS0002.setName("Violet Sorceress");
        MONS0002.setHealth(125);
        MONS0002.setAttack(10);
        MONS0002.setDefense(3);

        Card MONS0003 = new Card();
        MONS0003.setID ("MONS0003");
        MONS0003.setName("Enraged Warrior");
        MONS0003.setHealth(100);
        MONS0003.setAttack(12);
        MONS0003.setDefense(1);

        monsters.add(MONS0001);
        monsters.add(MONS0002);
        monsters.add(MONS0003);
    }
}
