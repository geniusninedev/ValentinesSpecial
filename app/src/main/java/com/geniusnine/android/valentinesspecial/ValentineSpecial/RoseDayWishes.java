package com.geniusnine.android.valentinesspecial.ValentineSpecial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.valentinesspecial.R;

/**
 * Created by Dev on 07-02-2017.
 */
public class RoseDayWishes  extends AppCompatActivity{
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rose_day_shayari);


        listView=(ListView)findViewById(R.id.listViewRoseDay);

        String[] values = new String[] {
             "My love is like a rose divided into two, the leaves I give to others, but the rose I give to you. Happy Rose Day!",
                "Love is similar to a rose. When pressed between two people, it will last forever with the same pleasant feeling.",
                "You know it’s love when all you want is that person to be happy; even if you’re not part of their happiness.," +
                        "Meet was fate, always your friend choice, but falling in love with you was completely out of my control. Happy Rose Day!",
                "The one who is precious to me. I wish her very special rose day…",
                "My days and nights are spent thinking of you. My dreams have come true. Now that you are in my life. Happy Rose Day!",
                "A rose to say… You mean a lot to me! Happy Rose Day!",
                "Word cannot fully express how I feel about you for me, you are a source of happiness, love and strength. Happy Rose Day!",
                "True friendship is like a rose. We don’t realize it’s beauty with it fades. Happy Rose Day!",
                "The red rose whispers of passion, and the white rose breathes of love; O, the red rose is a falcon, and the white rose is a dove.",
                "My rose is red, your eyes are blue, you love me, and I love you. Happy Rose Day!",
                "Sending you a rose to say. Happy Rose Day!",
                "A rose from that special someone can make a normal day special.",
                "Happy Rose Day: Accept this rose of mine as a symbol of love, friendship, faith and trust.",
                "True friendship is like a rose, we can’t realize it’s beauty until it fades.",
                "Sending some cute roses to the most beautiful smile and earth… Happy Rose Day!",
                "I am sending these roses to a sweet and special person. That’s you my darling…",
                "You words are my food, your breath is my wine. You are everything to me.",
                "Every bird cannot dance but peacock do it. Every friend can not reach my heart but you did it. Every flower can not express love but rose do it. Happy Rose Day!",
                "You are like the sunshine so warm, you are like sugar, so sweet. You are like a rose, so special. And that’s the reason why I love you. Happy Rose Day!"


        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.activity_rose_day_shayari,R.id.textViewRose, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(RoseDayWishes.this,RoseDayWishesQuotos.class);
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



