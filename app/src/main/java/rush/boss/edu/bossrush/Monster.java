package main.java.rush.boss.edu.bossrush;

public class Monster extends Being{

    public Monster(String id) {
        super(id);
        setAttack(3);
        setDefense(1);
        setHealth(40);
        setName("MonsterMan");
    }

    @Override
    public String getType() {
        return "Monster!";
    }

}
