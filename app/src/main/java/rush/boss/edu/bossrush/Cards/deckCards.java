package main.java.rush.boss.edu.bossrush.Cards;

import java.util.ArrayList;

public class deckCards {
    private static ArrayList<deckCard> deck = new ArrayList<>();

    public ArrayList<deckCard> getCards() {
        return deck;
    }

    static {

        deckCard deck01 = new deckCard(00000001, "Silver Bullets", "Item", "Super Rare");
        deckCard deck02 = new deckCard(00000002, "Tactical Roll", "Skill", "Uncommon");
        deckCard deck03 = new deckCard(00000003, "All Tied Up", "Skill", "Rare");
        deckCard deck04 = new deckCard(00000004, "Disorientation", "Skill", "Common");
        deckCard deck05 = new deckCard(00000005, "Impenetrable Barrier", "Spell", "Super Rare");
        deckCard deck06 = new deckCard(00000006, "Unlocked Potential", "Skill", "Super Rare");
        deckCard deck07 = new deckCard(00000007, "Upgraded Weaponry", "Item", "Rare");
        deckCard deck08 = new deckCard(00000010, "Enhanced Defenses", "Item", "Rare");
        deckCard deck09 = new deckCard(00000011, "Weapons Cache", "Item", "Rare");
        deckCard deck10 = new deckCard(00000012, "Lash Out", "Skill", "Uncommon");
        deckCard deck11 = new deckCard(00000013, "Unleashed Inner Strength", "Skill", "Common");
        deckCard deck12 = new deckCard(00000014, "Strategic Retreat", "Skill", "Uncommon");
        deckCard deck13 = new deckCard(00000015, "Healing Spell", "Spell", "Rare");
        deckCard deck14 = new deckCard(00000016, "Time Bomb", "Item", "Legendary");
        deckCard deck15 = new deckCard(00000017, "Sword Throw", "Item", "Rare");
        deckCard deck16 = new deckCard(00000020, "Channel the Lightning", "Spell", "Uncommon");
        deckCard deck17 = new deckCard(00000021, "Smoke Bomb", "Item", "Common");
        deckCard deck18 = new deckCard(00000022, "Chainmail Armor", "Item", "Common");
        deckCard deck19 = new deckCard(00000023, "Heavy Claymore", "Item", "Common");
        deckCard deck20 = new deckCard(00000024, "Play it Safe", "Skill", "Super Rare");
        deckCard deck21 = new deckCard(00000025, "Do it Again", "Skill", "Uncommon");
        deckCard deck22 = new deckCard(00000026, "Turn the Tables", "Skill", "Legendary");
        deckCard deck23 = new deckCard(00000027, "Role Reversal", "Spell", "Common");
        deckCard deck24 = new deckCard(00000030, "Successful Barter", "Skill", "Uncommon");
        deckCard deck25 = new deckCard(00000031, "Hit Me!", "Skill", "Legendary");
        deckCard deck26 = new deckCard(00000032, "Rebound", "Spell", "Rare");

        deck.add(deck01);
        deck.add(deck02);
        deck.add(deck03);
        deck.add(deck04);
        deck.add(deck05);
        deck.add(deck06);
        deck.add(deck07);
        deck.add(deck08);
        deck.add(deck09);
        deck.add(deck10);
        deck.add(deck11);
        deck.add(deck12);
        deck.add(deck13);
        deck.add(deck14);
        deck.add(deck15);
        deck.add(deck16);
        deck.add(deck17);
        deck.add(deck18);
        deck.add(deck19);
        deck.add(deck20);
        deck.add(deck21);
        deck.add(deck22);
        deck.add(deck23);
        deck.add(deck24);
        deck.add(deck25);
        deck.add(deck26);
    }
}
