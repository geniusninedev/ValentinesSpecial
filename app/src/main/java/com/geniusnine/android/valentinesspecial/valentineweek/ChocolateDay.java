package com.geniusnine.android.valentinesspecial.valentineweek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.geniusnine.android.valentinesspecial.R;

public class ChocolateDay extends AppCompatActivity {
    ListView list;
    String[] web = {
            "Status",
            "Shayari",
            "Dress Up",
            "Poems",
            "Wishes"


    } ;
    Integer[] imageId = {R.drawable.status,R.drawable.shayari,R.drawable.dressup,R.drawable.poem,R.drawable.wishes

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolate_day);



        CustomList adapter = new CustomList(ChocolateDay.this, web, imageId);
        list=(ListView)findViewById(R.id.chocolate);
        list.setAdapter(adapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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

                return super.onOptionsItemSelected(item);

        }
    }
}
