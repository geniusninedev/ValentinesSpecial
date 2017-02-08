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
public class RoseDayPoem extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rose_day_shayari);


        listView=(ListView)findViewById(R.id.listViewRoseDay);

        String[] values = new String[] {
            "With this rose, I reveal all my\n" +
                    "thoughts and feelings about you\n" +
                    "that I have withheld for so long...."
                ,"Every bird cannot dance But peacock do it Every friend can not reach my heart but u did it.\n" +
                "Every Flower can not express love But rose do it.\n" +
                "“Happy Rose Day...”\n",

                "Everyone likes the rose petals\n" +
                        "but not the green sepals\n" +
                        "which protects it\n" +
                        "in its budding stage,\n" +
                        "similarly everyone loves the beautiful faces.....",
                "Bunch of rose I am sending you\n" +
                        "Yellow to show our happiness\n" +
                        "White to show our purity\n" +
                        "Black to show our darkest secrets\n" +
                        "And red to show our love...",
                "Sweet as A Rose Bud, \n" +
                        "Bright as A Star\n" +
                        "Cute as a Kitten, \n" +
                        "That’s What U Are.....",
                "In the Flower, My Rose is U.\n" +
                        "In the Diamond, My Kohinoor is U.\n" +
                        "In the Sky, My Moon is U.\n" +
                        "I’m only Body, My Heart is U.\n" +
                        "That’s Y i always Miss You !!..",
                "Any 1 can love a Rose.\n" +
                        "But no 1 will love a leaf that.\n" +
                        "made the Rose....",
                "I ask God for a rose\n" +
                        "n\n" +
                        "he gave me flowers;\n" +
                        "I ask God for water...","Rose, Rose\n" +
                "Love you, without words.\n" +
                "When I touch your waist,\n" +
                "Close to your lips....",
                "Kissed by a rose\n" +
                        "With all the thorns\n" +
                        "My eyes become large\n" +
                        "And I can see a glow...","Prayer is worth more than a rose\n" +
                "in my hand where love grows...",
                "\n" +
                        "We have spent our live searching for the one\n" +
                        "Talking to each other about the people we are with...",
                "Sun strong love A look from you is as blinding as the sun, \n" +
                        "As stunning as your eyes I lose myself in. \n" +
                        "A look from you is as pure as the clear blue sky, \n" +
                        "When I'm with you....","Sweet love you and me Put your hand in mine now and forever \n" +
                "Darling, here I stand, stand before you \n" +
                "Deep inside I always knew ....",
                "I sit here thinking about you,\n" +
                        "I can’t get you off my mind\n" +
                        "I search and search and its you I find....","\n" +
                "I love you I never really know how you feel \n" +
                "I can't read your mind \n" +
                "I just keep waiting ...",
                " What It Means To Love\n" +

                        "Shy love As far as the ocean is wide \n" +
                        "through miles and miles of sea; \n" +
                        "You will be someone special \n" +
                        "a true miracle to me....","Will U Be Mine?\n" +

                "one name makes me blush\n" +
                "one smile dries my tears away\n" +
                "one touch brings a chill through my spine","Like a star you came into my life\n" +
                "You filled my heart with joy\n" +
                "You took my pain as if it was yours....",
                "You're my man, my mighty king,\n" +
                        "And I'm the jewel in your crown,\n" +
                        "You're the sun so hot and bright,\n" +
                        "I'm your light-rays shining down.."

        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.activity_rose_day_shayari,R.id.textViewRose, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(RoseDayPoem.this,RosePoem.class);
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

