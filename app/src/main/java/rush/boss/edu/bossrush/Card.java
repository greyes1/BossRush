package rush.boss.edu.bossrush;

public class Card {
    private String id;
    private String name;
    private int health;
    private int attack;
    private int defense;
    private String type;
    private String rarity;

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
}
