package com.geniusnine.android.valentinesspecial.ChocolateDay;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.geniusnine.android.valentinesspecial.R;

/**
 * Created by Supriya on 07-02-2017.
 */

public class ChocolateWishesDisplay extends AppCompatActivity {
    ViewPager viewPager;
    PagerAdapter adapter;
    String[] brainpuz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolate_poems_display);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        brainpuz = new String[]{        "I like pastels and lighter shades on darker skins. I feel like it lifts everything and accentuates being chocolate.",


                "Look at bread, and see it as a Dairy Milk Cadbury's chocolate bar, and say to yourself, 'OK, you don't need that.' Bread is bad.",




                "I have one chocolate Lab named Jasmine. I also had a rat named Sky.",


                "My fans have great senses of humor and eat too much chocolate.",


                "I really love my food. My favorite thing is artichokes. I am not so much interested in desserts or chocolate, though. I also like to cook with my husband Damian.",


                "I might be able to walk away from sexy, dangerous sifters, but chocolate had me at its beck and call.",


                "Money can't buy happiness. But, it can buy a chocolate, which is pretty much the same thing.",

                "If chocolate is the answer. the question is irrelevant. unknown",


                "Nothing says I love you like the gift of a half-eaten candy bar. I ate my half two weeks before I remembered to give it to her.",




                "Also, vampires don't eat food. You never get to eat chocolate again. Ever. I'd rather die.",

                "Chocolate is a true friend, a trusted confidant, and faithful lover.",


                "Chocolate craving your lips, melts at your touch, and savors the moment.",


                "Mom always said too much chocolate is like having too much love you can't get enough-Geraldine Solon, Chocolicious",

                "A dark-chocolate truffle melts in my mouth, and I forget about everything else even the fact that I'm on a diet.",

                "Chocolate is medicinal. I just did another study that confirms it.",

                "To me, chocolate was the sole reason we on this earth.",


                "Theo nodded slowly.You love Balanchine chocolate like I love cacao.",

                "Synthetic chocolate sounds wrong.",

                "My favourite word? I think, delicious, because it sounds so delicious. You say it, and you just wanna eat a chocolate bar.",


                "I like all sorts of chocolate. Milk chocolate, dark chocolate, anything.",

                "I particularly like Hershey's chocolate - the kind which has almonds in it.",

                "I travel with chocolate - Godiva with caramel. When the craving hits, I have to have it. I share, but if I'm on my last one, I've been known to say, 'Sorry, I'm out!",


                "I never got a chocolate birthday cake; I got a carob one. And when I went to other kids' houses, I was very covetous of things like Cheez Whiz that I'd find in their refrigerators.",

                "I love nothing more than a good, rich, dark chocolate. It exhilarates. It satisfies.",


                "I love dark chocolate. I'm also a peanut butter and chocolate fanatic. That's pretty much the greatest invention of the last century.",

                "If I weren't acting, I would own my own chocolate shop in Paris. I would be a nice, overweight person that makes chocolate all day long.",

                "The older I get, the harder it is to splurge without consequences. I love food. Chocolate and cheese and anything that's bad for me. I'll be really good when I'm at home so I can eat what I want to when I'm out with friends.",

                "My weakness is chocolate - especially butterscotch and nut varieties.",

                "I need God’s grace and something baked with peanut butter and chocolate."
        };
// Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(ChocolateWishesDisplay.this,brainpuz);
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
