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

public class ChocolateDayStatus extends AppCompatActivity {
    ListView listViewChocolateStatus;
    ArrayAdapter<String> adapter;
    String Status[] = {" All you need is love. But a little chocolate",

            " Let's face it, a nice creamy chocolate cake",

            " There is nothing better than a friend, unless ",

            " Look, there's no metaphysics on earth like",

            " If there's no chocolate in Heaven, I'm not going",

            " The greatest tragedies were written by the Greeks",

            " Will looked horrified. What kind of monster could",

            " Happiness. Simple as a glass of chocolate or tortuous",

            " Chocolate says 'I'm sorry' so much better than words",


            " Your hand and your mouth agreed many years ago that",

            " Anything is good if it's made of chocolate.",

            " What you see before you, my friend, is the result of",

            " Always serve too much hot fudge sauce on hot fudge ",


            " Chemically speaking, chocolate really is the world's ",

            "  Coffee and chocolate—the inventor of mocha should",

            "  I was like a chocolate in a box, looking well behaved ",

            "  May your life be filled, as mine has been, with love ",

            "  It was like having a box of chocolates shut in the ",

            " Chocolate symbolizes, as does no other food, luxury,",

            " It was an indulgence, learning last words. Other people ",



            " Chocolate is like my best friend and the most intense ",

            " I'm pretty sure that eating chocolate keeps wrinkles ",

            " The Duchess set about studying Annette and shortly found",


            " When we don't have the words chocolate can speak volumes",

            " Remember the days when you let your child have some",

            "  Everyone needs fudge, Hildy. It's how God helps us ",

            "  If Warren Buffet made chocolate, I’ll bet it’d be really",


            "  Chocolate is a perfect food, as wholesome as it",

            " You are trying to lure us into revealing information",


            " A little chocolate a day keeps the doctor at "};

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
                Intent i = new Intent(ChocolateDayStatus.this, ChocolateStatusDisplay.class);
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
