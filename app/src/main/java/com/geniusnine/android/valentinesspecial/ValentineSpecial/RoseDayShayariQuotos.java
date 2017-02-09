package com.geniusnine.android.valentinesspecial.ValentineSpecial;

import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.geniusnine.android.valentinesspecial.ChocolateDay.ViewPagerAdapter;
import com.geniusnine.android.valentinesspecial.R;

public class RoseDayShayariQuotos extends AppCompatActivity {

    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rose_day_shayari_quotos);


        List = new String[] {"If my love for you is a crime, I want to be the most wanted criminal.",
                "Badi najukta se pali ho tum,\n" +
                        "Tabhi toh Gulab si khili kali ho tum.\n" +
                        "Jisse milne ko bekarar hai hum,\n" +
                        "Dil mein aane waali khalbali ho tum..","Meri deevangi ki koyi hadh nahi,\n" +
                "Teri surat k siwa muje kuch yaad nahi\n" +
                "Main GULAB hoon tere gulshan ka,\n" +
                "Tere siwaye mujh pe kisi ka haq nahi.",
                "Phool Mazaar Tak Nahi Pahuncha,\n" +
                        "Daaman-E-Yaar Tak Nahi Pahuncha,\n" +
                        "Ho Gaya Vo Kafan Se To Aazaad\n" +
                        "Phir Bhi Gulzaar Tak Nahi Pahuncha.",
                "Talash kar meri kami ko apne Dil mein…\n" +
                        "Agar dard hua to samjh lena Mohabbat ab bhi baki hai…",
                "I asked God for roses\n" +
                        "And God gave me garden of Rose\n" +
                        "I asked him a drop of water\n" +
                        "And God gave me an ocean,\n" +
                        "I asked Him for angel\n" +
                        "And God gave me you my love!\n" +
                        "Happy Rose Day Sweet Heart",
                "Dosti ka rishta anokha hai naa Gulaab sa hai na kanto sa,\n" +
                        "Dosti ka rishata to us Daali ki tarah hai jo Gulaab aur kante\n" +
                        "Dono ko ek sath jode rakhta he aakhri dum tak…….Happy Rose Day..",
                "Bade hi chupke se bheja tha, Mere mehbub ne muje ek gulab,\n" +
                        "Kambhakht uski khusbu ne , Sare shehar me hungama kar diya.",
                "My Rose Is Red,Ur Eyes R Blue,You Love Me, And I Love U.",
                "Any one can love a Rose. But No 1 will love a leaf that. Made the Rose.\n" +
                        "Don’t love someone who is beautiful But love the one who can make ur life beautiful.\n" +
                        "Happy Rose Day.”","Ek khubsurat khwab ho aap,\n" +
                "Dil ko chhu jane wala ehsaas ho aap,\n" +
                "Apko kya de gulab hum\n" +
                "Gulabo me khubsurat gulab ho aap.","Humne Hamare Ishq Ka Izhaar Yun Kiya,\n" +
                "Phoolon Se Tera Naam, Pathron Pe Likh Diya…………\n" +
                "Happy Rose day!!!","Be soft as flower\n" +
                "Be strong as rock\n" +
                "Be nice as me I know its difficult\n" +
                "But just keep trying\n" +
                "Be fresh as Rose\n" +
                "Happy Rose Day.","A rose doesn’t only means for proposing love:\n" +
                "it also means\n" +
                "R- Rare\n" +
                "O- Ones\n" +
                "S- Supporting\n" +
                "E- Entire life\n" +
                "Will you always be there?\n" +
                "Happy Rose Day.","Kadam kadam par mile khushi ki bahaar aapko,\n" +
                "Es Rose Day par dil deta hai yehi dua aapko…!!","Phulo Mein Haseen gulab Hai,\n" +
                "Parhai Ke Liye Zaroori Kitaab Hai,\n" +
                "Duniya Me Har Sawal Ka Jawab Hai,\n" +
                "Agar Koi Tumse Mere Bare Me Puche To Kehna Wo Lajawaab Hai.","“Chala jaa re SMS ban ke Gulaab,\n" +
                "Hogi sachi dosti to aayega javab,\n" +
                "Agar naa aaye to mat hona udaas,\n" +
                "Bas samajh lena ki mere liye waqt nahi tha unke paas.\n" +
                "Happy Rose Day!”","My eyes are blind without your eyes to see,\n" +
                "similar to a rose without color.\n" +
                "Love you forever"


        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.Pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(RoseDayShayariQuotos.this,List);
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
