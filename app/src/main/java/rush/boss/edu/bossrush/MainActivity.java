package rush.boss.edu.bossrush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private class Being{
        private String id;
        private String name;

        private int health;
        private int attack;
        private int defense;
        public int getHealth(){
            return health;
        }
    }

    private class Hero extends Being{

    }
    private class Monster extends Being{

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Hero myHero = new Hero();
    Monster myMon = new Monster();
    public boolean gameStart(Hero hero, Monster mon){
        while(hero.getHealth() >= 0 && mon.getHealth() > 0){
            //DO TURNS

        }
        if(hero.getHealth() <= 0)  return false;
        else return true;
    }

}
