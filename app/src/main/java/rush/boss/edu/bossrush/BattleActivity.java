package rush.boss.edu.bossrush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class BattleActivity extends AppCompatActivity {

    public class Game {
        Hero hero;
        Monster mon;


        public Game(Hero hero, Monster mon){
            this.hero = hero;
            this.mon = mon;
        }


        public void doTurn(Being actor) {
            //Take user input (SUPER WIP)
            //if(false)Decklist.selectCard(0);
            //NFC CARD PICK HERE

            System.out.print("I am a" + actor.getType());

            if(actor.getType() == "Hero"){
                //Do a hero's turn, get input
            }else{
                //Do a monster's turn
            }
        }

        public boolean Start(){
            Random rand = new Random();
            Being current;

            //Determine first
            if(rand.nextBoolean()) current = hero;
            else current = mon;

            //Display who goes first
            TextView currentActor = findViewById(R.id.currentTurn);

            currentActor.setText(current.getId());

            while(hero.getHealth() > 0 && mon.getHealth() > 0){
                //DO TURNS
                doTurn(current);

                if(hero == current) current = mon;
                else if (mon == current) current = hero;

                currentActor.setText(current.getId());
            }

            if(hero.getHealth() <= 0)  {
                System.out.println("You Win");
                return false;
            }
            else{
                System.out.println("You Lose");
                return true;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.battle_layout);

        Intent intent = getIntent();

        String heroId = intent.getStringExtra("HERO");
        String monId = intent.getStringExtra("MON");

        Hero myHero = new Hero(heroId);
        Monster myMon = new Monster(monId);
        //When we implement the deck
        //Game game = new Game(getCard(hero), getCard(mon));
        Game game = new Game(myHero, myMon);


        game.Start();
    }

}
