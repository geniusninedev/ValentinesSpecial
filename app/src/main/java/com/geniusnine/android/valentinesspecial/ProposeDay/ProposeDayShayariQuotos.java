package com.geniusnine.android.valentinesspecial.ProposeDay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.geniusnine.android.valentinesspecial.ChocolateDay.ViewPagerAdapter;
import com.geniusnine.android.valentinesspecial.R;

/**
 * Created by Dev on 07-02-2017.
 */
public class ProposeDayShayariQuotos extends AppCompatActivity {
    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rose_day_shayari_quotos);


        List = new String[] {
                "As days go by, my feelings get stronger\n" +
                        "To be in ur arms, I can’t wait any longer\n" +
                        "Look into my eyes & u will see that it’s true\n" +
                        "Day & Night my thoughts r for U.\n" +
                        "Happy Propose Day\n" ,

                "If I reached for your hand, will u hold it ?\n" +
                        "If I hold out my arms, will u hug me ?\n" +
                        "If I go for ur lips, will u kiss me ?\n" +
                        "If I capture ur heart, will u love me ??\n" +
                        "“Happy Propose Day 2017“\n" ,

                "All I wanted was Someone to care for me,\n" +
                        "All I wanted was Someone who’d b there for me,\n" +
                        "All I ever wanted was Someone who’d b true,\n" +
                        "All I ever wanted was Someone like You,\n" +
                        "Happy Propose Day my dear\n" ,

                "I never saw so sweet a face\n" +
                        "As that I stood before.\n" +
                        "My heart has left its dwelling place\n" +
                        "And can return no more.\n" +
                        "Be with me forever.\n" ,

                "Word Have Not Enough Strength\n" +
                        "To Express My Love Towards\n" +
                        "You. My Eyes Are Enough To Express\n" +
                        "It! Happy Propose Day Dear Love of Life.",

                "At This Propose Day …\n" +
                        "I Am Opening,\n" +
                        "An Emotional Bank Account,\n" +
                        "That is Only For You Sweetheart,\n" +
                        "So .. Deposit Your All Love In It,\n" +
                        "& You Will Get The Interest Be My Valentine.\n" ,

                "For my part,,\n" +
                        "I consider that it will be found,\n" +
                        "Much better by all parties,\n" +
                        "To leave The past to history,\n" +
                        "Especially as I propose,\n" +
                        "To write that history myself.\n" +
                        "I Love You.",
                "Love is heat…\n" +
                        "You are sweet…\n" +
                        "When two Lips are meet each other.\n" +
                        "then Love is complete….\n" +
                        "Happy Propose Day…!",

                "Hello My Sweetest Sweetheart,\n" +
                        "I Just Want To Say U Something\n" +
                        "I Had In My Mind Since We Met\n" +
                        "Will U Marry Me I Will Love\n" +
                        "U Always, Always And Always.",

                "I wish I was one of your tears,\n" +
                        "so I could be born in your eye,\n" +
                        "run down your cheek,\n" +
                        "and die on your lips.\n" +
                        "Happy Propose day Lucky…!",

                "Mujhe khamosh raho me tera saath chahiye\n" +
                        "Tanha hay mera haath tera haath chahiye\n" +
                        "Junoon-e-ishq ko teri hi sougaat chahiye,\n" +
                        "Mujhey jeene ke liye teri hi zaat chahiye.",

                " Ham Apne Pyaar Ka Izhaar Isliye Nahi Karte Hain,\n" +
                        "Kyunki Ham Unki Han Ya Na Se Darte Hain,\n" +
                        "Agar Unhone Kar Di Han To Ham Khushi Se Mar Jayenge,\n" +
                        "Aur Agar Unhone Kar Di Na To Ro Ro Ke Mar Jayenge!!!\n" ,

                "Yun To Sapne Bahut Hasi Hote Hai,\n" +
                        "Par Sapno Se Pyaar Nahi Karte,\n" +
                        "Chahate To Tumhe Hum Aaj Bhi Hai,\n" +
                        "Bas Izhar Nahi Karte!!!\n" ,

                "Pyaar Kya Hai Na Poocho Tum Mujhse\n" +
                        "Kya Batane Se Maan Jaao Ge?\n" +
                        "Yoon Bataane Se Fayda Bhi Naheen\n" +
                        "Kar Ke Dekho To Jaan Jaao Ge",

                "Dil Dedo Kisi Ek Ko, Woh Bhi Kisi Nek Ko.\n" +
                        "Yeh Koi Mandir Ka Parsad Nahi,\n" +
                        "Jo Baant They Rahe Her Ek Ko.\n" +
                        "Dil Denge Kissi Ik Ko Woh Bhee Kissi Nek Ko…\n" +
                        "Jab Tak Girl Freind Nahi Pat Jaati, Propose Kerenge Her Ek Ko..\n" ,

                "Meri Prem Kahani Ka Kya Ajeeb Ending Tha,\n" +
                        "Meri Prem Kahani Ka Kya Ajeeb Ending Tha…,\n" +
                        "Maine Propose Kia Sms Se,\n" +
                        "Kambakth Wo Uski Shadi Thak Pnding Tha\n" +
                        "Tumko Mila Kya !!!",

                "Jeevan mein ek baar sabhi ne kiya hai pyar,\n" +
                        "Kuchh ne darr kar kuchh ne josh mein kiya izhaar,\n" +
                        "Magar bina bole jab do dil keh jaye dil ki baat,\n" +
                        "Vahi hai nazar ka nazar se saccha ikraar.\n" ,

                "Banker tera saya tera sath nibhaunga, Tu jha " +
                        "jha jayegi mein wha wha aaunga, Saya to chod " +
                        "jata hai sath andhere mein lakin mein andhere mein tera ujala ban jaunga\n" ,


                "Deewana hun tera, mujhe inkaar nahi,\n" +
                        "Kaise keh dun ki mujhe tumse pyar nahi,\n" +
                        "Kuch shararat to teri nazro mein bhi thi,\n" +
                        "Main akela hi to iska gunehgar nahi…!!\n",

                "Love is a sweet feeling. It changes you from " +
                        "inside, even from outside. You start loving " +
                        "everything, wind, flowers, day, night," +
                        " moon, stars. So be in love forever."
        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.Pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(ProposeDayShayariQuotos.this,List);
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




