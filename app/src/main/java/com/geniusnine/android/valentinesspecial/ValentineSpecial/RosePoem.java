package com.geniusnine.android.valentinesspecial.ValentineSpecial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.geniusnine.android.valentinesspecial.R;

/**
 * Created by Dev on 07-02-2017.
 */
public class RosePoem extends AppCompatActivity {

    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rose_day_shayari_quotos);


        List = new String[] {" Rose Day\n"+
                "\n"+
                "With this rose, I reveal all my\n" +
                        "thoughts and feelings about you\n" +
                        "that I have withheld for so long.\n" +
                        "I feel when I am with you… I am like a rose,\n" +
                        "not because of it?s beauty,\n" +
                        "but because I am able to bloom and grow with you…\n" +
                        "Happy Rose Day",
                "Happy Rose Day!\n"+
                        "\n"+
                "Every bird cannot dance But peacock do it Every friend can not reach my heart but u did it.\n" +
                        "Every Flower can not express love But rose do it.\n" +
                        "“Happy Rose Day”\n" +
                        "\n" +
                        "A Single Rose for u for being in my life,\n" +
                        "Thank you so mush to complete my Life.\n" +
                        "Happy Rose Day\n" +
                        "\n" +
                        "If I have a bunch of roses\n" +
                        "I will insert a plastic rose in it\n" +
                        "And give it to you & say\n" +
                        "“Our Friendship continues til d last rose dried”.\n" +
                        "Happy Rose Day!\n",
                "Happy Rose Day!\n"+
                        "\n"+
                "Everyone likes the rose petals\n" +
                        "but not the green sepals\n" +
                        "which protects it\n" +
                        "in its budding stage,\n" +
                        "similarly everyone loves the beautiful faces\n" +
                        "but not those who spend life in making others beautiful. Happy Rose Day !\n" +
                        "Any 1 can love a Rose.\n" +
                        "But no 1 will love a leaf that.\n" +
                        "made the Rose.\n" +
                        "dont love some one who is beautiful\n" +
                        "but love the one who can make ur life beatiful.\n" +
                        "Happy Rose Day\n",
                "Happy Rose Day!\n"+
                        "\n"+
                "Bunch of rose I am sending you\n" +
                        "Yellow to show our happiness\n" +
                        "White to show our purity\n" +
                        "Black to show our darkest secrets\n" +
                        "And red to show our love\n" +
                        "There Is Something About\n" +
                        "U, The Way U Walk, The Way\n" +
                        "U Talk, The Way U Smile,\n" +
                        "And The Way U Look At\n" +
                        "Me, Makes Me Crazy\n" +
                        "Every-time. Happy Rose Day.",
                "Sweet Rose Day!\n"+
                        "\n"+
                "Sweet as A Rose Bud, \n" +
                        "Bright as A Star\n" +
                        "Cute as a Kitten, \n" +
                        "That’s What U Are. \n" +
                        "\n" +
                        "Bundles of Joy Sunshine,\n" +
                        "And Fun You Are Everything,\n" +
                        "I Love All Rolled Into a Happy Rose Day\n",

                "Happy Rose Day!\n"+
                        "\n"+

                "In the Flower, My Rose is U.\n" +
                        "In the Diamond, My Kohinoor is U.\n" +
                        "In the Sky, My Moon is U.\n" +
                        "I’m only Body, My Heart is U.\n" +
                        "That’s Y i always Miss You !!",
                "\n" +
                        "Any 1 can love a Rose.\n"+
                        "\n"+
                        "Any 1 can love a Rose.\n" +
                        "But no 1 will love a leaf that.\n" +
                        "made the Rose.\n" +
                        "dont love some one who is beautiful\n" +
                        "but love the one who can make ur life beatiful.\n" +
                        "Happy Rose Day",

                "Happy Rose Day!\n"+
                        "\n"+
                "I ask God for a rose\n" +
                        "n\n" +
                        "he gave me flowers;\n" +
                        "I ask God for water\n" +
                        "n\n" +
                        "he gave me an ocean;\n" +
                        "I ask God for an angel\n" +
                        "n\n" +
                        "he gave me the best love ever!\n",

                "Happy Rose Day!\n"+
                        "\n"+

                "Rose, Rose\n" +
                        "Love you, without words.\n" +
                        "When I touch your waist,\n" +
                        "Close to your lips.\n" +
                        "\n" +
                        "Rose, Rose\n" +
                        "Kisses are what you send to me.\n" +
                        "Endless mythical dream\n" +
                        "Every kiss seems to be\n" +
                        "\n" +
                        "Rose, rose\n" +
                        "Aren’t you the waves of the red wine\n" +
                        "Of the first night in a wedding?\n" +
                        "In your soft heart\n" +
                        "slipped the lovers’ laughs and tears.\n" +
                        "\n" +
                        "Love you, Rose\n" +
                        "Light vortex, pink whorls\n" +
                        "full of a garden I wish to plant Roses\n" +
                        "Even waking to be a sad nightmare\n" +
                        "Still I will hold you.\n" +
                        "O, Rose, my dear Rose",
                "Kissed by a rose\n" +
                        "\n"+
                        "With all the thorns\n" +
                        "My eyes become large\n" +
                        "And I can see a glow\n" +
                        "I see you\n" +
                        "Standing there by your grave\n" +
                        "I walk slowly over to it\n" +
                        "I kiss the rose\n" +
                        "One more time\n" +
                        "But my lips are cut\n" +
                        "So my blood drips onto the rose\n" +
                        "I plant the rose\n" +
                        "On top of your grave\n" +
                        "It blooms with red roses\n" +
                        "Little droplets of blood\n" +
                        "Dripping from the leaves\n" +
                        "The light that you shine\n" +
                        "Can be seen\n" +
                        "You walk to the roses\n" +
                        "And your light\n" +
                        "Hits the blooms just right\n" +
                        "I lay down on your grave\n" +
                        "My power\n" +
                        "My pleasure\n" +
                        "My pain\n" +
                        "I feel all of it\n" +
                        "At the same time\n" +
                        "Ive been kissed by a rose\n" +
                        "On a grave",
                "Prayer\n"+
                        "\n"+
                "Prayer is worth more than a rose\n" +
                        "in my hand where love grows\n" +
                        "for God and all he knows\n" +
                        "The rose has a thorn\n" +
                        "which Jesus felt on the crown he had worn.\n" +
                        "the rose is red as the blood from his head\n" +
                        "when he was crucifed before we were born.",

                "Happy Rose Day!\n"+
                        "\n"+
                "We have spent our live searching for the one\n" +
                        "Talking to each other about the people we are with \n" +
                        "and what we wanted in a relationship\n" +
                        "For little did we know they were right\n" +
                        "Under our nose\n" +
                        "\n" +
                        "We wanted someone to be there for us, understand us,\n" +
                        "and most of all love us\n" +
                        "As much as we love them and along the way\n" +
                        "We fell in love with each other\n" +
                        "\n" +
                        "Deeper and deeper everyday being blind to it\n" +
                        "Until one day we realized\n" +
                        "We couldn’t live without each other\n" +
                        "You are my best friend, companion and sole mate\n" +
                        "Thank you for choosing me",
                "Sun strong love A look from you is as blinding as the sun, \n" +
                        "As stunning as your eyes I lose myself in. \n" +
                        "A look from you is as pure as the clear blue sky, \n" +
                        "When I'm with you.\n" +
                        "\n" +
                        "Every minute I'm not around you, \n" +
                        "I feel like I left something behind. \n" +
                        "Every time I'm not looking at you, \n" +
                        "I feel like I am blind.",
                "Sweet love you and me Put your hand in mine now and forever \n" +
                        "Darling, here I stand, stand before you \n" +
                        "Deep inside I always knew \n" +
                        "It was you, you and me \n" +
                        "Two hearts drawn together bound by destiny \n" +
                        "Every road leads to your door \n" +
                        "Every step I take forever more ... \n" +
                        "Oh, sweet love.\n" +
                        "\n" +
                        "I never had a thing to prove \n" +
                        "Till there was you. \n" +
                        "My heart lost all control \n" +
                        "Now you're all that I know \n" +
                        "You and me.",
                "I sit here thinking about you,\n" +
                        "I can’t get you off my mind\n" +
                        "I search and search and its you I find.\n" +
                        "I have never felt this way before\n" +
                        "But I realize it’s you I want to adore.\n" +
                        "Again sitting here thinking of you \n" +
                        "I am not sure it’s love but, it feels\n" +
                        "like the next best thing.\n" +
                        "People might think I am crazy, \n" +
                        "but I don’t care.\n" +
                        "I am willing to take a dare \n" +
                        "Everything happens for a reason \n" +
                        "and that’s why \n" +
                        "I am thinking of you.",
                "I love you I never really know how you feel \n" +
                        "I can't read your mind \n" +
                        "I just keep waiting ...\n" +
                        "\n" +
                        "Take me to your heart \n" +
                        "Show me where to start \n" +
                        "Let me play the part of your first love.\n" +
                        "\n" +
                        "Oh, I know down deep you love me \n" +
                        "But are you ever gonna love me \n" +
                        "The way I love you?\n",
                "Shy love As far as the ocean is wide \n" +
                        "through miles and miles of sea; \n" +
                        "You will be someone special \n" +
                        "a true miracle to me.\n" +
                        "\n" +
                        "As high upon the mountain tops \n" +
                        "as high as one can climb; \n" +
                        "You will be so dear to me \n" +
                        "the best friend I can find.\n" +
                        "\n" +
                        "As many stars that twinkle \n" +
                        "throughout the heavens above; \n" +
                        "You will be a a bright reminder \n" +
                        "of what it means to love.\n",
                "one name makes me blush\n" +
                        "one smile dries my tears away\n" +
                        "one touch brings a chill through my spine\n" +
                        "one footstep increases my heart beats\n" +
                        "one presence makes me nervous\n" +
                        "one voice seems to be an angelic tune of care and concern\n" +
                        "one question troubles me all the time\n" +
                        "can you be mine??",
                "YOU!!!!\n" +
                        "\n" +
                        "Like a star you came into my life\n" +
                        "You filled my heart with joy\n" +
                        "You took my pain as if it was yours\n" +
                        "You provided me with love that no one could give me\n" +
                        "You gave me a shoulder to cry on\n" +
                        "You were my pillar when I was falling\n" +
                        "You were my strength when I was weak\n" +
                        "With your smile you made my living on earth worthwhile\n" +
                        "With the soft words you whispered in my ear\n" +
                        "Made me realize that I was in Love indeed\n" +
                        "Without you next to me my life is meaningless\n" +
                        "Every day I sit and pray that you will remain as sweet as you are\n" +
                        "And that is why I will always Love you as long as you let me ",
                "You're my man, my mighty king,\n" +
                        "And I'm the jewel in your crown,\n" +
                        "You're the sun so hot and bright,\n" +
                        "I'm your light-rays shining down,\n" +
                        "\n" +
                        "You're the sky so vast and blue,\n" +
                        "And I'm the white clouds in your chest,\n" +
                        "I'm a river clean and pure,\n" +
                        "Who in your ocean finds her rest,\n" +
                        "\n" +
                        "You're the mountain huge and high,\n" +
                        "I'm the valley green and wide,\n" +
                        "You're the body firm and strong,\n" +
                        "And I'm a rib bone on your side,\n" +
                        "\n" +
                        "You're an eagle flying high,\n" +
                        "I'm your feathers light and brown,\n" +
                        "You're my man, my king of kings,\n" +
                        "And I'm the jewel in your crown."


        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.Pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(RosePoem.this,List);
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

