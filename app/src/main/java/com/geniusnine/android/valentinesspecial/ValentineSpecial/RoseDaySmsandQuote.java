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
 * Created by Supriya on 08-02-2017.
 */

public class RoseDaySmsandQuote extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rose_day_shayari);


        listView = (ListView) findViewById(R.id.listViewRoseDay);

        String[] values = new String[]{
                "Do you think that revolutions are ",

                "All June I bound the rose in sheaves, ",

                "My rose is red,Your eyes are blue,You ",

                "When I First Felt Love For You,I Knew ",

                "Believe me, you are the one, Whom my heart",

                "Bunch of rose I am sending youYellow to show ",

                "Everything About You Is Interesting,Your Smile,",

                "Sweeter than the candieslovelier than the red",

                "Whenever the occasion a rose, he rose to the ",

                "One rose says more than the dozen",

                "Love and a red rose can’t be hid",

                "The Rose is without an explanation",

                "We have chased away the clouds, ",

                "The fragrance always stays in the hand ",

                "If you enjoy the fragrance of a rose, you must",

                "Can anyone remember love? It’s like trying to ",

                "Publishing a volume of verse is like dropping ",

                "Love thou the rose, yet leave it on its stem",

                "A rose must remain with the sun and the rain ",

                "Not every bird can dance but peacock do it, ",


                "Actual meaning of giving rose to someone:- ",

                "Morning is Lucky, because Sun is the, Sky is ",

                "When i ask God for a rose, & he gave me flowers. ",

                "I looked at a sweet, beautiful rose, ",

                "Hope you found this a special rose! with love",

                "The Rose Speaks of Love Silently, in a language ",

                "Be soft as flower Be strong as rock Be nice",

                "The Rose Speaks of Love Silently,in a ",

                "A Single Rose for u for being in my life",

                "R is for Red, Red is for Blood, Blood is "

        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.activity_rose_day_shayari, R.id.textViewRose, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(RoseDaySmsandQuote.this, RoseSmsQuotosDisplay.class);
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