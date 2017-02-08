package com.geniusnine.android.valentinesspecial.ChocolateDay;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.geniusnine.android.valentinesspecial.R;

/**
 * Created by Supriya on 07-02-2017.
 */

public class ChocolateShayariDisplay extends AppCompatActivity {
    ViewPager viewPager;
    PagerAdapter adapter;
    String[] brainpuz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolate_poems_display);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        brainpuz = new String[]{  "Mere dil ki dhadkan ho tum perk " +
                "ke chocolate ka wrapper ho tum rehna hamesha" +
                " yun hi mere saath kyuki tum meri fav chocolate ho tum" ,

                " Tera Ye Meetha Sa Pyaar, Laya Hai Mere " +
                        "Jeevan Me Bahar Is Pyaar Ki Mithas" +
                        " Hai Ek Waar, Chocolate Day Pe Mai " +
                        "Karta Hu Pyaar Ka Izhaar " +
                        "Happy Chocolate Day" ,

                "For Those Of You Who Cant Afford,The" +
                        " Luxury Of Treating Your Precious " +
                        "Darling With Spa Treat Can Always Go " +
                        "Ahead And Convey Chocolate Day Greeting" +
                        " By Laying Hands Of Lindts,Ferro Rocher " +
                        "Or Hersheys Vouchers For Chocolate Day " +
                        "Is All About Splurging And LadiesDo" +
                        " Have A Fondness For Foreign Brands.....",

                " Ek Sheikh Nay Chocalate Ki Dukan Kholi." +
                        "Dukan Ke Bahar Ishtahar Lagaya.ek" +
                        " Adad Mulazim Ki Zaroorat Hay," +
                        "Jo Sugar Ka Mareez Ho! Chocalate" +
                        " Din Mubarak Ho!!!",

                "Happy Chocolate day...!! Chocolate is" +
                        " sweet as you are,Chocolate is great " +
                        "as you are, Chocolate is the thing that" +
                        " we live,today is the day to share " +
                        "Chocolates with each another,So wishing " +
                        "u very Happy Chocolate day..." ,

                " Is sweet se din mai, Apne sweet se friend ko," +
                        " Sweet si chocolate, meri or se." +
                        " happy Chocolate Day !!" ,

                " Sweet Sweet Sa Yaar Hamara,Chocolate Se Meetha " +
                        "Pyar Tumhara,Just Sweet Lines For" +
                        " My Sweety,Happy Chocolate Day Honey!!!",

                " Mujhe in raaho me tera saath chahiye," +
                        " Tanhaiyo me tera hath chahiye, " +
                        "Khushiyon se bhare is sansar me tera" +
                        " pyaar chahiye Happy Chocolate Day" ,

                " Chocolate Din Mubarak Ho Dil, Humara Chocolate" +
                        " Ki Tarah Najuk, Tum Usme Dry Fruits " +
                        "Ka Tadka, Life Hogi Fruit And Nut Jaisi," +
                        " Agar Mill Jaye Girlfriend Tere Jaisi." ,

                " Chupa Loon Is Tarah Tujhe Apni Baahon Mein," +
                        " Ki Hawa Bhi Guzarne Ki Izazat Maange, " +
                        "Ho Jaun Itna Madhosh Tere Ishq Mein," +
                        " Ki Hosh Bhi Aane Ki Izazat Manage." ,

                " Aap Khud Nahi Janti Aap Kitni Pyari Ho," +
                        " Jaan Ho Hamari Par Jaan Se Pyari Ho, " +
                        "Duriyon K Hone Se Koi Fark Nahi Padta, " +
                        "Aap Ki Bhi Hamari Thi Or Aaj Bhi Hamari Ho." ,

                " Sanam Tera Ye Meetha Sa Pyar, " +
                        "Laya Hai Mere Jeevan MeBahaar," +
                        " Is Pyar Ki MithaasHai Ek Waar, " +
                        "Chocolate Day PeMai Karti Hu Pyar KaIzhaar.",

                " Tyohar pyaar ka aya hai, sang apne khushiya" +
                        " laya hai, Na rahe koi bhi rang feeka," +
                        " kar lete hain pehle kuch muh meetha," +
                        " Happy chocolate day." ,

                " Chocolate Day Aaya Hai TeriYaad Laya Hai," +
                        " Aajao Aaj DilNe Tujhe Fir Bulaya Hai, " +
                        " Aye, Jaan E Tamanna Tujhe MananeKe Liye Maine," +
                        " Chocolate DayKa Pura Dabba Mangwaya Hai." ,

                "  5 Star Ki Tarah Dekhti Ho, Nestle Bar " +
                        "One Ki Tarah Sharmati Ho, Cadbury Silk" +
                        " Ki Tarah Jab Tum Muskurati Ho Sach Bolu," +
                        " Kit Kat Ki Kasam Tum Bahot Khubsurat Lagti Ho." +
                        " Happy Chocolate Day." ,

                "  Mithaas Bhari Hui Har Aur Hai, Lage Hai Jaise " +
                        "Khoobsurat Shama Pur-Zor Hai, Dhoonda Toh " +
                        "Paya Aapki Hai Ye Mithaas, Jo Aaj Ke Din Ek" +
                        " Chocalate Ki Tarah, Meethi Aur Chaayi Harr" +
                        " Aor Hai, Chocalate Ka Meetha Din Mubarak Ho." ,

                "  Bina pukaare hame hamesha Saath paaoge, Karo waada" +
                        " hamse ki Dostii aap bhi nibhaoge, Matlab mera" +
                        " ye nahi ke roz Yaad Karna, Bas yaad rakhna " +
                        "uss waqt jab Akele Akele ! Dairymilk ! khaoge ! " ,

                " Naadani Mein ham Kise apnaa Samajh Baithe, " +
                        "Jo Dikhayaa us bewafaa ne hame sapnaa" +
                        "hum Hakeekat samajh baithe, Dekho aaj" +
                        " chor diyya hamein ussne ek gair ke lie, " +
                        "Jisse ham apnaa hamsafar samajh baithe !." +
                        " Happy Chocolate Day my love ! " ,

                " Dill hamaara Chocolate ki taraah naazuk," +
                        " Tum ussme Dry Fruits ka tadkaa," +
                        " Life hogi Fruit n Nuts jasi, Agar " +
                        "mill jae Girlfriend bilkul tere jaisi" ,

                " Aj Chocolate Day ha chocolate to khilaao," +
                        " Meethi meethi koii baat to sunaao," +
                        " Kabse tadapp rahee hai ham apke pyar mein," +
                        " Aaj toh hame apne paass bulaao, Happy Chocolate Day Jaan" ,


                " Pyaar Kaa Tyohaar Hai Aya, Sang hamare\n" +
                        "Hai Khushiyaan Laaya. Aao Mill Kar\n" +
                        "Manaaye Isse, Koyi Bhii Rangg Naa Rahe\n" +
                        "Fiika, Parr Sabse Pehle Karlo Kuchh\n" +
                        "Muu Miitha. Happy Chocolate Day " ,

                " Chocolate Day Mubaarakh Ho Dill\n" +
                        "Humaara Chocolate Kii Taraah Nazuk\n" +
                        "Tum Usmei Dry Fruits Kaa Tadkaa\n" +
                        "Life Hogii Fruit n Nuts Jaisii\n" +
                        "Agar Mill Jaaye Girlfriend Tere Jaisi" ,

                " Gull ko gulshann mubaarakh ho, Chand ko chandni" +
                        " mubaarakh ho, Shaayar ko shayari mubarakh" +
                        " ho, Aur hamaari taraf se aapko" +
                        "“Chocolate Day” mubaarakh ho…" ,

                " Iss sweet se dinn me,\n" +
                        "Apne sweet sii girlfriend ko,\n" +
                        "Sweet see chocolate, merii or se.\n" +
                        "Happy Chocolate Day 2017 !!"

        };
// Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(ChocolateShayariDisplay.this,brainpuz);
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


