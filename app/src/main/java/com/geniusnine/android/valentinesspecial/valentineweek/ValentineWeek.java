package com.geniusnine.android.valentinesspecial.valentineweek;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.geniusnine.android.valentinesspecial.R;

public class ValentineWeek extends AppCompatActivity {
    GridView gridViewDays;

    public static String[] DaysList = {"Rose Day ", "Propose Day", "Chocolate Day", "Teddy Day", "Promise Day", "Hug Day", "Kiss Day", "Valentine's Day"
    };
    public static int[] SDayImages = {R.drawable.rose,R.drawable.propose,R.drawable.chocolate,R.drawable.teddy,R.drawable.promise,R.drawable.hug,R.drawable.kiss,R.drawable.valentines};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valentine_week);
        gridViewDays=(GridView)findViewById(R.id.gridViewDays);
        gridViewDays.setAdapter(new CustomAdapter(this, DaysList, SDayImages));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        gridViewDays.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    startActivity( new Intent(ValentineWeek.this,RoseDay.class));
                }

                if (position == 1)
                {
                    startActivity( new Intent(ValentineWeek.this,ProposeDay.class));
                }
                if (position == 2)
                {
                    startActivity( new Intent(ValentineWeek.this,ChocolateDay.class));
                }

                if (position == 3)
                {
                    startActivity( new Intent(ValentineWeek.this,TeddyDay.class));
                }

                if (position == 4)
                {
                    startActivity( new Intent(ValentineWeek.this,PromiseDay.class));
                }

                if (position == 5)
                {
                    startActivity( new Intent(ValentineWeek.this,HugDay.class));
                }

                if (position == 6)
                {
                    startActivity( new Intent(ValentineWeek.this,KissDay.class));
                }

                if (position == 7)
                {
                    startActivity( new Intent(ValentineWeek.this,ValentineDay.class));
                }


            }
        });




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
