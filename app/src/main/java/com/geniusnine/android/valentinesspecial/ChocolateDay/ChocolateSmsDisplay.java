package com.geniusnine.android.valentinesspecial.ChocolateDay;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.geniusnine.android.valentinesspecial.R;

/**
 * Created by Supriya on 08-02-2017.
 */

public class ChocolateSmsDisplay extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter adapter;
    String[] brainpuz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolate_poems_display);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        brainpuz = new String[]{

                "Whenever I have even a spare second, I'm in the kitchen whipping up a batch of cookies. I make a mean batch of chocolate chippers."+
                        "Happy Chocolate Day!",

                "War is a bazaar where lives are traded like any other commodity: chocolate or bullets or parachute silk."+
                        "Happy Chocolate Day!",

                "War is a bazaar where lives are traded like any other commodity: chocolate or bullets or parachute silk."+
                        "Happy Chocolate Day!",

                "Sometime all you need is love. Oh wait! And ice cream, and chocolate to go along with it as nowadays love is anything but sweet."+
                        "Happy Chocolate Day!",

                "Some people smoked crack in alleyways. Franny ate chocolate. On the scale of things, it seemed entirely reasonable."+
                        " Happy Chocolate Day!",

                "When I was a child, I used to eat sugar Frosted Flakes with chocolate milk, but I digest, I mean digress."+
                        "Happy Chocolate Day!",

                "I'm all over the place with muffins. Carrots are great. Banana, chocolate chip, they rock, too."+
                        " Happy Chocolate Day!",

                "I just love to bake chocolate cakes and anything unhealthy. It makes me very popular."+
                        "Happy Chocolate Day!",

                "If kept dry, a chocolate with a high cacao content, I've discovered, rarely spoils."+
                        "Happy Chocolate Day!",

                "I love dark chocolate, but I will have a piece just occasionally."+
                        "Happy Chocolate Day!",



                "I'm always, all the time, eating chocolate. I eat pretty healthy, but then I go all out when it has to do with chocolate."+
                        "Happy Chocolate Day!",

                "I particularly like Hershey's chocolate, the kind which has almonds in it."+
                        "Happy Chocolate Day!",

                "I'm not into fad diets; I'm not into depriving. I like fast food, and I like chocolate."+
                        "Happy Chocolate Day!",

                "I love chocolate. Black chocolate with marshmallow inside, caramel inside. If I could only have two foods, I'd take some fantastic chocolate. And some terrible chocolate. I love the Clark Bar."+
                        "Happy Chocolate Day!",

                "Cocoa boosts brain serotonin. Almost every single antidepressant aims at either enhancing serotonin or keeping it in the brain longer. Chocolate or cocoa does that very well."+
                        "Happy Chocolate Day!",

                "If it's not chocolate, it's not breakfast."+
                        "Happy Chocolate Day!",

                "I'm passionate about anything I align myself with. You want to talk about chocolate chip cookies? I'm not going to open a chocolate chip cookie store, but I will talk your ear off about it."+
                        "Happy Chocolate Day!",

                "I'm a woman who wants her chocolate."+
                        "Happy Chocolate Day!",

                "It's not a struggle to be on a diet. You feel lighter, and your spirit is lighter, too. But I love chocolate, and I allow myself to have chocolate. That doesn't go against a diet for me."+
                        "Happy Chocolate Day!",

                "It's not exactly under the radar, but when I'm in London, I love to visit Liberty. It's my favorite department store, and they have a room entirely dedicated to chocolate and truffles."+
                        " Happy Chocolate Day!",



                "I like pastels and lighter shades on darker skins. I feel like it lifts everything and accentuates being chocolate."+
                        "Happy Chocolate Day!",

                "Look at bread, and see it as a Dairy Milk Cadbury's chocolate bar, and say to yourself, 'OK, you don't need that.' Bread is bad."+
                        " Happy Chocolate Day!",

                "I eat a lot of chocolate."+
                        "Happy Chocolate Day!",

                "I have one chocolate Lab named Jasmine. I also had a rat named Sky."+
                        " Happy Chocolate Day!",

                "My fans have great senses of humor and eat too much chocolate."+
                        "Happy Chocolate Day!"
        };
// Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(ChocolateSmsDisplay.this,brainpuz);
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


