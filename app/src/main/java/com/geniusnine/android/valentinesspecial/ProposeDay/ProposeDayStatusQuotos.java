package com.geniusnine.android.valentinesspecial.ProposeDay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.geniusnine.android.valentinesspecial.R;
import com.geniusnine.android.valentinesspecial.ValentineSpecial.RoseDayShayariQuotos;
import com.geniusnine.android.valentinesspecial.ValentineSpecial.ViewPagerAdapter;

/**
 * Created by Dev on 07-02-2017.
 */
public class ProposeDayStatusQuotos  extends AppCompatActivity{
    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rose_day_shayari_quotos);


        List = new String[] {
                "“I want to marry you because I cannot live without you.”",

                "“Let me love you if not for the rest of your life then for the rest of mine.”",
                "“Meeting you was fate. becoming your friend was a choice,\n" +
                        "but falling in love with you was beyond my control.”",
                "“I want everyone to meet you.\n" +
                        "You’re my favorite person of all time.”",
                "“Everyone says you only fall in love once, but that’s not true,\n" +
                        "every time i hear your voice I fall in Love all over again.”",
                "“The most magical moments are those\n" +
                        "when you forget yourself in the joy of someone’s presence.”",
                "No poems no fancy words I just want the world to know that I love you.\n" +
                        "My princess with all my heart. Happy Propose Day!","Will you be mine on this propose day?",
                "I promise you no matter what happens\n" +
                        "I will be there with you always! Happy Propose Day!",
                "I love you, will you marry me?",

                "Koi hain jiska ess dil ko intjaar hain,\n" +
                        "Khyalo mein bas usi ka khayal hain,\n" +
                        "Khushyaan main saari us par luta du..\n" +
                        "Chahat me uski mai khud ko mita du..\n" +
                        "Kab ayega vo jiska es dil ko intjaar hain.","Aankhe To Pyar Mein Dill Ki Juban Hoti Hai,\n" +
                "Chahat To Sada Bejuban Hoti Hai,\n" +
                "Pyar Mein Dard Bhi Mile To Kya Ghabrana,\n" +
                "Suna Hai Dard Se Chahat Or Jawan Hoti Hai.","Tu Kahe Jo Bhi Woh Karunga Main,\n" +
                "Tu Udas Na Ho Tere Paas Hun Main,\n" +
                "Kya Karna Hai Kisi Aur Ka Sang,\n" +
                "Tere Saath Sanam Din Raat Hun Main.","Bin Aapke Kuchh Bhi Achha Nahi Lagta,\n" +
                "Kuchh Pal Ki Judai Bhi Sahi Nahi Jaati,\n" +
                "\n" +
                "Tum Khud Hi Samajh Lo Gahrayi Pyar Ki,\n" +
                "Likh Kar Yeh Baat Mujhse Kahi Nahi Jaati.","Yeh Doori Aur Humse Sahi Nahi Jaati,\n" +
                "Tere Paas Aane Ko Dil Karta Hai,\n" +
                "\n" +
                "Bhula Kar Saare Duniya Bhar Ke Ghamon Ko,\n" +
                "Tere Aagosh Mein So Jaane Ko Dil Karta Hai.","Mohabbat ka koi rang nahi,\n" +
                "Fir bhi wo rangin hai,\n" +
                "Pyar ka koyi chehra nahi,\n" +
                "Phir bhi woh hasin hai.","Tere Aaghosh Mein, Aane Ko Betab Hun Main,\n" +
                "Jab Chaho, Eh Dost Pukar Lena Hamein,\n" +
                "Mahsoos Karna Chahta Hu, Teri Dhadkano Ko,\n" +
                "Aankhon Ke Raste, Dil Mein Utaar Lena Hamein.","Bhale Laakh Kar Lu Koshish Bhi Magar,\n" +
                "Dil Ki Baat Kahi Na Jaayegi Mujh Se,\n" +
                "Eh Mere Hamdam Na Hona Juda Kabhi,\n" +
                "Teri Judaayi Na Sahi Jaayegi Mujhse.","Aakar Aap Ab Jana Nahi,\n" +
                "Dil Ko Mere Tarsana Nahi,\n" +
                "Hum De Chuke Hain Dil Aapko,\n" +
                "Todkar Isko Tadpana Nahi.","In Aankhon Mein Aur Koi Ab Basta Nahi Hai,\n" +
                "Ek Aapko In Aankhon Mein Basaane Ke Baad,\n" +
                "Yeh Dil Mera Ab Kahi Aur Lagta Nahi Hai,\n" +
                "Ik Aap Se Is Dil Ko Lagane Ke Baad.","Aap Humko Aise Mat Dekhiye,\n" +
                "Kahin Humko Mohabbat Na Ho Jaaye,\n" +
                "Aap Toh Muskura Kar Chale Jaaoge,\n" +
                "Is Dil Ko Musibat Na Ho Jaaye.","Woh Itne Hasee Honge Eh Mere Dosto,\n" +
                "Dil Ko Is Baat Ka Yakee Aata Nahi,\n" +
                "Ab Toh Unko Paane Ki Chahat Ho Gayi,\n" +
                "Unke Bina Ab Kuchh Bhata Nahi.","Aapki Pooja Karte Hain Hum,\n" +
                "Aap Par Hi Bas Marte Hain Hum,\n" +
                "Humko Aapse Bahut Pyar Hai,\n" +
                "Aapko Kahne Se Darte Hain Hum."
        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.Pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(ProposeDayStatusQuotos.this,List);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

        int pos = getIntent().getIntExtra("key", 0);
        viewPager.setCurrentItem(pos);



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
                if (id == R.id.action_send) {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_TEXT, "message to share");
                    startActivity(Intent.createChooser(i, "Share via"));
                    return true;
                }
                return super.onOptionsItemSelected(item);

        }
    }
}


