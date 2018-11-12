package rush.boss.edu.bossrush;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    Intent toBattle;

/*
    private class Decklist{
        private class starterCard{
            int id;
            int name;
            String type;
            String Rarity;
            String effectText;
        }
        starterCard[] cards;
        private starterCard selectCard(int cardId){
            //We could use index 0 to be the default attack
            return cards[cardId];
        }
    }
*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        boolean win =  gameStart(myHero, myMon);

        Button beginSelection = findViewById(R.id.beginSelection);
        Button startNFC = findViewById(R.id.startNFC);

        final TextView testOutput = findViewById(R.id.testOutput);


        beginSelection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Send to NFC activity but in the meantime:

//                //Pick hero, normally they'd be pulled from NFC
//                String myHeroId = "HER0001";
//                //Pick Monster
//                String myMonId = "MON0001";
//
//                Bundle fighters = new Bundle();
//                fighters.putString("HERO", myHeroId);
//                fighters.putString("MON",myMonId);

//                //Play Game
//                toBattle.setClass(getApplicationContext(), BattleActivity.class);
//                toBattle.putExtras(fighters);
//                startActivity(toBattle);
//            setContentView(R.layout.selection_screen);
                Intent select = new Intent();
                select.setClass(getApplicationContext(), SelectionActivity.class);
                startActivity(select);

            }
        });

        startNFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testOutput.setText("Reading from NFC");
            }
        });

    }




}
