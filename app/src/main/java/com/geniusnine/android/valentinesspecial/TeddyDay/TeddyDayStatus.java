package com.geniusnine.android.valentinesspecial.TeddyDay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.valentinesspecial.R;

/**
 * Created by Supriya on 07-02-2017.
 */

public class TeddyDayStatus  extends AppCompatActivity {

    ListView listTeddyPoems;
    ArrayAdapter<String> adapter;
    String teddysPoems[] = {
           "To My Cutest Friend,",

            "You are Smile of my Lips,",

            "Boy: Do U Hug Ur Teddy Bear",

            "I wish I were a cell in your",

            "I wish I were a cell in your blood,",

            "On This Day I Promise U.Teddy ",

            "Whenever u c LOVE coming, WELCOME it,",

            "U r my Teddy Bear, I love to be your ",

            "Wen a TOUCH could HEAL a wound Wen EYES’S ",

            "When daylight turns 2 a darkened hue, ",

            "Be Mine Teddy Bear Day.I Am Sending You",

            "I miss the laughs, I used to get from you,",


            "To My Cutest Wife,",

            "The Soft Cuddly Teddy Is There ",

            "In our childhood, teddy bears are warm",

            "Bears like honey that comes from bees",


            "Kuch Ehsason Ke Saye Dil Ko Chu Jate Hain,",

            "Teddy Bear ki tarah tum hamesha hanste raho",

            "Bhej Raha hun Teddy Pyaar se,",

            "I wish I were a cell in your blood,",

            "By Gifting You This Teddy, I Want To ",

            "Remember when I said Teddy can’t sleep",

            "You’re In My Thoughts And In My Heart ",

            "Whenever u c LOVE coming, WELCOME it, open ",


            "I Am Sending A Teddy To You"




    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teddy_day_poems);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listTeddyPoems = (ListView) findViewById(R.id.listViewTeddy);

        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_teddy_day_poems, R.id.textViewteddy, teddysPoems);
        listTeddyPoems.setAdapter(adapter);
        listTeddyPoems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(TeddyDayStatus.this, TeddyStatusDisplay.class);
                i.putExtra("key", position);
                startActivity(i);


            }
        });

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

