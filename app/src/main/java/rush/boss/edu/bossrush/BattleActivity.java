package rush.boss.edu.bossrush;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

import javax.crypto.EncryptedPrivateKeyInfo;


public class BattleActivity extends AppCompatActivity {
    Button exitButton;
    Button turnEnd;
    Button attack;
    NfcAdapter nfcAdapter;


    String heroStr;
    String monStr;

    heroCards hero;
    monsterCards mon;

    Card current;

    Card lastCard;
    Card currentCard;

    boolean skip;
    Random rand = new Random();

    TextView[] heroAttr;
    TextView[] monAttr;
    TextView currentActor;
    TextView cardVis;
    deckCards deck = new deckCards();
    ArrayList<deckCards> usedCards = new ArrayList<>(39);



    @Override
    protected void onNewIntent(Intent intent) {

        super.onNewIntent(intent);

        if (intent.hasExtra(NfcAdapter.EXTRA_TAG)) {
//            Toast.makeText(this, "NfcIntent!", Toast.LENGTH_SHORT).show();
            Parcelable[] parcelables = intent.getParcelableArrayExtra(NfcAdapter.EXTRA_NDEF_MESSAGES);

            if(parcelables != null && parcelables.length > 0)
            {
                readTextFromMessage((NdefMessage) parcelables[0]);
            }else{
                Toast.makeText(this, "No NDEF messages found!", Toast.LENGTH_SHORT).show();
            }

            }/*else{
                Tag tag = intent.getParcelableExtra(NfcAdapter.EXTRA_TAG);
                NdefMessage ndefMessage = createNdefMessage(textTagContent.getText()+"");

                writeNdefMessage(tag, ndefMessage);
            }*/

        }

    private String readTextFromMessage(NdefMessage ndefMessage) {

        NdefRecord[] ndefRecords = ndefMessage.getRecords();

        if(ndefRecords != null && ndefRecords.length>0){

            NdefRecord ndefRecord = ndefRecords[0];

            String tagContent = getTextFromNdefRecord(ndefRecord);


            if(tagContent.contains("DECK") && deck.getCard(tagContent) != null && current.getType().equals("HERO")){
//                textTagContent.setText(tagContent);
//                Toast.makeText(this, tagContent, Toast.LENGTH_SHORT).show();
                currentCard = deck.getCard(tagContent);
                cardVis.setText(currentCard.getName());
//                Toast.makeText(this, deck.getCard(tagContent).getName(), Toast.LENGTH_SHORT).show();

            }
            else Toast.makeText(this, "No deck card found!", Toast.LENGTH_SHORT).show();
            return tagContent;
        }else
        {
            Toast.makeText(this, "No NDEF records found!", Toast.LENGTH_SHORT).show();
            return "no tag found!";
        }
    }

    public String getTextFromNdefRecord(NdefRecord ndefRecord)
    {
        String tagContent = null;
        try {
            byte[] payload = ndefRecord.getPayload();
            String textEncoding = ((payload[0] & 128) == 0) ? "UTF-8" : "UTF-16";
            int languageSize = payload[0] & 0063;
            tagContent = new String(payload, languageSize + 1,
                    payload.length - languageSize - 1, textEncoding);
        } catch (UnsupportedEncodingException e) {
            Log.e("getTextFromNdefRecord", e.getMessage(), e);
        }
        return tagContent;
    }


    @Override
    protected void onResume() {

        Intent intent = new Intent(this, BattleActivity.class);
        intent.addFlags(Intent.FLAG_RECEIVER_REPLACE_PENDING);

        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
        IntentFilter[] intentFilter = new IntentFilter[]{};

        nfcAdapter.enableForegroundDispatch(this, pendingIntent, intentFilter, null);

        super.onResume();
    }

    @Override
    protected void onPause() {

        nfcAdapter.disableForegroundDispatch(this);

        super.onPause();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.battle_layout);

        Intent intent = getIntent();

        String envID = intent.getStringExtra("ENV");
        nfcAdapter = NfcAdapter.getDefaultAdapter(this);
        if(nfcAdapter != null && nfcAdapter.isEnabled()){
            //Toast.nameText(this, "Ready to Play", Toast.LENGTH_LONG).show();
        }
        else{
            //Toast.nameText(this, "Not Ready to Play", Toast.LENGTH_LONG).show();
            finish();
        }

        //When we implement the deck
        //Game game = new Game(getCard(hero), getCard(mon));

