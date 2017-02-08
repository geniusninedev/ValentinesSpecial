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

public class TeddySmsDisplay extends AppCompatActivity {


    ViewPager viewPager;
    PagerAdapter adapter;
    String[] brainpuz;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teddy_poems_display);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        brainpuz = new String[]{

                " I am sorry I am away, I am sorry on this special day, I just sent a special teddy, To wish you Happy Teddy Bear Day! ",

                " Teddies are just another reason, Just another way to say I care, I will be there forever, No matter the good and bad times we share! Happy Teddy Bear Day! ",

                " Hug a bear day is not how long you've been together; not how much you've given or receive; not how many times you've helped each other. Happy Teddy Bear Day! ",

                " Life is a journey, and love is what makes that journey worthwhile. Happy Teddy Bear Day! ",

                " By gifting you this teddy I want to show am ready to make you mine and fill my life with sunshine... ",

                " A cute teddy bear, to my cute friend, on a cute occasions, just to say. Happy Teddy Bear Day! ",

                " Love can’t be described, It’s meant to be felt through the way we care, Wish you a happy teddy day, Hope there are more such days that we share. ",

                " Never could tell you my love, never could I share the things of my heart, but on this special teddy day, will you be mine on this valentine ’s day? ",

                " A cute teddy bear, to my cute friend, on a cute occasions, just to say. Happy Teddy Bear Day! ",

                " By gifting you this teddy, I want to show you that I'm ready to make you mine, and fill my life with sunshine! " +
                        "Happy Teddy Bear Day!",

                " What I need to live has been given to me. By the earth why I need to live has been given to me. Happy Teddy Bear Day! ",

                " In this special valentine week, On this special teddy day, I want to confess my love for you, There never was, there never will be another you! ",

                " Teddy bear day. I love my teddy. Happy teddy bear day You are my sweetest teddy bear. Happy Teddy Bear Day My Dear... ",

                " You are eternal like love, You are cute as the stuffed toy, Take this teddy as my heart, It’s filled with my love and my joy! ",

                " To my cutest cuddly love, who is certainly my life, this teddy bear is a sign, that you will be forever mine. Happy Teddy Bear Day! ",

                " A teddy bear is a faithful friend you can pick him up at either end, his fur is the colour of breakfast toast, and he's always there when you need him most. Happy Teddy Bear Day! ",

                " The Teddy Bear is the last toy that we part with. He is all that is left of that lost world where solutions seemed possible and a friend who saw no fault and made no reproach, waited forever in the old armchair. ",

                " The teddy bear is the last toy that we part with. He is all that is left of that lost world where solutions seemed possible and a friend who saw no fault and made no reproach, waited forever in the old armchair. ",

                " To be always with you a life with you, I hope, I dream; to be always with you, how wonderful, it does seem Happy Teddy Bear Day! ",

                " Boy: I am sure you love to cuddle, your teddy at night. "+
                        " Girl: Yeah, he is surely my cutey pie. "+
                        "Boy: How about this big teddy (me) replacing him for the rest of your life? ",

                " Teddy bears don't need hearts as they are already stuffed with love.I m ur Teddy with a big heart. Happy Teddy Day... ",

                " Teddy bear day is a day of love,  it's a day when you find your true love. A day of hearts and yummy candies. A day when cupid hits you with a love arrow. A day when you find your teddy bear, will you be mine? ",

                " A teddy bear is like a friend you hug it, and cry to it when you are sad you talk to it when you feel alone! it doesnt matter what color, size or condition its in, its there for you no matter what. Happy Teddy Bear Day! ",

                " Tell me I am good, tell me I love you more, tell me you got my gift, just see the teddy at your door! Happy Teddy Bear Day! "
        };
// Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pagerTeddy);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(TeddySmsDisplay.this,brainpuz);
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

