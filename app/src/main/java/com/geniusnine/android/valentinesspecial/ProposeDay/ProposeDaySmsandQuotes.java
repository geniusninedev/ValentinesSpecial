package com.geniusnine.android.valentinesspecial.ProposeDay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.geniusnine.android.valentinesspecial.R;

/**
 * Created by Supriya on 08-02-2017.
 */

public class ProposeDaySmsandQuotes extends AppCompatActivity {

    ListView listView;
TextView textViewRose;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propose_day_status);


        listView=(ListView)findViewById(R.id.listViewRoseDay);
        textViewRose=(TextView)findViewById(R.id.textViewRose);
        String[] values = new String[] {


                "In this whole world U R just somebody, & for anyone U R the whole world….  That stupid someone is me.??? I love you sO somebody… Happy Propose Day 2017 this somebody\n",

                        "Guarantee me that we are good companions. I am the moon; you are my light. I am a cloud; you are the Barish. I am track; you are the train. On the off chance that I am dampness, you are the Baadal. I am Normal, and you are the Pagal. Happy Propose Day 201\n" ,

                        "No ballads no extravagant words I simply need the world to realise that I  LOVE YOU my Princess with my entire being. Happy Propose Day 2017\n" ,

                        "I have a heart and that is true, but now it has gone from me to you, so care for it just like I do, because I have no heart and you have two. Happy Propose Day 2017\n" ,

                        "I Always Lose Control When  You By My Side, U Have Become  The Light Of My Life. I Always  Enjoy The Time I Spend With  You, I Think I’m Falling In Love  With You.\n" ,

                        "The say that Love is something that is all inclusive and is an inclination that is not bound by spatial limits, be it dialect or topography. Happy Propose Day 2017!\n" ,

                        "The First Time I Saw You, I Noticed My Heart Beat Faster & The Situation Is Same For Now Maybe I’m In Love With You Happy Propose Day 2017\n" ,

                        "I still remember the moment.. when for the first time our eyes met..and I felt butterflies in my stomach…since then my heart longs…to be with you always. Be Mine Forever\n" ,

                        "U are unique U are caring, and U are the Best.And I am d luckiest to have U in my life! Happy Propose Day 2017 my sweetheart…!\n" ,

                        "Word Have Not Enough Strength To Express My Love Towards You. My Eyes Are Enough To Express It! Happy Propose Day 2017 Dear!\n" ,

                        "My Eyes Are Eager To See You, My Ears Are Eager To Listen to You, My Lips Are Eager To Kiss You, and My Dreams In Night Are Eager To Welcome You Happy Propose Day 2017\n" ,

                        "Love comes again and again for those who know what life is love comes only once for those who know what Love Is. Happy Rose Day 2017\n" ,

                        "All I wanted was someone to care four me, All I wanted was someone who’d b there 4for me, All I ever wanted was someone who’d b true, All I ever wanted was someone like U… Happy Propose Day 2017\n" ,

                        "The sweetest way to propose, Excuse me, do you have a band-aid, because I scraped my knee when I fell in love with you Will you be mine… Happy Propose Day 2017!!\n" ,

                        "Happy Propose Day!. I Think About You All The Time.. Will You Be Forever Mine? I Must Say I Adore You. I Can Not Live My Life Without You. It Would Be Long And Dreary Happy Propose Day 2017.",

                "If Roses were Black and violets were brown, my love for you would never be found but roses r red, and violets are blue all I want to say is I LOVE YOU\n" ,

                        "If at any time life is like a candle in the wind, then I’ll put my hands around you so that, all burns are mine and all light is yours. It’s a promise, my dear. Happy Propose Day 2017\n" ,

                        "The Minute I Heard My First Love Story, I Started Looking For  You, Not Knowing How Blind That Was. Mates Don’t Finally Meet Some place. They’re In Each Other From the beginning. Cheerful Propose Day 2017\n" ,

                        "Love is to express and not to impress people. When love is expressed truly people will be impressed\n" ,

                        "Everyone can say I Love You, But not everyone means it, So believe it when you feel it, not when you hear it, !!!Happy Propose Day 2017!!!!\n" ,

                        "With this ring, I give you my heart, I promise from this day forward, you should not walk alone, may my heart be your shelter, and my arms are your home.\n" ,

                        "Love is heat. You are sweet. When two Lips are meet each other. Then Love is complete… Happy Propose Day 2017…!!\n" ,

                        "I’m opening an emotional bank account, For you sweetheart, So deposit your love in it, And you will get the interest. Be my valentine! Happy Propose Day 2017!\n" ,

                        "You Are Like The Sunshine So Warm, You Are Like Sugar, So Sweet You Are Like You And That’s The Reason Why I Love You.\n" ,

                        "I love you for not what you are but what I become when I am there with you. So be with me forever… Happy Propose Day 2017!\n" ,

                        "Happy Propose Day 2017 my love.’have one problem, Can you tell me the solution?I am not getting proper way to.. Propose You. I am not kidding. I am serious.\n" ,

                        "On this very auspicious day, I give to you all my trust wishes and promise that I will remain forever true, everything we do throughout our lives will be an everlasting testament to our devotion to each other. Happy Propose Day 2017 to My Love.\n" ,

                        "There will never be someone or something that can make me feel the way that you do, nothing and no one will ever make me love as much as I love you.\n" ,

                        "If Roses were Black and violets were brown, my love for you would never be found but roses r red and violets are blue all I want to say is I LOVE YOU! Happy Propose Day 2017."
        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        R.layout.activity_rose_day_shayari,R.id.textViewRose, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
@Override
public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i = new Intent(ProposeDaySmsandQuotes.this,ProposeDaySmsQuotos.class);
        i.putExtra("key", position);
        startActivity(i);


        }
        });

        }





@Override
public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
        }

@Override
public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        switch (item.getItemId()) {
        case android.R.id.home:

        // app icon in action bar clicked; goto parent activity.
        this.finish();
        return true;
default:
        if (id == R.id.action_send) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_TEXT, "message to share");
        startActivity(Intent.createChooser(i, "Share via"));
        return true;
        }
        return super.onOptionsItemSelected(item);

        }
        }
        }

