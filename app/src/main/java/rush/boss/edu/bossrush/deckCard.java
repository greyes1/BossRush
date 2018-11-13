package rush.boss.edu.bossrush;

import java.util.ArrayList;

public class deckCard extends Card {
    private static ArrayList<Card> deck = new ArrayList<>();

    public ArrayList<Card> getCards() {
        return deck;
    }

    static {
        Card DECK0001 = new Card();
        DECK0001.setID ("DECK0001");
        DECK0001.setName("Silver Bullets");
        DECK0001.setType("Item");
        DECK0001.setRarity("Super Rare");

        Card DECK0002 = new Card();
        DECK0002.setID ("DECK0002");
        DECK0002.setName("Tactical Roll");
        DECK0002.setType("Skill");
        DECK0002.setRarity("Uncommon");

        Card DECK0003 = new Card();
        DECK0003.setID ("DECK0003");
        DECK0003.setName("All Tied Up");
        DECK0003.setType("Skill");
        DECK0003.setRarity("Rare");

        Card DECK0004 = new Card();
        DECK0004.setID ("DECK0004");
        DECK0004.setName("Disorientation");
        DECK0004.setType("Skill");
        DECK0004.setRarity("Common");

        Card DECK0005 = new Card();
        DECK0005.setID ("DECK0005");
        DECK0005.setName("Impenetrable Barrier");
        DECK0005.setType("Spell");
        DECK0005.setRarity("Super Rare");

        Card DECK0006 = new Card();
        DECK0006.setID ("DECK0006");
        DECK0006.setName("Unlocked Potential");
        DECK0006.setType("Skill");
        DECK0006.setRarity("Super Rare");

        Card DECK0007 = new Card();
        DECK0007.setID ("DECK0007");
        DECK0007.setName("Upgraded Weaponry");
        DECK0007.setType("Item");
        DECK0007.setRarity("Rare");

        Card DECK0008 = new Card();
        DECK0008.setID ("DECK0008");
        DECK0008.setName("Enhanced Defenses");
        DECK0008.setType("Item");
        DECK0008.setRarity("Rare");

        Card DECK0009 = new Card();
        DECK0009.setID ("DECK0009");
        DECK0009.setName("Weapons Cache");
        DECK0009.setType("Item");
        DECK0009.setRarity("Rare");

        Card DECK0010 = new Card();
        DECK0010.setID ("DECK0010");
        DECK0010.setName("Lash Out");
        DECK0010.setType("Skill");
        DECK0010.setRarity("Uncommon");

        Card DECK0011 = new Card();
        DECK0011.setID ("DECK0011");
        DECK0011.setName("Unleashed Inner Strength");
        DECK0011.setType("Skill");
        DECK0011.setRarity("Common");

        Card DECK0012 = new Card();
        DECK0012.setID ("DECK0012");
        DECK0012.setName("Strategic Retreat");
        DECK0012.setType("Skill");
        DECK0012.setRarity("Uncommon");

        Card DECK0013 = new Card();
        DECK0013.setID ("DECK0013");
        DECK0013.setName("Healing Spell");
        DECK0013.setType("Spell");
        DECK0013.setRarity("Rare");

        Card DECK0014 = new Card();
        DECK0014.setID ("DECK0014");
        DECK0014.setName("Time Bomb");
        DECK0014.setType("Item");
        DECK0014.setRarity("Legendary");

        Card DECK0015 = new Card();
        DECK0015.setID ("DECK0015");
        DECK0015.setName("Sword Throw");
        DECK0015.setType("Item");
        DECK0015.setRarity("Rare");

        Card DECK0016 = new Card();
        DECK0016.setID ("DECK0016");
        DECK0016.setName("Channel the Lightning");
        DECK0016.setType("Spell");
        DECK0016.setRarity("Uncommon");

        Card DECK0017 = new Card();
        DECK0017.setID ("DECK0017");
        DECK0017.setName("Smoke Bomb");
        DECK0017.setType("Item");
        DECK0017.setRarity("Common");

        Card DECK0018 = new Card();
        DECK0018.setID ("DECK0018");
        DECK0018.setName("Chainmail Armor");
        DECK0018.setType("Item");
        DECK0018.setRarity("Common");

        Card DECK0019 = new Card();
        DECK0019.setID ("DECK0019");
        DECK0019.setName("Heavy Claymore");
        DECK0019.setType("Item");
        DECK0019.setRarity("Common");

        Card DECK0020 = new Card();
        DECK0020.setID ("DECK0020");
        DECK0020.setName("Play it Safe");
        DECK0020.setType("Skill");
        DECK0020.setRarity("Super Rare");

        Card DECK0021 = new Card();
        DECK0021.setID ("DECK0021");
        DECK0021.setName("Do it Again");
        DECK0021.setType("Skill");
        DECK0021.setRarity("Uncommon");

        Card DECK0022 = new Card();
        DECK0022.setID ("DECK0022");
        DECK0022.setName("Turn the Tables");
        DECK0022.setType("Skill");
        DECK0022.setRarity("Legendary");

        Card DECK0023 = new Card();
        DECK0023.setID ("DECK0023");
        DECK0023.setName("Role Reversal");
        DECK0023.setType("Spell");
        DECK0023.setRarity("Common");

        Card DECK0024 = new Card();
        DECK0024.setID ("DECK0024");
        DECK0024.setName("Successful Barter");
        DECK0024.setType("Skill");
        DECK0024.setRarity("Uncommon");

        Card DECK0025 = new Card();
        DECK0025.setID ("DECK0025");
        DECK0025.setName("Hit Me!");
        DECK0025.setType("Skill");
        DECK0025.setRarity("Legendary");

        Card DECK0026 = new Card();
        DECK0026.setID ("DECK0026");
        DECK0026.setName("Rebound");
        DECK0026.setType("Spell");
        DECK0026.setRarity("Rare");

        deck.add(DECK0001);
        deck.add(DECK0002);
        deck.add(DECK0003);
        deck.add(DECK0004);
        deck.add(DECK0005);
        deck.add(DECK0006);
        deck.add(DECK0007);
        deck.add(DECK0008);
        deck.add(DECK0009);
        deck.add(DECK0010);
        deck.add(DECK0011);
        deck.add(DECK0012);
        deck.add(DECK0013);
        deck.add(DECK0014);
        deck.add(DECK0015);
        deck.add(DECK0016);
        deck.add(DECK0017);
        deck.add(DECK0018);
        deck.add(DECK0019);
        deck.add(DECK0020);
        deck.add(DECK0021);
        deck.add(DECK0022);
        deck.add(DECK0023);
        deck.add(DECK0024);
        deck.add(DECK0025);
        deck.add(DECK0026);
    }
}
