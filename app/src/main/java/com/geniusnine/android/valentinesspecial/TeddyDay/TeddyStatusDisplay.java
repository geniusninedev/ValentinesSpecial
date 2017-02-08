package com.geniusnine.android.valentinesspecial.TeddyDay;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.geniusnine.android.valentinesspecial.ChocolateDay.ViewPagerAdapter;
import com.geniusnine.android.valentinesspecial.R;

/**
 * Created by Supriya on 07-02-2017.
 */

public class TeddyStatusDisplay extends AppCompatActivity {


    ViewPager viewPager;
    PagerAdapter adapter;
    String[] brainpuz;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teddy_poems_display);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        brainpuz = new String[]{

                "To My Cutest Friend,"+
                        "On A Cute Occasions"+
                        "Happy Teddy Bear Day!",

                "You are Smile of my Lips,"+
                        " Twinkle of my eyes,"+
                        "and joy of my face,"+
                        "Without you I am nothing,"+
                        "Happy Teddy Bear Day",

                "Boy: Do U Hug Ur Teddy Bear"+
                        " While Sleeping At Night??"+
                        " Girl: Yes!"+
                        "Boy: Can I Replace It For the Rest Of Ur Life??"+
                        "Happy Teddy Bear Day",

                "I wish I were a cell in your blood, so I would be sure I was somewhere in your heart. Happy Teddy Bear Day.",

                "I wish I were a cell in your blood,so I would be sure I was somewhere in your heart.Happy Teddy Bear Day..",

                "On This Day I Promise U.Teddy Day is Very Beautiful Day on This Day I Promise U that I Will be always With You.My every breath is For You and For!!!Ever Happy Teddy Day.",

                "Whenever u c LOVE coming, WELCOME it, open ur Arms,Embrace it & let it ENTER into U! People will ask UR U in LOVE? jst say-no,LOVE is in me! Happy Teddy Bear day.",

                "U r my Teddy Bear, I love to be your Teddy Bear, I love 2 hug you, Happy Teddy bear day.",

                "Wen a TOUCH could HEAL a wound Wen EYES’S cud SPEAK volumes Wen a SMILE can confirm I M THERE then why do v need on-words 2 say ‘I LOVE YOU.’ Happy Teddy Bear Day.",

                "When daylight turns 2 a darkened hue, D lovely stars r hinting @ u, Ur heart beats tells u something true, That someone somewhere is missing U….! Happy Teddy Bear Day.",

                "Be Mine Teddy Bear Day.I Am Sending You This Valentine Wish With Hugs And Kisses Too;Cause There,IS A Place Here In My Heart That,IS Mad For Only You!!!",

                "I miss the laughs, I used to get from you, I miss the talks we used to have & above all, I just miss YOU! Happy Teddy Bear Day.",


                "To My Cutest Wife,"+
                        "Who Is My Life,"+
                        "This Teddy Bear I A Sign,"+
                        "That You Will Be Forever Mine.."+
                        "Happy Teddy Bear Day",

                "The Soft Cuddly Teddy Is There To Show"+
                        " I Will Always Be There"+
                        " This You Should Know"+
                        " Happy Teddy Bear Day",

                "In our childhood, teddy bears are warm"+
                        " companions – good listeners, never critical,"+
                        "         always reassuring. They are bear-shaped security"+
                        " blankets, hug-gable enough to fold in"+
                        "  our arms, a perfect fit for our laps.",

                "Bears like honey that comes from bees."+
                        "           Bears like to nap under shady trees."+
                        "  Bears can be cuddly, or big and mean."+
                        "      My little Teddy Bear is the cutest I’ve seen."+
                        "  He’s at my side when I’m happy or blue,"+
                        "    Here’s to my Teddy Bear — ‘I love you!’",


                "Kuch Ehsason Ke Saye Dil Ko Chu Jate Hain,"+
                        "         Kuch Manzar Dil Mein Utar Jate Hain,"+
                        "  Bejan Gulshan Mein Bhi Phool Khil Jate Hain,"+
                        "  Jab Zindagi Mein Aap Jaise Dost Mil Jate Hain."+
                        "          Happy Teddy Day",

                "Teddy Bear ki tarah tum hamesha hanste raho"+
                        " Muskurate raho, khelte raho"+
                        "  Nachte raho or soft raho."+
                        "         Happy Teddy Day",

                "Bhej Raha hun Teddy Pyaar se,"+
                        "   Rakhna ise Tum Sambhal ke,"+
                        "           Ho mohabbat agar mujhse to bhej dena ek teddy Mujhe bhi pyaar se…"+
                        "  Happy Teddy Day",

                "I wish I were a cell in your blood,"+
                        "           so I would be sure I was"+
                        "  somewhere in your heart."+
                        "   Happy Teddy Bear Day",

                "By Gifting You This Teddy, I Want To Show Am Ready, To Make You Mine And Fill My Life With Sunshine",

                "Remember when I said Teddy can’t sleep without me? Well,truth is,I can’t sleep without Teddy.”",

                "You’re In My Thoughts And In My Heart Wherever I May Go On Teddy Bear Day I’d Like To Say I Care More Than You Know.",

                "Whenever u c LOVE coming, WELCOME it, open ur Arms,Embrace it & let it ENTER into U! People will ask UR U in LOVE? jst say-no, LOVE is in me!",



                "I Am Sending A Teddy To You."+
                        "  Love My Teddy Bear, Kiss My"+
                        " Teddy Bear, Hug My Teddy Bear,"+
                        "    Keep That Teddy Carefully"+
                        "  Because Teddy Has My Heart …"



        };
// Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pagerTeddy);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(TeddyStatusDisplay.this,brainpuz);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

        int pos = getIntent().getIntExtra("key", 0);
        viewPager.setCurrentItem(pos);




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

                return super.onOptionsItemSelected(item);

        }
    }
}
