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

        public void doTurn(Hero hero, Monster mon){
            System.out.print("It is the " + getName() + "'s turn");
        }
    }
/*
    private class Decklist{
        private class Card{
            int id;
            int name;
            String type;
            String Rarity;
            String effectText;
        }
        Card[] cards;
        private Card selectCard(int cardId){
            //We could use index 0 to be the default attack
            return cards[cardId];
        }
    }
*/

    private class Hero extends Being{
        @Override
        public void doTurn(Hero hero, Monster mon) {
            super.doTurn(hero, mon);
            //Take user input (SUPER WIP)
            //if(false)Decklist.selectCard(0);
            //NFC CARD PICK HERE

            System.out.print("I am a HERO!");
        }
    }
    private class Monster extends Being{
        @Override
        public void doTurn(Hero hero, Monster mon) {
            super.doTurn(hero, mon);
            System.out.print("I am a MONSTER!!");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Pick hero
        Hero myHero = new Hero();
        //Pick Monster
        Monster myMon = new Monster();
        //Play Game
        boolean win =  gameStart(myHero, myMon);

        //Did you win?
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
            current.doTurn(hero, mon);

            if(hero == current) current = mon;
            else if (mon == current) current = hero;
        }

        if(hero.getHealth() <= 0)  return false;
        else return true;
    }

}
