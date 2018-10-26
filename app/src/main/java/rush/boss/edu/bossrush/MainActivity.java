package rush.boss.edu.bossrush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

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

        public String getName() {
            return name;
        }

        public void doTurn(){
            System.out.print("It is the " + getName() + "'s turn");
        }
    }

    private class Hero extends Being{
        @Override
        public void doTurn() {
            super.doTurn();
            System.out.print("I am a HERO!");
        }
    }
    private class Monster extends Being{
        @Override
        public void doTurn() {
            super.doTurn();
            System.out.print("I am a MONSTER!!");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Hero myHero = new Hero();
        Monster myMon = new Monster();

        boolean win =  gameStart(myHero, myMon);

        if(win){
            System.out.println("You Win");
        }else{
            System.out.println("You Lose");
        }
    }



    public boolean gameStart(Hero hero, Monster mon){
        Random rand = new Random();

        Being current;

        //Determine first
        if(rand.nextBoolean()) current = hero;
        else current = mon;

        while(hero.getHealth() > 0 && mon.getHealth() > 0){
            //DO TURNS
            current.doTurn();

            if(hero == current) current = mon;
            else if (mon == current) current = hero;
        }

        if(hero.getHealth() <= 0)  return false;
        else return true;
    }

}
