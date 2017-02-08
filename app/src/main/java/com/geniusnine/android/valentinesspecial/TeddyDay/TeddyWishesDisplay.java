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

public class TeddyWishesDisplay extends AppCompatActivity {


    ViewPager viewPager;
    PagerAdapter adapter;
    String[] brainpuz;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teddy_poems_display);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        brainpuz = new String[]{

                "On teddy bear day, we think of people who have cheered and encouraged us, who go out of their way to be kind and caring, who have enriched our lives just by being themselves. You are such a person. I’m so happy you’re my love. Happy Teddy Bear Day!",

                " You are my teddy bear I love to be your teddy bear I love to hug you. Happy Teddy Bear Day!",

                " By gifting you this teddy, I want to show you that I am ready to make you mine, and fill my life with sunshine! Happy Teddy Bear Day!",

                " A bedroom without a teddy is like a face without a smile.",

                " You are the twinkle of my eyes; the smile on my lips; the joy of my face; without you I am incomplete. Happy Teddy Bear Day!",



                " Every day is a teddy day, when I am with you, but yet its worthy to celebrate, and the reason is you!",

                " Love can’t be described, It’s meant to be felt through the way we care, Wish you a happy teddy day, Hope there are more such days that we share!",

                " On teddy bear day we think of those who make our lives worthwhile, those gracious, friendly people who we think of with a smile. I am fortunate to know you, that's why I want to say, to a rare and special person: Happy Teddy Bear Day!",

                " I wish I were a cell in your blood, so I would be sure I was somewhere in your heart. Happy Teddy Bear Day!",

                " Are you missing me? Are you feeling lonely and gloomy? I have something for you, I just sent you a nice teddy, Happy Teddy Day!",

                " It’s Teddy Bear Day, and I’m thinking of someone cute and huggable who is you. Happy Teddy Bear Day!",

                " Love me love my teddy bear, kiss me kiss me my teddy bear, hug me hug me my teddy bear. Happy Teddy Bear Day!",

                " You are smile of my lips twinkle of my eyes and joy of my face without you I am nothing. Happy Teddy Bear Day 2017!",

                " Teddy bear day is a day of love, It's a day when you find your true love. A day of hearts and Yummy Candies. A day when cupid hits you with a love arrow. A day when you find your teddy bear, will you be mine?",

                " This is what I want to do, as my love is my virtue, you are special on every single day, wish you a happy teddy day!",



                " On teddy bear day, we think of people who have cheered and encouraged us, who go out of their way to be kind and caring, who have enriched our lives just by being themselves. You are such a person. I’m so happy you’re my love. Happy Teddy Bear Day...",

                " You are in my heart and mind wherever I go, on teddy bear day I would like to say, I care more than you know. Happy Teddy Bear Day!",

                " I wish I were a cell in your blood, so I would be sure I was somewhere in your heart. Happy Teddy Bear Day!",

                " Love knows no reason, love knows no lies. Love defies all reasons, love has no eyes. But love is not blind, love sees but doesn't mind. Happy Teddy Day To All!",

                " Wake in the deepest dark of night and hear the driving rain. Reach out a hand and take a paw and go to sleep again.",

                " To be always with you a life with you, I hope, I dream; to be always with you, how wonderful, it does seem. Happy Teddy Day!",

                " Don’t miss to see my gift, open it with the love and bond we share, you will like this small teddy, that reflects my passion and care!",

                " You are always my darling, you will be my date now and ever, this teddy is just for you, to express my love forever! Happy Teddy Day!",

                " I wish I was a teddy bear, that lay upon your bed. So every time you cuddled it, you cuddled me instead. Happy Teddy Bear Day!",

                " Love doesn’t know the rules, love just knows how to shine, happy teddy day sweetheart, I am yours and you are mine!",



                " Sitting on the beach a cottage small near a beautiful sea side sitting on the beach we will watch the coming tide. Each moment with you, as long as I am living; a life with you, is the only thing, I am dreaming. Happy Teddy Bear Day!"

        };
// Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pagerTeddy);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(TeddyWishesDisplay.this,brainpuz);
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
