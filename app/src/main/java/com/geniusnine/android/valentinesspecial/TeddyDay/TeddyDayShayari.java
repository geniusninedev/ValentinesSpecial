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

public class TeddyDayShayari extends AppCompatActivity {

    ListView listTeddyPoems;
    ArrayAdapter<String> adapter;
    String teddysPoems[] = {
            "Suhavani or dravni raat me sirf ",

            "Love me Love me my Teddy ,",

            "Boy: Do U Hug Ur Teddy Bear",

            "Mere Teddy sambhal kar rakhna",

            "Sookhe Hotho pe hoti Hai Mohabbat ki",

            "Kuch Ehsason Ke Saye Dil Ko Chu ",

            "Unhe Ye Shikayat Hai Hamse,Ki Ham ",

            "Aap Akele Chal diya ham khade rah gaye ",

            "Kuch Ehsason Ke Saye Dil Ko Chu Jate  ",

            "Teri meri dosti ka afsana bhi hai",
            "Akela mahsus karta hai Ek pyara Sach..",
            "I wrote your name in the sky,but the wind ",
            "Love knows no reason,love knows no ",
            "When daylight turns 2 a darkened hue,",
            "Usne khawaish ki rone ki,To dekho barsaat ",
            "Zindagi or Maut Ka Kis Ko Pata haii ?? ",
            "Chocolate ki khushbu,Icecream ki ",
            "Guzar jai ga yeah din yar gar tum kartay ",
            "u r In My Thoughts & In My Heart ",
            "Ye promise h humara, Na chhodenge kabhi ",
            "Let the world stop turning,Let the sun stop  ",
            "Jante hai wo phir bhi Anjaan Bante hai,Isi",
            "Kitna bhi chaho, na bhol paoge",
            "Tuze Jo Chaha Dil Se Hai,",
            "Meri jindgi ki khushiya tere hone se hai,"





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
                Intent i = new Intent(TeddyDayShayari.this, TeddyShayariDisplay.class);
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
