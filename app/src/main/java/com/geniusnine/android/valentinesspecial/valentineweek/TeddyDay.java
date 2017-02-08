package com.geniusnine.android.valentinesspecial.valentineweek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.geniusnine.android.valentinesspecial.ChocolateDay.ChocolateDayShayari;
import com.geniusnine.android.valentinesspecial.ChocolateDay.ChocolateDayStatus;
import com.geniusnine.android.valentinesspecial.ChocolateDay.ChocolateDayWishes;
import com.geniusnine.android.valentinesspecial.ChocolateDay.ChocolatedayPoems;
import com.geniusnine.android.valentinesspecial.R;
import com.geniusnine.android.valentinesspecial.TeddyDay.TeddyDayPoems;
import com.geniusnine.android.valentinesspecial.TeddyDay.TeddyDayShayari;
import com.geniusnine.android.valentinesspecial.TeddyDay.TeddyDaySmsAndQuotes;
import com.geniusnine.android.valentinesspecial.TeddyDay.TeddyDayStatus;
import com.geniusnine.android.valentinesspecial.TeddyDay.TeddyDayWishes;
import com.geniusnine.android.valentinesspecial.valentinequtos.CustomList;

public class TeddyDay extends AppCompatActivity {

    ListView list;
    String[] web = {
            "Status",
            "Shayari",
            "Sms & Quotes",
            "Poems",
            "Wishes"


    } ;
    Integer[] imageId = {R.drawable.status,R.drawable.shayari,R.drawable.dressup,R.drawable.poem,R.drawable.wishes

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolate_day);



        CustomList adapter = new CustomList(TeddyDay.this, web, imageId);
        list=(ListView)findViewById(R.id.chocolate);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    startActivity(new Intent(TeddyDay.this, TeddyDayStatus.class));
                }

                if(position == 1){
                    startActivity(new Intent(TeddyDay.this, TeddyDayShayari.class));
                }
                if(position == 2){
                    startActivity(new Intent(TeddyDay.this, TeddyDaySmsAndQuotes.class));
                }
                if(position == 3){
                    startActivity(new Intent(TeddyDay.this, TeddyDayPoems.class));
                }
                if(position == 4){
                    startActivity(new Intent(TeddyDay.this, TeddyDayWishes.class));
                }

            }
        });
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
