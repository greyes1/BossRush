package rush.boss.edu.bossrush;

import java.util.ArrayList;

public class heroCard extends Card  {

    private static ArrayList<Card> heroes = new ArrayList<>();

    public ArrayList<Card> getCards() {
        return heroes;
    }

    static {
        Card HERO0001 = new Card();
        HERO0001.setID ("HERO0001");
        HERO0001.setName("The Lost Boy");
        HERO0001.setHealth(100);
        HERO0001.setAttack(5);
        HERO0001.setDefense(5);

        Card HERO0002 = new Card();
        HERO0002.setID ("HERO0002");
        HERO0002.setName("The Weaponsmith");
        HERO0002.setHealth(100);
        HERO0002.setAttack(7);
        HERO0002.setDefense(3);

        Card HERO0003 = new Card();
        HERO0003.setID ("HERO0003");
        HERO0003.setName("The Medicine Man");
        HERO0003.setHealth(75);
        HERO0003.setAttack(3);
        HERO0003.setDefense(7);

        Card HERO0004 = new Card();
        HERO0004.setID ("HERO0004");
        HERO0004.setName("The Martial Artist");
        HERO0004.setHealth(125);
        HERO0004.setAttack(3);
        HERO0004.setDefense(4);

        heroes.add(HERO0001);
        heroes.add(HERO0002);
        heroes.add(HERO0003);
        heroes.add(HERO0004);
    }
}
