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

public class ChocolateDaySmsAndQuotes extends AppCompatActivity {
    ListView listViewChocolateStatus;
    ArrayAdapter<String> adapter;
    String Status[] = { "Whenever I have even a spare second,",

             "War is a bazaar where lives are traded like ",

             "War is a bazaar where lives are traded like any ",

             "Sometime all you need is love. Oh wait! ",

             "Some people smoked crack in alleyways. ",

             "When I was a child, I used to eat sugar ",

             "I'm all over the place with muffins. Carrots ",

             "I just love to bake chocolate cakes and ",

             "If kept dry, a chocolate with a high ",

             "I love dark chocolate, but I will have ",



             "I'm always, all the time, eating chocolate.",

             "I particularly like Hershey's chocolate, ",

             "I'm not into fad diets; I'm not into depriving.",

             "I love chocolate. Black chocolate with marshmallow ",

             "Cocoa boosts brain serotonin. Almost every single",

             "If it's not chocolate, it's not breakfast",

             "I'm passionate about anything I align myself with.",

             "I'm a woman who wants her chocolate",

             "It's not a struggle to be on a diet. You feel",

             "It's not exactly under the radar, but when I'm ",



             "I like pastels and lighter shades on darker skins. ",

             "Look at bread, and see it as a Dairy Milk ",

             "I eat a lot of chocolate",

             "I have one chocolate Lab named Jasmine.",

             "My fans have great senses of humor and "
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolateday_poems);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listViewChocolateStatus = (ListView) findViewById(R.id.listViewData);

        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_chocolateday_poems, R.id.textViewPoems, Status);
        listViewChocolateStatus.setAdapter(adapter);
        listViewChocolateStatus.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ChocolateDaySmsAndQuotes.this, ChocolateSmsDisplay.class);
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
