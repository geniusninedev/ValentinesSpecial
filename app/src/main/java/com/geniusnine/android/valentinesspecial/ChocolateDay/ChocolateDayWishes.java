package com.geniusnine.android.valentinesspecial.ChocolateDay;

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

public class ChocolateDayWishes extends AppCompatActivity{
        ListView listChocolatePoems;
       ArrayAdapter<String> adapter;
        String puzzels[] = {

                "I like pastels and lighter shades on darker ",


               "Look at bread, and see it as a Dairy Milk Cadbury's ",


                "I have one chocolate Lab named Jasmine..",


                 "My fans have great senses of humor",


             "I really love my food. My favorite thing ",


                "I might be able to walk away from sexy,",


            "Money can't buy happiness. But, it can buy ",

          "If chocolate is the answer. the",


           "Nothing says I love you like the gift of",


                 "Also, vampires don't eat food. ",

               "Chocolate is a true friend, ",


                 "Chocolate craving your lips, ",


               "Mom always said too much chocolate is like ",

               "A dark-chocolate truffle melts in my mouth, ",

               "Chocolate is medicinal. I just did ",

                 "To me, chocolate was the ",


                "Theo nodded slowly.You love ",

                 "Synthetic chocolate sounds wrong.",

                 "My favourite word? I think, delicious,",


                 "I like all sorts of chocolate. Milk chocolate",

                 "I particularly like Hershey's chocolate",

                 "I travel with chocolate - Godiva with caramel. ",


                 "I never got a chocolate birthday cake; I got a carob one.",

                 "I love nothing more than a good, rich, dark",


                 "I love dark chocolate. I'm also a peanut ",

                 "If I weren't acting, I would own my own ",

                 "The older I get, the harder it is to splurge without",

                 "My weakness is chocolate - especially",

                 "I need God’s grace and something baked "};


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
        Intent i = new Intent(ChocolateDayWishes.this, ChocolateWishesDisplay.class);
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
