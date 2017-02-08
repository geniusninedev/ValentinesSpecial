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

public class ChocolateDayShayari extends AppCompatActivity {

    ListView listChocolatePoems;
    ArrayAdapter<String> adapter;
    String puzzels[] = {

            "Mere dil ki dhadkan ho tum perk ke",
            "Tera Ye Meetha Sa Pyaar,",
            "For Those Of You Who Cant Afford ",
            "Ek Sheikh Nay Chocalate Ki Dukan Kholi. ",
            "Happy Chocolate day...!! Chocolate is sweet ",
            "Is sweet se din mai, Apne sweet ",
            "Sweet Sweet Sa Yaar Hamara,",
            "Mujhe in raaho me tera saath chahiye,",
            "Chocolate Din Mubarak Ho Dil,",
            "Chupa Loon Is Tarah Tujhe Apni Baahon",
            "Aap Khud Nahi Janti Aap Kitni Pyari Ho, ",
            "Sanam Tera Ye Meetha Sa Pyar,",
            "Tyohar pyaar ka aya hai, sang apne khushiya",
            "Chocolate Day Aaya Hai TeriYaad Laya Hai,",
            "5 Star Ki Tarah Dekhti Ho, Nestle ",
            "Mithaas Bhari Hui Har Aur Hai, ",
            "Bina pukaare hame hamesha Saath ",
            "Naadani Mein ham Kise apnaa Samajh",
            "Dill hamaara Chocolate ki taraah naazuk,",
            "Aj Chocolate Day ha chocolate to khilaao",
            "Pyaar Kaa Tyohaar Hai Aya, Sang hamare",
            "Chocolate Day Mubaarakh Ho Dill",
            "Gull ko gulshann mubaarakh ho, Chand",
            "Iss sweet se dinn me,"
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
                Intent i = new Intent(ChocolateDayShayari.this, ChocolateShayariDisplay.class);
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
