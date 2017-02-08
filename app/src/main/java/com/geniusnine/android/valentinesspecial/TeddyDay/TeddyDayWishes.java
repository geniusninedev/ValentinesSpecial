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

public class TeddyDayWishes extends AppCompatActivity {

    ListView listTeddyPoems;
    ArrayAdapter<String> adapter;
    String teddysPoems[] = {

            " On teddy bear day, we think of people",

            " You are my teddy bear I love to be your ",

            " By gifting you this teddy, I want to ",

            " A bedroom without a teddy is like a",

            " You are the twinkle of my eyes; the",

            " Every day is a teddy day, when I ",

            " Love can’t be described, It’s meant to ",

            " On teddy bear day we think of those who",

            " I wish I were a cell in your blood, so",

            " Are you missing me? Are you feeling lonely",

            " It’s Teddy Bear Day, and I’m thinking of",

            " Love me love my teddy bear, kiss me kiss ",

            " You are smile of my lips twinkle of my",

            " Teddy bear day is a day of love, It's a day ",

            " This is what I want to do, as my love is my ",

            " On teddy bear day, we think of people who have",

            " You are in my heart and mind wherever I go, on",

            " I wish I were a cell in your blood, so I would ",

            " Love knows no reason, love knows no lies. Love ",

            " Wake in the deepest dark of night and hear the ",

            " To be always with you a life with you, I hope,",

            " Don’t miss to see my gift, open it with the love ",

            " You are always my darling, you will be my date",

            " I wish I was a teddy bear, that lay upon your bed.",

            " Love doesn’t know the rules, love just knows how to ",

            " Sitting on the beach a cottage small near a beautiful"
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
                Intent i = new Intent(TeddyDayWishes.this, TeddyWishesDisplay.class);
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

