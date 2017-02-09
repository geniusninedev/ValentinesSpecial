package com.geniusnine.android.valentinesspecial.ProposeDay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.geniusnine.android.valentinesspecial.R;

/**
 * Created by Dev on 07-02-2017.
 */
public class ProposeDayWishes extends AppCompatActivity {
    ListView listView;
    TextView textViewRose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propose_day_status);


        listView=(ListView)findViewById(R.id.listViewRoseDay);
        textViewRose=(TextView)findViewById(R.id.textViewRose);
        String[] values = new String[] {

                      "Paani Sey “Tasvir” Kha Banti Hei,Khawabon Sey “Takdir” Kha Banti Hei,Kisi Ko Chaho Tho Sachey Dil Sey,Kyunki Yeh “Zindagi” Phir Kha Milti Hei. Happy Propose Day 2017!\n" ,
                      "Aapka rishta mere suron ka saaz hai, Aap jaise apno par hamein naaz hai, Chahe kuch bhi ho jaaye zindagi mein, Ye rishta kal bhi waisa rahega jaisa aaj hai. Happy Propose Day 2017!\n" ,
                      "Ager Zindagi mai judai na hoti,To kabhi kisi ki yaad aai na hoti Sath hi guzarta her lamha to shayaed,Rishton mai yeh gehrai na hoti. Happy Propose Day 2017.\n" ,
                      "Sabke Chehre Mei Woh Baat Nahi Hoti, Sabke chehre mei woh baat nahi hoti, Thode se andhere mei raat nahi hoti, Zindagi mei kuch log bahut pyare hote hai, Kya kare unhi se aaj kal mulakat nahi hoti.\n" ,
                      "Gham Mein Hasne Walon Ko Rulaya Nahi Jata,Lehron Se Pani Ko Hataya Nahi Jata,Honay Wale Ho Jate Hain Khud He Apne Kisi Ko Keh Kar Apna Banaya Nahi Jata. Happy Propose Day 2017!\n" ,
                      "Saanson se pyari yaadaen hain tmhari,Dhadkan se pyari baatein hai tmhari,Tumhe yekin na ho,Is zindagi se pyari, dosti hai tumari.\n" ,
                      "Aankhon Se Ansoo Yoonhi Behte Nahi,Apna Kisi Aur Ko Hum Kehte Nahin,Samaa Gaye Ho Meri Zindagi Mein Bas Tum Hi Majboor Kiya Hai Dil Ne Varna Hum Kuchh Kehte Nahin! Will U Be My Girlfriend?\n" ,
                      "Kaash Aapki Surat Itni Pyaari Na Hoti,Kaash Aapse Mulakat Hamaari Na Hoti,Sapno Mein Hi Dekh Lete Hum Aapko, To Aaj Milni Ki Itni Bekarari Na Hoti. Happy Propose Day 2017!\n" ,
                      "Shikava hame manjur nahi na koi bahana hoga , hamari khushio ki kasam aap ko aana hoga!\n" ,
                      "Ham Apne Pyaar Ka Izhaar Isliye Nahi Karte Hain,Kyunki Ham Unki Han Ya Na Se Darte Hain,Agar Unhone Kar Di Han To Ham Khushi Se Mar Jayenge,Aur Agar Unhone Kar Di Na To Ro Ro Ke Mar Jayenge!!!\n" ,
                      "Palakon main bithaya,Sonso main samaya,Dil main basaya Gulab se sajaya,Phir bhi sirf saat janmo ke liya paya!\n" ,
                      "Unhe chahana hamari kamzori hai, Unse keh na pana hamari majboori hai, Wo kyun nahi samajhtey hamari khamoshi ko, Kya pyar ka izhaar karna zaruri hai!\n" ,
                      "On this special day ,Best wishes go to you, That this wonderful love you, Share lasts ur lifetime through.Happy Purpose Day 2017\n" ,

                      "I would like to live with you“If I Have Only 1 Wish To Be Fulfill…\n" +
                      "I Would Like To Live With You My Chill……\n" +
                      "Come Sunshine Or Showers…\n" +
                      "Come Good Time Or Bad….\n" +
                      "I Will Always Be There To Cheer You Up…\n" +
                      "Or Just To Hold Your Hand And Say…\n" +
                      "I Know How You Feel And I Care….”\n" ,

                      "Will You Say YesOn This Propose Day.\n" +
                      "Will You Say Yes?\n" +
                      "We Can Invite Lots Of Family And Guests.\n" +
                      "I Do Not Believe Anyone Will Protest\n" +
                      "Our Love And Affection Is Genuinely True\n" +
                      "Let Us Both Say I Do.\n" +
                      "Happy propose day. 2017\n" ,

                      "I Think Of YouOn Propose Day..\n" +
                      "I Think Of You..\n" +
                      "The Smile That You Bring To My Face..\n" +
                      "The Laughter And Joy When We Are Together..\n" +
                      "You Are The Missing Puzzle Piece In My Life..\n" +
                      "Will You Spend It With Me Forever?\n" +
                      "Happy Propose Day 2017!",


                "I Always Lose Control When  You By My Side, U Have Become  The Light Of My Life. I Always  Enjoy The Time I Spend With  You, I Think I’m Falling In Love  With You.\n" ,
                        "The say that Love is something that is all inclusive and is an inclination that is not bound by spatial limits, be it dialect or topography. Happy Propose Day 2017!\n" ,
                        "The First Time I Saw You, I Noticed My Heart Beat Faster & The Situation Is Same For Now Maybe I’m In Love With You Happy Propose Day 2017\n" ,
                        "I still remember the moment.. when for the first time our eyes met..and I felt butterflies in my stomach…since then my heart longs…to be with you always. Be Mine Forever\n" ,
                        "U are unique U are caring, and U are the Best.And I am d luckiest to have U in my life! Happy Propose Day 2017 my sweetheart…!\n" ,
                        "Word Have Not Enough Strength To Express My Love Towards You. My Eyes Are Enough To Express It! Happy Propose Day 2017 Dear!\n" ,
                        "My Eyes Are Eager To See You, My Ears Are Eager To Listen to You, My Lips Are Eager To Kiss You, and My Dreams In Night Are Eager To Welcome You Happy Propose Day 2017\n" ,
                        "Love comes again and again for those who know what life is love comes only once for those who know what Love Is. Happy Rose Day 2017\n" ,
                        "All I wanted was someone to care four me, All I wanted was someone who’d b there 4for me, All I ever wanted was someone who’d b true, All I ever wanted was someone like U… Happy Propose Day 2017\n" ,
                        "The sweetest way to propose, Excuse me, do you have a band-aid, because I scraped my knee when I fell in love with you Will you be mine… Happy Propose Day 2017!!\n" ,
                        "Happy Propose Day!. I Think About You All The Time.. Will You Be Forever Mine? I Must Say I Adore You. I Can Not Live My Life Without You. It Would Be Long And Dreary Happy Propose Day 2017."

        };

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.activity_rose_day_shayari,R.id.textViewRose, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ProposeDayWishes.this,ProposeDayWishesDisplay.class);
                i.putExtra("key", position);
                startActivity(i);


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
