package rush.boss.edu.bossrush;

import java.util.ArrayList;

public class deckCards extends Card {
    private static deckCards[] deck= {
        new deckCards("DECK0001", "Silver Bullets", "Item", "Super Rare"),
        new deckCards("DECK0002", "Tactical Roll", "Skill", "Uncommon"),
        new deckCards("DECK0003", "All Tied Up", "Skill", "Rare"),
        new deckCards("DECK0004", "Disorientation", "Skill", "Common"),
        new deckCards("DECK0005", "Impenetrable Barrier", "Spell", "Super Rare"),
        new deckCards("DECK0006", "Unlocked Potential", "Skill", "Super Rare"),
        new deckCards("DECK0007", "Upgraded Weaponry", "Item", "Rare"),
        new deckCards("DECK0008", "Enhanced Defense", "Item", "Rare"),
        new deckCards("DECK0009", "Weapons Cache", "Item", "Rare"),
        new deckCards("DECK0010", "Lash Out", "Skill", "Common"),
        new deckCards("DECK0011", "Inner Strength", "Skill", "Common"),
        new deckCards("DECK0012", "Strategic Retreat", "Skill", "Uncommon"),
        new deckCards("DECK0013", "Healing Spell", "Spell", "Rare"),
        new deckCards("DECK0014", "Time Bomb", "Item", "Legendary"),
        new deckCards("DECK0015", "Sword Throw", "Item", "Rare"),
        new deckCards("DECK0016", "Channel the Lightning", "Spell", "Uncommon"),
        new deckCards("DECK0017", "Smoke Bomb", "Item", "Common"),
        new deckCards("DECK0018", "Chainmail Armor", "Item", "Common"),
        new deckCards("DECK0019", "Heavy Claymore", "Item", "Common"),
        new deckCards("DECK0020", "Play it Safe", "Skill", "Super Rare"),
        new deckCards("DECK0021", "Do it Again", "Skill", "Uncommon"),
        new deckCards("DECK0022", "Turn the Tables", "Skill", "Legendary"),
        new deckCards("DECK0023", "Role Reversal", "Spell", "Common"),
        new deckCards("DECK0024", "Successful Barter", "Skill", "Uncommon"),
        new deckCards("DECK0025", "Hit Me!", "Skill", "Legendary"),
        new deckCards("DECK0026", "Rebound", "Spell", "Rare"),
        new deckCards("DECK0027", "Temporal Surge", "Spell", "Rare"),
        new deckCards("DECK0028", "Change the Future", "Spell", "Super Rare")
    };

    public deckCards() {
    }

    public deckCards(String id, String name, String type, String rarity) {
        super(id, name, type, rarity);
    }

    public deckCards[] getCards() {
        return deck;
    }
    public Card getCard(String id){
        for(int i = 0; i<deck.length-1; i++){
            if (deck[i].getId().equals(id)) return deck[i];
        }
        return null;
    }


/*        Card DECK0006 = new deckCard();
        DECK0006.setID ("DECK0006");
        DECK0006.setName("Unlocked Potential");
        DECK0006.setType("Skill");
        DECK0006.setRarity("Super Rare");

        Card DECK0007 = new deckCard();
        DECK0007.setID ("DECK0007");
        DECK0007.setName("Upgraded Weaponry");
        DECK0007.setType("Item");
        DECK0007.setRarity("Rare");

        Card DECK0008 = new deckCard();
        DECK0008.setID ("DECK0008");
        DECK0008.setName("Enhanced Defenses");
        DECK0008.setType("Item");
        DECK0008.setRarity("Rare");

        Card DECK0009 = new deckCard();
        DECK0009.setID ("DECK0009");
        DECK0009.setName("Weapons Cache");
        DECK0009.setType("Item");
        DECK0009.setRarity("Rare");

        Card DECK0010 = new deckCard();
        DECK0010.setID ("DECK0010");
        DECK0010.setName("Lash Out");
        DECK0010.setType("Skill");
        DECK0010.setRarity("Uncommon");

        Card DECK0011 = new deckCard();
        DECK0011.setID ("DECK0011");
        DECK0011.setName("Unleashed Inner Strength");
        DECK0011.setType("Skill");
        DECK0011.setRarity("Common");

        Card DECK0012 = new deckCard();
        DECK0012.setID ("DECK0012");
        DECK0012.setName("Strategic Retreat");
        DECK0012.setType("Skill");
        DECK0012.setRarity("Uncommon");

        Card DECK0013 = new deckCard();
        DECK0013.setID ("DECK0013");
        DECK0013.setName("Healing Spell");
        DECK0013.setType("Spell");
        DECK0013.setRarity("Rare");

        Card DECK0014 = new deckCard();
        DECK0014.setID ("DECK0014");
        DECK0014.setName("Time Bomb");
        DECK0014.setType("Item");
        DECK0014.setRarity("Legendary");

        Card DECK0015 = new deckCard();
        DECK0015.setID ("DECK0015");
        DECK0015.setName("Sword Throw");
        DECK0015.setType("Item");
        DECK0015.setRarity("Rare");

        Card DECK0016 = new deckCard();
        DECK0016.setID ("DECK0016");
        DECK0016.setName("Channel the Lightning");
        DECK0016.setType("Spell");
        DECK0016.setRarity("Uncommon");

        Card DECK0017 = new deckCard();
        DECK0017.setID ("DECK0017");
        DECK0017.setName("Smoke Bomb");
        DECK0017.setType("Item");
        DECK0017.setRarity("Common");

        Card DECK0018 = new deckCard();
        DECK0018.setID ("DECK0018");
        DECK0018.setName("Chainmail Armor");
        DECK0018.setType("Item");
        DECK0018.setRarity("Common");

        Card DECK0019 = new deckCard();
        DECK0019.setID ("DECK0019");
        DECK0019.setName("Heavy Claymore");
        DECK0019.setType("Item");
        DECK0019.setRarity("Common");

        Card DECK0020 = new deckCard();
        DECK0020.setID ("DECK0020");
        DECK0020.setName("Play it Safe");
        DECK0020.setType("Skill");
        DECK0020.setRarity("Super Rare");

        Card DECK0021 = new deckCard();
        DECK0021.setID ("DECK0021");
        DECK0021.setName("Do it Again");
        DECK0021.setType("Skill");
        DECK0021.setRarity("Uncommon");

        Card DECK0022 = new deckCard();
        DECK0022.setID ("DECK0022");
        DECK0022.setName("Turn the Tables");
        DECK0022.setType("Skill");
        DECK0022.setRarity("Legendary");

        Card DECK0023 = new deckCard();
        DECK0023.setID ("DECK0023");
        DECK0023.setName("Role Reversal");
        DECK0023.setType("Spell");
        DECK0023.setRarity("Common");

        Card DECK0024 = new deckCard();
        DECK0024.setID ("DECK0024");
        DECK0024.setName("Successful Barter");
        DECK0024.setType("Skill");
        DECK0024.setRarity("Uncommon");

        Card DECK0025 = new deckCard();
        DECK0025.setID ("DECK0025");
        DECK0025.setName("Hit Me!");
        DECK0025.setType("Skill");
        DECK0025.setRarity("Legendary");

        Card DECK0026 = new deckCard();
        DECK0026.setID ("DECK0026");
        DECK0026.setName("Rebound");
        DECK0026.setType("Spell");
        DECK0026.setRarity("Rare");*/
}
