package com.geniusnine.android.valentinesspecial.TeddyDay;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.geniusnine.android.valentinesspecial.ChocolateDay.ViewPagerAdapter;
import com.geniusnine.android.valentinesspecial.R;

/**
 * Created by Supriya on 07-02-2017.
 */

public class TeddyShayariDisplay extends AppCompatActivity {


    ViewPager viewPager;
    PagerAdapter adapter;
    String[] brainpuz;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teddy_poems_display);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        brainpuz = new String[]{

                "Suhavani or dravni raat me sirf ek farak hai Agar raat ko teddy ko hug karke so jao to raat suhavni aeor agar agge se teddy bhi hug kar laye to raat dravni hai !!!!!!Happy Teddy Day......................",

                "Love me Love me my Teddy Bear,Kiss me Kiss me my Teddy Bear,Hug me Hug me my Teddy Bear Happy Teddy Bear Day.....",

                "Mere Teddy sambhal kar rakhna Yeh aapko bahut pyar karta hai Hamare Dil ki batein yeh aapse kahega Kyunki hamara dil aapse kehne se darta hai.........Happy Teddy Bear Day.........",

                "Sookhe Hotho pe hoti Hai Mohabbat ki Baaten.. Pyas Jab Bujh Jaye to Lahaze Badal Jate Hai.. Hamein aj Bhi Nai Bhoole Tumh.. Happy Teddy Day With Love",

                "I wish I were a cell in your blood,so I would be sure I was somewhere in your heart.Happy Teddy Bear Day..",

                "Kuch Ehsason Ke Saye Dil Ko Chu Jate Hain, Kuch Manzar Dil Mein Utar Jate Hain, Bejan Gulshan Mein Bhi Phool Khil Jate Hain, Jab Zindagi Mein Aap Jaise Dost Mil Jate Hain. !!!Happy Teddy Day................",

                "Unhe Ye Shikayat Hai Hamse,Ki Ham Har Kisi Ko Dekh Kar Muskurate Hai,nasamajh Hai Wo Kya Jane,Hame To Har Chehre Mai Wo Hi Nazar Ate Hai.Happy Teddy Day To My Friend...........",

                "Aap Akele Chal diya ham khade rah gaye Har baar ki tarah Aansu Aj Bhi Bah gaye Hamne yaad kiya apko har lamha Aur ap ne hans ke kaha Yaad kiya sabko 1 bas ap hi rah gaye Happy Teddy Day",

                "Kuch Ehsason Ke Saye Dil Ko Chu Jate Hain,Kuch Manzar Dil Mein Utar Jate Hain,Bejan Gulshan Mein Bhi Phool Khil Jate Hain,Jab Zindagi Mein Aap Jaise Dost Mil Jate Hain............ Happy Teddy Bear Day!!!",

                "Teri meri dosti ka afsana bhi hai Is me pyar ka khazana bhi hai Isliye chahte hain aapse Teddy Bear mangna Or aaj to mangne ka bahana bhi hai.............Happy Teddy Bear Day....................",

                "Akela mahsus karta hai Ek pyara Sach.. Wo InsaaN jo Hamesha sabko khush rakhne ki koshish karta Hai aur Sabki care karta hai Wo hamesha khud ko akela mahsus karta hai..Its True Happy Teddy Day",

                "I wrote your name in the sky,but the wind blew it away. I wrote your name in the sand,but the waves washed it away. I wrote your name in my heart,and forever it will stay...........Happy Teddy Day................",

                "Love knows no reason,love knows no lies.Love defies all reasons,love has no eyes.But love is not blind,love sees but doesnt mind.Happy Teddy Day..........",

                "When daylight turns 2 a darkened hue,D lovely stars r hinting u,Ur heart beats tells u something true,That some1 sumwher is missing U.!!!Happy Teddy Bear Day...........",

                "Usne khawaish ki rone ki,To dekho barsaat aa gayi. Hamari tamanna thi unhe teddy deker manane ki Lo teddy ki hi raat aa gayi...... Happy Teddy Bear Day 2017...........",

                "Zindagi or Maut Ka Kis Ko Pata haii ?? Unexpected Chuttii Ka Apna hii Maza haii.. Wah Jee Wah!! Kash Teddy Day Ki Bhi Chuttii Hua Karti hahaha Happy Teddy Day.",

                "Chocolate ki khushbu,Icecream ki mithas,Pyar ki masti Or hothon ka swad,Hasi k gubbareOr tumhara sath Mubarak ho aapko Teddy Day kaa tyohaar",

                "Guzar jai ga yeah din yar gar tum kartay ho kisi se pyar milega na aisa mauqa kabhi phir bahot pachtao gay tum yar isi liye kehte hain tumsay ke kar lo tum jaldi jaldi izhar",

                "u r In My Thoughts & In My Heart Wherever I May Go On Teddy Bear Day I would Lyk To Say I Care More Than You Know..I were a cell I vish I were a cell in ur blood so I wld b sure I was some-where in ur hrt .Happy Teddy Bear Day",

                "Ye promise h humara, Na chhodenge kabhi saath tumhara, Jo gaye tum hume bhool kar, Le aayenge pakad kar haath tumhara.. Happy teddy day",

                "Let the world stop turning,Let the sun stop burning,Let them tell me loves not worth going through.If it all falls apart, I will know deep in my heart,The only dream that mattered had come true In this life I was loved by you.Happy Teddy Bear Day............",

                "Jante hai wo phir bhi Anjaan Bante hai,Isi tarah wo hame pareshan Karte hai,Puchte hai hamse ki apko kya pasand hai, Khud Jawab hokar sawaal karte hai.............Happy Teddy Bear Day With Love.....",

                "Kitna bhi chaho, na bhol paoge\n" +
                        "Hum se jitna dur jao nazdik paoge\n" +
                        "Humein mita sakte ho to mita do\n" +
                        "Yaadein meri, magar…\n" +
                        "Kya sapno se juda kar paoge humein",

                "Tuze Jo Chaha Dil Se Hai,\n" +
                        "Magar Lagta Nahi Aaj Kahe Paunga,\n" +
                        "Yaaden Jo Dastan Baan Gayi Hai,\n" +
                        "Ijahar Karke Mere Nasibe Ko Aajmaunga",

                "Meri jindgi ki khushiya tere hone se hai,\n" +
                        "Mere hothon pe muskan tere hone se hai,\n" +
                        "Sun ke dekh dhadkan mere dil ki\n" +
                        "Jo dhadkta sirf tere hone se hai."









        };
// Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pagerTeddy);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(TeddyShayariDisplay.this,brainpuz);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

        int pos = getIntent().getIntExtra("key", 0);
        viewPager.setCurrentItem(pos);




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
