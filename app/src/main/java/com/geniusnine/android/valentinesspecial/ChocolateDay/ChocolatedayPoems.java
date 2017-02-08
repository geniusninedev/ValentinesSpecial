package com.geniusnine.android.valentinesspecial.ChocolateDay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.valentinesspecial.R;

public class ChocolatedayPoems extends AppCompatActivity {

    ListView listChocolatePoems;
    ArrayAdapter<String> adapter;
    String puzzels[] = {

            "Chocolate Day",
       "Today's Day - Chocolate Day",
     "Chocolate For Love ",
     "Chocolate ",
     "A Chocolate Valentine",
      "Do not touch my chocolate covered nuts",
     "Dark Chocolate",
     "A Chocolate Kiss",
     "I love you my love mate",
    "The day I will express my love to you",
     "My chocolate angel",
     "My Chocolate Love",
            "All I Really Need Is Love",
            "Love Is Like A Chewing Gum",
            "My dearest love",
            "Your hand and your mouth"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolateday_poems);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listChocolatePoems = (ListView) findViewById(R.id.listViewData);

        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_chocolateday_poems, R.id.textViewPoems, puzzels);
        listChocolatePoems.setAdapter(adapter);
        listChocolatePoems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ChocolatedayPoems.this, ChocolatePoemsDisplay.class);
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
