package com.geniusnine.android.valentinesspecial.TeddyDay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.valentinesspecial.ChocolateDay.ChocolatePoemsDisplay;
import com.geniusnine.android.valentinesspecial.ChocolateDay.ChocolatedayPoems;
import com.geniusnine.android.valentinesspecial.R;

public class TeddyDayPoems extends AppCompatActivity {

    ListView listTeddyPoems;
    ArrayAdapter<String> adapter;
    String teddysPoems[] = {

            "My Furry Friend teddy bear",
            "A Gift For You my teddy bear",
            "By Gifting u This Teddy ",
            "Teddy Bear Day ",
            "Love is a Divine Feeling",
            "A Bear Hug ",
            "My Teddy Bear",
            "Teddy Bear Love",
            "The Fire Of Love ",
            "Secret Lover",
            "My Teddy Bear Getting Old",
            "Bear Hugs",
            "Just a teddy bear",
            "Teddy Bears"

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
                Intent i = new Intent(TeddyDayPoems.this, TeddyPoemsDisplay.class);
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


