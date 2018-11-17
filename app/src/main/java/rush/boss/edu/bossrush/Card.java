package rush.boss.edu.bossrush;

import java.util.HashMap;
import java.util.Map;

public abstract class Card {
    private String id;
    private String name;
    private int health;
    private int attack;
    private int defense;
    private String type;
    private String rarity;
    HashMap<String, Integer> timers = new HashMap<>();

    public Card(){
    }

    public Card(String id){
        this.id = id;
    }

    public Card(String id, String name, int health, int attack, int defense, String rarity) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;

    }
    public Card(String id, String name, String type, String rarity){
        this.id = id;
        this.name = name;
        this.type = type;
        this.rarity = rarity;
    }


    public void setID(String id){
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setName(String name)  {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth(){ return health; }

    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getAttack() {
        return attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
    public int getDefense() {
        return defense;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
    public String getRarity() {
        return rarity;
    }
    public void procTimer(){
        for(Map.Entry<String, Integer> effect : timers.entrySet()){
            Integer i  = effect.getValue();
            if (i > 0)
                effect.setValue(i - 1);
        }
    }
}
