package rush.boss.edu.bossrush;

public class MonsterMove {

    public MonsterMove()
    {

        int monsterHealth;
        int heroHealth;
        int battleMove = 0;
        int attack = 1;
        int defend = 2;
        int heal = 3;

        monsterHealth = MonsterMan.getHealth;
        heroHealth = HeroMan.getHealth;

        if (monsterHealth < 100 && monsterHealth >= 66) {
            battleMove = 1;
        }
        if (monsterHealth < 65 && monsterHealth >= 33) {
            battleMove = getRandomNumber(2);
        }
        if (monsterHealth < 32 && monsterHealth > 0) {
            battleMove = getRandomNumber(3);
        }

        if (battleMove == attack) {
            HeroMan.setHealth(heroHealth - 12);
            System.out.println( MonsterMan.getName + " attacks " + HeroMan.getName + "!")
        }
        else if (battleMove == defend) {
            //manipulate base defense for the next turn
            System.out.println( MonsterMan.getName + " defends themselves!");
        }
        else if (battleMove == heal) {
            MonsterMan.setHealth(monsterHealth + 1);
            System.out.println( MonsterMan.getName + " is healing!");
        }
        else {
            System.out.println( MonsterMan.getName + " falters!");
        }

    }

}
