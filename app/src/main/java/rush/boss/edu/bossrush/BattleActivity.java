package rush.boss.edu.bossrush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import javax.crypto.EncryptedPrivateKeyInfo;


public class BattleActivity extends AppCompatActivity {
    Button exitButton;
    public class Game {
        String heroStr;
        String monStr;

        heroCards hero;
        monsterCards mon;

        TextView[] heroAttr;
        TextView[] monAttr;
        deckCards deck;


        public Game(String heroStr, String monStr){
            this.heroStr = heroStr;
            this.monStr = monStr;
        }


        private void doTurn(Card actor) {
            //Take user input (SUPER WIP)
            //if(false)Decklist.selectCard(0);
            //NFC CARD PICK HERE

//            Log.v("I am a", actor.getType());

            if(actor.getType() == "HERO"){
                //Do a hero's turn, get input
                String input;

                //After getting input
//                if(deck.getCard() != null)

                /*switch (input){
                    case "DECK0001":

                        break;
                    case "DECK0002":

                        break;
                    case "DECK0003":

                        break;
                    case "DECK0004":

                        break;
                    case "DECK0005":

                        break;

                }*/

            }else{
                //Do a monster's turn
                int battleMove = 0;
                int attack = 1;
                int defend = 2;
                int heal = 3;
                Random rand= new Random();
                TextView modHealth;

                if (actor.getHealth() < 100 && actor.getHealth() >= 66) {
                    battleMove = 1;
                }
                if (actor.getHealth() < 65 && actor.getHealth() >= 33) {
                    battleMove = rand.nextInt(2);
                }
                if (actor.getHealth() < 32 && actor.getHealth() > 0) {
                    battleMove = rand.nextInt(3);
                }

                if (battleMove == attack) {
                    hero.setHealth(hero.getHealth() - 12);
                    modHealth = findViewById(R.id.heroHealth);
                    modHealth.setText(Integer.toString(hero.getHealth()));
//                    System.out.println( mon.getName() + " attacks " + hero.getName() + "!");

                }

                else if (battleMove == defend) {
                    //manipulate defense for the next turn
//                    System.out.println( mon.getName() + " defends themselves!");

                }
                else if (battleMove == heal) {
                    mon.setHealth(mon.getHealth() + 1);
//                    System.out.println( mon.getName() + " is healing!");
                }
                else {
//                    System.out.println( mon.getName() + " falters!");
                }

            }
        }

        private boolean Start(){
            Random rand = new Random();
            Card current;

            //Determine charactors

            hero = new heroCards(heroStr);
            mon = new monsterCards(monStr);

            //Determine first
            if(rand.nextBoolean()) current = hero;
            else current = mon;

            //Display who goes first
            TextView currentActor = findViewById(R.id.currentTurn);

            TextView[] heroAttr = {
                    findViewById(R.id.heroName),
                    findViewById(R.id.heroHealth),
                    findViewById(R.id.heroAttack),
                    findViewById(R.id.heroDefense)
            };
            TextView[] monAttr = {
                    findViewById(R.id.monName),
                    findViewById(R.id.monHealth),
                    findViewById(R.id.monAttack),
                    findViewById(R.id.monDefense)
            };

            currentActor.setText(current.getName());

            heroAttr[0].setText(hero.getName());
            heroAttr[1].setText(Integer.toString(hero.getHealth()));
            heroAttr[2].setText(Integer.toString(hero.getAttack()));
            heroAttr[3].setText(Integer.toString(hero.getDefense()));

            monAttr[0].setText(mon.getName());
            monAttr[1].setText(Integer.toString(mon.getHealth()));
            monAttr[2].setText(Integer.toString(mon.getAttack()));
            monAttr[3].setText(Integer.toString(mon.getDefense()));
            while(hero.getHealth() > 0 && mon.getHealth() > 0){
                //DO TURNS
                doTurn(current);

                if(hero == current) current = mon;
                else if (mon == current) current = hero;

                currentActor.setText(current.getId());
            }


            if(hero.getHealth() >= 0)  {
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

        String envID = intent.getStringExtra("ENV");


        //When we implement the deck
        //Game game = new Game(getCard(hero), getCard(mon));
        Game game = new Game(intent.getStringExtra("HERO"), intent.getStringExtra("MON"));

        exitButton = findViewById(R.id.exitBattle);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent();
                main.setClass(getApplicationContext(), MainActivity.class);
                startActivity(main);
            }
        });
        game.Start();

    }


}
