package com.geniusnine.android.valentinesspecial.ValentineSpecial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.geniusnine.android.valentinesspecial.R;

/**
 * Created by Dev on 07-02-2017.
 */
public class RoseStatusQuotos extends AppCompatActivity {

    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rose_day_shayari_quotos);


        List = new String[] {

                "“A single rose can be my garden… a single friend, my world.” Happy Rose Day!",
                "“Rose spreads its fragrance His fragrance is his message.” Happy Rose Day!",
                "“The most magical moments are those when you forget yourself in the joy of someone’s presence.” Happy Rose Day!",
                "“She did not need anyone else’s love when she had roses.” Happy Rose Day!",
                "“Rose, oh pure contradiction, joy of being No-one’s sleep under so many lids.” Happy Rose Day!",
                "“When I miss you I re-read our old conversations and smile like an idiot.” Happy Rose Day!",
                "“The point is to turn your grief into love. The roses are helping you find grace.” Happy Rose Day!",
                "“Women show men beauty in things beyond their ambitions. Women tell men to stop and smell the roses.” Happy Rose Day!",
                "“There were crimson roses on the bench; they looked like splashes of blood.” Happy Rose Day!",
                "“Every summer, like the roses, childhood returns.” Happy Rose Day!",
                "“Real life isn’t purely filled with roses and rainbows.” Happy Rose Day!",
                "“If you can love all who’ve betrayed you, you can taste sweetness in everything.” Happy Rose Day!",
                "“During the day I keep myself busy and sometimes time passes. But at night, I really miss you.” Happy Rose Day!",
                "“The Rose Speaks of Love Silently, in a language known only to the Heart.” Happy Rose Day!",
                "“Send a red rose which defines our beautiful relation.” Happy Rose Day!",
                "“Every love story is beautiful, but ours is my favorite.” Happy Rose Day!",
                "“Yes, I’m selfish because I will never share you with anyone else.” Happy Rose Day!",
                "“When I first saw you, I fell in love with you and you smiled because you knew.” Happy Rose Day!",
                "“You have no idea how fast my heart beats when I see you.” Happy Rose Day!",
                "“Every morning would be perfect if I woke up next to you.” Happy Rose Day!",
                "“Love planted a rose, and the world turned sweet.” Happy Rose Day!",
                "“The rose and the thorn, and sorrow and gladness are linked together.” Happy Rose Day!"

        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.Pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(RoseStatusQuotos.this,List);
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
