package rush.boss.edu.bossrush;

public class Monster extends Being{

    public Monster(String id) {
        super(id);
        setAttack(5);
        setDefense(5);
        setHealth(20);
        setName("HeroMan");
    }

    @Override
    public String getType() {
        return "Monster!";
    }

}
