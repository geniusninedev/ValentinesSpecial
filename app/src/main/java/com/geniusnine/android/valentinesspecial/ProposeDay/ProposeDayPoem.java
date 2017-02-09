package com.geniusnine.android.valentinesspecial.ProposeDay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.geniusnine.android.valentinesspecial.R;

/**
 * Created by Dev on 07-02-2017.
 */
public class ProposeDayPoem extends AppCompatActivity {

    ListView listView;
    TextView textViewRose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propose_day_status);


        listView=(ListView)findViewById(R.id.listViewRoseDay);
        textViewRose=(TextView)findViewById(R.id.textViewRose);
        String[] values = new String[] {

                "The Proposal",
                "Wedding Proposal Of A Spoon",
                "An Unexpected proposal",
                "Happy Propose Day",
                "On Bended Knee",
                "True Love",
                "Arms Fully Open",
                "I Want To Be...",
                "She Doesn't Know I Love Her",
                " My choice of love",
                "The Day My Wishes Come True",
                "Dreams",
                "Everything to Me",
                "Forever Love",
                "Joy of My Heart",
                "Giving you the key of my heart ",
                "Love",
                "My Dear Love",
                "Our Life",
                "The Power Of Love"
        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.activity_rose_day_shayari,R.id.textViewRose, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ProposeDayPoem.this,ProposeDayPoemDisplay.class);
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