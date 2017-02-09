package com.geniusnine.android.valentinesspecial.ValentineSpecial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.geniusnine.android.valentinesspecial.ChocolateDay.ViewPagerAdapter;
import com.geniusnine.android.valentinesspecial.R;

/**
 * Created by Supriya on 08-02-2017.
 */

public class RoseSmsQuotosDisplay extends AppCompatActivity {

    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rose_day_shayari_quotos);


        List = new String[] { "Do you think that revolutions are made with rose water?" +
                "Happy Rose Day!",

                "All June I bound the rose in sheaves, Now, rose by rose, I strip the leaves." +
                        "Happy Rose Day!",

                "My rose is red,Your eyes are blue,You love me,And I love u.Happy valentine’s day in advance." +
                        "Happy Rose Day!",

                "When I First Felt Love For You,I Knew It Would Be Special And Forever.This Rose Day I Wish To Honour YouWith My Love As I Always DoBecause You Are Mine." +
                        "Happy Rose Day!",

                "Believe me, you are the one, Whom my heart finds, Whom my mind reminds me of, Whom my destiny wants, Whom i love the most." +
                        "Happy Rose Day.!",

                "Bunch of rose I am sending youYellow to show our happinessWhite to show our purityBlack to show our darkest secretsAnd red to show our love." +
                        "Happy Rose Day.!",

                "Everything About You Is Interesting,Your Smile, Your Laughter, Your Beauty,Your Scent And Your Company.I Always Think Of You With A Smile On My Face.I Love You My Precious Rose." +
                        "Happy Rose Day.!",

                "Sweeter than the candieslovelier than the red rosesmore hug-gable than soft toysthat’s what you’re here’s wishing you a Rose Day that’s as special as you’re." +
                        "Happy Rose Day.!",

                "Whenever the occasion a rose, he rose to the occasion." +
                        "Happy Rose Day.!",

                "One rose says more than the dozen." +
                        "Happy Rose Day.!",

                "Love and a red rose can’t be hid." +
                        "Happy Rose Day.!",

                "The Rose is without an explanation; She blooms, because She blooms." +
                        "Happy Rose Day.!",

                "We have chased away the clouds, the sky is all rose." +
                        "Happy Rose Day.!",

                "The fragrance always stays in the hand that gives the rose." +
                        "Happy Rose Day.!",

                "If you enjoy the fragrance of a rose, you must accept the thorns which it bears." +
                        "Happy Rose Day.!",

                "Can anyone remember love? It’s like trying to summon up the smell of roses in a cellar. You might see a rose, but never the perfume." +
                        "Happy Rose Day.!",

                "Publishing a volume of verse is like dropping a rose petal down the Grand Canyon and waiting for the echo." +
                        "Happy Rose Day.!",

                "Love thou the rose, yet leave it on its stem." +
                        "Happy Rose Day.!",

                "A rose must remain with the sun and the rain or its lovely promise won’t come true." +
                        "Happy Rose Day.!",

                "Not every bird can dance but peacock do it, Not every friend can patch my heart but you do it, Not every flower can express love but Roses do it." +
                        "Happy Rose Day!",


                "Actual meaning of giving rose to someone:- R= Rare O=One S=Supporting E=Entire Life." +
                        "Happy Rose Day!",

                "Morning is Lucky, because Sun is the, Sky is Lucky, because it has Star, Rose is Lucky, because she is Beautiful, I am Lucky, because you are my Friend." +
                        "Happy Rose Day!",

                "When i ask God for a rose, & he gave me flowers. I ask God for an angel, & he gave me the best love ever!" +
                        "Happy Rose Day!",

                "I looked at a sweet, beautiful rose, and then I looked at you" +
                        "and I kept looking at you, for the rose isn't as beautiful as you." +
                        "Happy Rose Day!",

                "Hope you found this a special rose! with love and care for the one you chose." +
                        "Happy Rose day!",

                "The Rose Speaks of Love Silently, in a language known only to the Heart." +
                        "Happy Rose Day!",

                "Be soft as flower Be strong as rock Be nice as me I know its difficult But just keep trying Be fresh as Rose." +
                        "Happy Rose Day!",

                "The Rose Speaks of Love Silently,in a language known only to the Heart." +
                        "Happy Rose Day Sweetheart!",

                "A Single Rose for u for being in my life,Thank you so much to complete my Life.Happy Rose Day." +
                        "Happy Rose Day!",

                "R is for Red, Red is for Blood, Blood is for Heart, Heart is for Love, Love is for You, You’re for Me Forever." +
                        "Happy Rose Day Dear!"


        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.Pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(RoseSmsQuotosDisplay.this,List);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

        int pos = getIntent().getIntExtra("key", 0);
        viewPager.setCurrentItem(pos);



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