        setupActorPositions(intent);

        heroAttr = new TextView[]{
                findViewById(R.id.heroName),
                findViewById(R.id.heroHealth),
                findViewById(R.id.heroAttack),
                findViewById(R.id.heroDefense),

        };
        monAttr = new TextView[]{
                findViewById(R.id.monName),
                findViewById(R.id.monHealth),
                findViewById(R.id.monAttack),
                findViewById(R.id.monDefense)
        };
        //Tie heroes and monsters to their visual counterparts
        heroAttr[0].setText(hero.getName());
        heroAttr[1].setText(Integer.toString(hero.getHealth()));
        heroAttr[2].setText(Integer.toString(hero.getAttack()));
        heroAttr[3].setText(Integer.toString(hero.getDefense()));
        heroAttr[3].setText(Integer.toString(hero.getDefense()));

        monAttr[0].setText(mon.getName());
        monAttr[1].setText(Integer.toString(mon.getHealth()));
        monAttr[2].setText(Integer.toString(mon.getAttack()));
        monAttr[3].setText(Integer.toString(mon.getDefense()));





        //Determine first
        if(rand.nextBoolean()) current = hero;
        else {
            current = mon;
        }
        //Display who goes first
        currentActor = findViewById(R.id.currentTurn);
        currentActor.setText(current.getName());
        setupButtons();
        if(current.equals(mon))
            monTurn();
        currentActor.setText(current.getId());

 /*
      //      Set images only works for hero as of now
        ImageView monImage = findViewById(R.id.monImage);
        ImageView heroImage = findViewById(R.id.heroImage);
// set hero image
        if(hero.getId().equals("HERO0001"))
            heroImage.setImageResource(R.drawable.hero0001);
        else if(hero.getId().equals("HERO0002"))
            heroImage.setImageResource(R.drawable.hero0002);
        else if(hero.getId().equals("HERO0003"))
            heroImage.setImageResource(R.drawable.hero0003);
        else if(hero.getId().equals("HERO0004"))
            heroImage.setImageResource(R.drawable.hero0004);
//set monster image
        if(mon.getId().equals("MONS0001") && monImage != null)
            monImage.setImageResource(R.drawable.mons0001);
        else if(mon.getId().equals("MONS0002") && monImage != null)
            monImage.setImageResource(R.drawable.mons0002);
        else if(mon.getId().equals("MONS0003") && monImage != null)
            monImage.setImageResource(R.drawable.mons0003);*/

        //DO TURNS
//Take user input (SUPER WIP)
        //if(false)Decklist.selectCard(0);
        //NFC CARD PICK HERE

//            Log.v("I am a", actor.getType());

        //proc timer here

