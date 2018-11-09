package rush.boss.edu.bossrush;
public class Hero extends Being{

    public Hero(String id) {
        super(id);
        setAttack(5);
        setDefense(5);
        setHealth(20);
        setName("HeroMan");
    }



    @Override
    public String getType() {
        return "Hero";
    }
}
