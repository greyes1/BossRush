package rush.boss.edu.bossrush;


public abstract class Being {
    private String id;
    private String name;

    private int health;
    private int attack;
    private int defense;


    public Being(String id){
        this.id = id;
    }
    public int getHealth(){
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public abstract String getType();

//    public void doTurn(MainActivity.Hero hero, MainActivity.Monster mon){
//        System.out.print("It is the " + getName() + "'s turn");
//    }
}