        if(mon.getHealth() <= 0)  {
            System.out.println("You Won");
        }
        else if(hero.getHealth() <= 0)  {
            System.out.println("You Lost");
        }
    }

    private void monTurn() {
        //Do a monster's turn
        if(!skip) {
            Log.v("MonOut", "My Turn!");
            int temp = rand.nextInt(4);
            if (temp <= 1) {
                hero.setHealth(hero.getHealth() - ((mon.getAttack() < hero.getDefense()) ? 0 : mon.getAttack() - hero.getDefense()));
                heroAttr[1].setText(Integer.toString(hero.getHealth()));
                //                    System.out.println( mon.getName() + " attacks " + hero.getName() + "!");
                Log.v("MonOut", mon.getName() + " attacks " + hero.getName() + "!");
            } else if (temp == 3) {
                //manipulate defense for the next turn
                //                    System.out.println( mon.getName() + " defends themselves!");
                Log.v("MonOut", mon.getName() + " defends themselves!");
            } else if (temp == 4) {
                mon.setHealth(mon.getHealth() + 1);
                //                    System.out.println( mon.getName() + " is healing!");
                Log.v("MonOut", mon.getName() + " is healing!");
            } else {
                //                    System.out.println( mon.getName() + " falters!");
                Log.v("MonOut", mon.getName() + " falters!" + Integer.toString(mon.getHealth()));
            }
        }
        current = hero;
        currentActor.setText(hero.getName());

        for(Map.Entry<String, Integer> effect : hero.timers.entrySet()){
            //proc effects here
//            if(usedCards.size() < 41 && !usedCards.contains(currentCard)){
                //Silver Bullets
                if(effect.getKey() == "DECK0001" && effect.getValue() == 3){
                    Log.v("HeroOut", "Our hero loads SILVER BULLETS");
                    hero.setAttack(hero.getAttack()*2);
                    heroAttr[2].setText(Integer.toString(hero.getAttack()));
                } else if(effect.getKey() == "DECK0001" && effect.getValue() == 0) {
                    //get original stats from the deck
                    Log.v("HeroOut", "Out of SILVER BULLETS");
                    hero.setAttack(hero.getCard(hero.getId()).getAttack());
                    heroAttr[2].setText(Integer.toString(hero.getAttack()));
                    effect.setValue(-10);
                    usedCards.add((deckCards) currentCard);
                }
                //Tactical Roll
                if(effect.getKey() == "DECK0002" && effect.getValue() >= 2){
                    Log.v("HeroOut", "Our hero goes for a TACTICAL ROLL");
                    if(rand.nextInt(100) <= 25){
                        Log.v("HeroOut", "Our hero successfully dives clear");
                        hero.setDefense(Integer.MAX_VALUE);
                        heroAttr[3].setText(Integer.toString(hero.getDefense()));
                    }else{
                        Log.v("HeroOut", "A valiant effort put to waste!");
                    }
                } else if(effect.getKey() == "DECK0002" && effect.getValue() == 0) {
                    Log.v("HeroOut", "Our enemy is compensating for our dodges!");
                    hero.setDefense(hero.getCard(hero.getId()).getDefense());
                    heroAttr[3].setText(Integer.toString(hero.getDefense()));
                    effect.setValue(-10);
                    usedCards.add((deckCards) currentCard);
                }
                //All Tied Up
                if(effect.getKey() == "DECK0003" && effect.getValue() >= 2){
                    Log.v("HeroOut", "Our hero throw a bola, and our enemy is ALL TIED UP");
                    skip = true;
                } else if(effect.getKey() == "DECK0003" && effect.getValue() == 0) {
                    Log.v("HeroOut", "Our enemy is free of their restraints");
                    skip = false;
                    effect.setValue(-10);
                    usedCards.add((deckCards) currentCard);
                }
            /*}else if(usedCards.contains(currentCard)){
                Log.v("HeroOut", "The enemy has adapted to that ability!");
            }else{
                Log.v("HeroOut", "Our hero has run out of cards!");
            }*/
        }
        current.procTimer();

    }


    private void setupButtons() {
        exitButton = findViewById(R.id.exitBattle);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent();
                main.setClass(getApplicationContext(), MainActivity.class);
                startActivity(main);
            }
        });
        attack = findViewById(R.id.attack);
        attack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current.getType().equals("HERO")) {
                    mon.setHealth(
                            mon.getHealth() - ((hero.getAttack() < mon.getDefense()) ? 0 : hero.getAttack() - mon.getDefense())
                    );
                    monAttr[1].setText(String.valueOf(mon.getHealth()));
                    current = mon;
                    currentActor.setText(current.getName());
                    Log.v("HeroOut!", "Our hero attacked!");
                    monTurn();
                }

            }
          });
        cardVis = findViewById(R.id.cardVis);
        cardVis.addTextChangedListener(new TextWatcher() {
            boolean reuse = false;
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if(currentCard != null) {
                    Log.v("Super before change", currentCard.getName());
                    if (lastCard != null && currentCard.getId().equals(lastCard.getId())) {
                        Toast.makeText(getApplicationContext(), "This power needs time!", Toast.LENGTH_SHORT).show();
                        Log.v("Before change", "This power needs time!");
                        reuse = true;
                    }
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(!reuse && currentCard != null){
                    switch (currentCard.getId()){
                        case "DECK0001":
                            hero.timers.put("DECK0001", 3);
                            break;
                        case "DECK0002":
                            hero.timers.put("DECK0002", 2);
                            break;
                        case "DECK0003":
                            hero.timers.put("DECK0003", 2);
                            break;
                        case "DECK0004":

                            break;
                        case "DECK0005":

                            break;
                    }
                    lastCard = currentCard;
                    current = mon;
                    currentActor.setText(current.getName());
                    reuse = false;
                    monTurn();
                }
            }
        });
    }
    private void setupActorPositions(Intent intent) {
        heroStr = intent.getStringExtra("HERO");
        monStr = intent.getStringExtra("MONS");
        //Determine characters
        hero = new heroCards(heroStr);
        mon = new monsterCards(monStr);
    }
}
