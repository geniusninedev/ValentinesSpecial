package com.geniusnine.android.valentinesspecial.ChocolateDay;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.geniusnine.android.valentinesspecial.R;

public class ChocolateStatusDisplay extends AppCompatActivity {
    ViewPager viewPager;
    PagerAdapter adapter;
    String[] brainpuz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolate_poems_display);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        brainpuz = new String[]{  " All you need is love. But a little chocolate now and then doesn't hurt." +
                "    Happy Chocolate Day!n" ,

                " Let's face it, a nice creamy chocolate cake does a lot for a lot of people; it does for me." +
                " Happy Chocolate Day!" ,

                " There is nothing better than a friend, unless it is a friend with chocolate." +
                " Happy Chocolate Day!",

                " Look, there's no metaphysics on earth like chocolates." +
                " Happy Chocolate Day!",

                " If there's no chocolate in Heaven, I'm not going." +
                " Happy Chocolate Day!" ,

                " The greatest tragedies were written by the Greeks and Shakespeare neither knew chocolate." +
                " Happy Chocolate Day!" ,

                " Will looked horrified. What kind of monster could possibly hate chocolate?" +
                " Happy Chocolate Day!",

                " Happiness. Simple as a glass of chocolate or tortuous as the heart. Bitter. Sweet. Alive." +
                " Happy Chocolate Day!" ,

                " Chocolate says 'I'm sorry' so much better than words." +
                " Happy Chocolate Day!" ,

                " Your hand and your mouth agreed many years ago that, as far as chocolate is concerned," +
                " there is no need to involve your brain." +
                " Happy Chocolate Day!" ,

                " Anything is good if it's made of chocolate." +
                " Happy Chocolate Day!" ,

                " What you see before you, my friend, is the result of a lifetime of chocolate." +
                " Happy Chocolate Day!",

                " Always serve too much hot fudge sauce on hot fudge sundaes. It makes people overjoyed, and" +
                " puts them in your debt." +
                " Happy Chocolate Day!" ,

                " Chemically speaking, chocolate really is the world's perfect food." +
                " Happy Chocolate Day!" ,

                "  Coffee and chocolate—the inventor of mocha should be sainted."+
                "  Happy Chocolate Day!" ,

                "  I was like a chocolate in a box, looking well behaved and perfect in place, all the while" +
                "  harboring a secret center." +
                "  Happy Chocolate Day!" ,

                "  May your life be filled, as mine has been, with love and laughter; and remember, when" +
                "  things are rough all you need is Chocolate." +
                "  Happy Chocolate Day!" ,

                "  It was like having a box of chocolates shut in the bedroom drawer. Until the box was empty" +
                "  it occupied the mind too much." +
                "  Happy Chocolate Day!" ,

                " Chocolate symbolizes, as does no other food, luxury, comfort, sensuality, gratification," +
                " and love." +
                " Happy Chocolate Day!" ,

                " It was an indulgence, learning last words. Other people had chocolate; I had dying" +
                " declarations." +
                " Happy Chocolate Day!" ,


                " Chocolate is like my best friend and the most intense pleasure at the same time, perhaps" +
                " not the most intense, but the most regular and reliable one."+
                " Happy Chocolate Day!" ,

                " I'm pretty sure that eating chocolate keeps wrinkles away because I have never seen a 10" +
                " year old with a Hershey bar and crows feet."+
                " Happy Chocolate Day!" ,

                " The Duchess set about studying Annette and shortly found her adversary's tragic flaw." +
                " Chocolate."+
                " Happy Chocolate Day!" ,

                " When we don't have the words chocolate can speak volumes." +
                " Happy Chocolate Day!" ,

                " Remember the days when you let your child have some chocolate if he finished his cereal?" +
                " Now, chocolate is one of the cereals." +
                " Happy Chocolate Day!" ,


                "  Everyone needs fudge, Hildy. It's how God helps us cope." +
                "  Happy Chocolate Day!" ,

                "  If Warren Buffet made chocolate, I’ll bet it’d be really rich. And corrupt." +
                "  Happy Chocolate Day!" ,

                "  Chocolate is a perfect food, as wholesome as it is delicious, a beneficent restorer of" +
                "  exhausted power it is the best friend of those engaged in literary pursuits." +
                "  Happy Chocolate Day!" ,

                " You are trying to lure us into revealing information you're not entitled to? With chocolate" +
                " and wine? Are you amateurs?" +
                " Happy Chocolate Day!" ,

                " A little chocolate a day keeps the doctor at bay." +
                " Happy Chocolate Day!"
        };
// Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(ChocolateStatusDisplay.this,brainpuz);
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


