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

public class TeddyDaySmsAndQuotes extends AppCompatActivity {

    ListView listTeddyPoems;
    ArrayAdapter<String> adapter;
    String teddysPoems[] = {

            "I am sorry I am away, I am sorry ",

            "Teddies are just another reason, ",

            "Hug a bear day is not how long you've ",

            "Life is a journey, and love is what  ",

            "By gifting you this teddy I want to  ",

            "A cute teddy bear, to my cute  ",

            "Love can’t be described, It’s meant to ",

            "Never could tell you my love, never could",

            "A cute teddy bear, to my cute friend, ",

            "By gifting you this teddy, I want to ",

            "What I need to live has been given to me. ",

            "In this special valentine week, On this  ",

            "Teddy bear day. I love my teddy. Happy  ",

            "You are eternal like love, You are cute  ",

            "To my cutest cuddly love, who is certainly  ",

            "A teddy bear is a faithful friend you can ",

            "The Teddy Bear is the last toy that we part ",

            "The teddy bear is the last toy that we part ",

            "To be always with you a life with you, I hope, ",

            "Boy: I am sure you love to cuddle, your ",

            "Teddy bears don't need hearts as they are ",

            "Teddy bear day is a day of love,  it's a day ",

            "A teddy bear is like a friend you hug it,",

            "Tell me I am good, tell me I love you more, "

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
                Intent i = new Intent(TeddyDaySmsAndQuotes.this, TeddySmsDisplay.class);
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


