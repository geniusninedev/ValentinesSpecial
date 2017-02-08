package com.geniusnine.android.valentinesspecial.ChocolateDay;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.geniusnine.android.valentinesspecial.R;

public class ChocolatePoemsDisplay extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter adapter;
    String[] brainpuz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolate_poems_display);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        brainpuz = new String[]{"Chocolate Day\n" +
                "\n" +
                "when chocolate day come\n" +
                "on every 9th February\n" +
                "i remember, how she refuted\n" +
                "my chocolate gift\n" +
                "though she always passed all her sweets\n" +
                "sitting side by me, as a good boy i used to take\n" +
                "was it my ignorance or plain heartiness\n" +
                "but i truly say, i had no intention\n" +
                "except to share chocolate sitting by me\n" +
                "but i took an oath\n" +
                "not to offer any chocolate\n" +
                "especially to heart breaker\n" +
                "as known to the world wide\n" +
                "i experienced\n" +
                "the earth sliding from my feet\n" +
                "at her one rebuke ",

                "Today's Day - Chocolate Day\n" +
                        "\n" +
                        "Today Day Is The Chocolate Day\n" +
                        "Dairymilk For Love\n" +
                        "Kitkat For Special\n" +
                        "Bounty For Cool\n" +
                        "Mars For Best Friend .\n" +
                        "Sonat 4 Cute Hug\n" +
                        "Galaxy 4 Sweet Kiss\n" +
                        "What Will You Give Me?\n",

                "Chocolate For Love \n" +
                        "\n" +
                        "\n" +
                        "From the cocoa of Ghana\n" +
                        "With the sugar from Cuba\n" +
                        "Comes the sweet paste for the world\n" +
                        "To build love for all\n" +
                        "For our children \n" +
                        "To share the sweetness from heaven\n" +
                        "For the depressed\n" +
                        "To loosen up on their stress\n" +
                        "The best gifts for valentine\n" +
                        "Till Christmas time\n" +
                        "For the rich and poor alike\n" +
                        "To brighten up their life\n" +
                        "Also mixed with tarts\n" +
                        "For a good-day start\n" +
                        "Chocolate, chocolate, sweet chocolate\n" +
                        "Dont ever forget them for any date\n" +
                        "Always present them \n" +
                        "When playing the love game \n",

                "Chocolate \n" +
                        "\n" +
                        "Chocolate, chocolate, chocolate chocolate chocolate! \n" +
                        "When you take a bite, you will taste its delight, \n" +
                        "chocolate, chocolate, chocolate chocolate chocolate, \n" +
                        "it is so nice, sometimes covered in rice! \n" +
                        "\n" +
                        "Chocolate, chocolate, chocolate chocolate chocolate! \n" +
                        "It will make you scream, and sometimes will be covered in cream! \n" +
                        "Chocolate, chocolate, chocolate chocolate chocolate, \n" +
                        "when you take a nibble the side, it will take you on a fantastic ride! \n" +
                        "\n" +
                        "Chocolate, chocolate, chocolate chocolate chocolate! \n" +
                        "It will make you jump with joy, it will make you act so coy! \n" +
                        "chocolate, chocolate, chocolate chocolate chocolate, \n" +
                        "Pay for the choclate with every last penny, and buy so many and many! ",

                "A Chocolate Valentine\n" +
                        "\n" +
                        "\n" +
                        "To you this box of Chocolate\n" +
                        "\n" +
                        "To you I be sincere,\n" +
                        "As to one I hold so close to me,\n" +
                        "As this valentine day appears.\n" +
                        "\n" +
                        "Please accept this card and box\n" +
                        "Of chocolate as I call a valentine,\n" +
                        "Although a metaphor I be sincere.\n" +
                        "\n" +
                        "For anonymonously I have no other\n" +
                        "motives other than declare my love for\n" +
                        "you\n",

                "Do not touch my chocolate covered nuts\n" +
                        "\n" +
                        "Some think love and romance are sublime\n" +
                        "Others feel they're a big waste of time\n" +
                        "Both views maybe so\n" +
                        "But there's one thing I know\n" +
                        "Candy prices are surely a crime!\n" +
                        "\n" +
                        "\n" +
                        "I'll buy her candies and flowers and charms\n" +
                        "When we kiss I'll hear bells and alarms\n" +
                        "But one thing can't compare\n" +
                        "Is when I'm standing there\n" +
                        "Silently holding her close in my arms!",

                "Dark Chocolate\n" +
                        "\n" +
                        "\n" +
                        "Wrapped in shinny wrappers, \n" +
                        "golden, red, silver and brown, \n" +
                        "chocolate, the king of sweets, \n" +
                        "everyone's favorite treat, \n" +
                        "dropp it in your mouth, \n" +
                        "it slips and melts, \n" +
                        "bitter sweet with nuts, \n" +
                        "lover's gift, chocolate kiss! \n" +
                        "\n" +
                        "Born in West Africa\n" +
                        "bred by little hands, \n" +
                        "little feet walked three days, \n" +
                        "on stale porridge and water, \n" +
                        "sweets they have heard not, \n" +
                        "schools they know not, \n" +
                        "only cocoa farms.\n" +
                        "\n" +
                        "With machetes in their hands, \n" +
                        "they chop the pods, \n" +
                        "often, when they swing too high, \n" +
                        "they strike their leg, \n" +
                        "often when they swing too low, \n" +
                        "they, strike their hand, \n" +
                        "hospitals they have none, \n" +
                        "muddy clothes they tear\n" +
                        "and tie the bleeding wounds, \n" +
                        "continue to collect the beans, \n" +
                        "for a child in the city\n" +
                        "might be throwing a tantrum, \n" +
                        "for his favorite sweet.\n" +
                        "\n" +
                        "Hungry hearts, candy bars, \n" +
                        "snakes bites, valentine's gift, \n" +
                        "gift of blood, spraying pesticides, \n" +
                        "dark, white and milk, pleasure trip, \n" +
                        "horror, blood and tears, cartoon strip, \n" +
                        "Easter egg, child labor, dark treats.\n" +
                        "\n" +
                        "When the men in uniform they arrive, \n" +
                        "the children hide the machete, \n" +
                        "and pretend to play, how can they\n" +
                        "for they know no games.\n" +
                        "\n" +
                        "The cocoa bean from black, muddy\n" +
                        "bleeding hands sit on the shelves \n" +
                        "of the finest stores where tiny\n" +
                        "soft pink hands pick them up\n" +
                        "From hand to hand the chocolate\n" +
                        "travels, sinned on the way\n" +
                        "bitter sweet, the chocolate's way.",

                "A Chocolate Kiss\n" +
                        "\n" +
                        "\n" +
                        "A pair of liquorish lips \n" +
                        "Coated in dark chocolate\n" +
                        "Gushing with flavor\n" +
                        "Waiting to be tasted\n" +
                        "To melt in to a dark fantasy\n" +
                        "To bequeath a lingering taste\n" +
                        "Of an enchanting kiss ",

                "I love you my love mate\n" +
                        "\n" +
                        "My dear love mate,\n" +
                        "\n" +
                        "Whether you are not by my side,\n" +
                        "I always feel your presence.I want\n" +
                        "a cute,long relationship where \n" +
                        "everyone is like \"damn, they're \n" +
                        "still together.I love you from the \n" +
                        "bottom of my heart & will love\n" +
                        "you forever.\n" +
                        "\n" +
                        "You touched my soul and shake my heart.\n" +
                        "\n" +
                        "My soul mate you are the beat of my \n" +
                        "heart and lover of my soul.I will never \n" +
                        "ever leave you.My eyes knows that I am \n" +
                        "a perfect match for you darling.Beauty \n" +
                        "around us doesn't make love but love \n" +
                        "makes beauty.My heart for you will never \n" +
                        "break.My love,my smile for you will never \n" +
                        "fade.Come to me & touch my heart and you \n" +
                        "will feel,listen to my heart and you will \n" +
                        "hear the heart beats for you only.\n" +
                        "\n" +
                        "On this romantic chocolate day I want you \n" +
                        "to be there by my side.You have the power \n" +
                        "to make my life much more beautiful with \n" +
                        "your presence in it.I love your blushing \n" +
                        "smile.I have some beautiful gifts for you,\n" +
                        "upmost of them is my love for you.\n" +
                        "\n" +
                        "With love",

                "The day I will express my love to you\n" +
                        "\n" +
                        "My dear chocolate love,\n" +
                        "\n" +
                        "Your love is like a passion.What can I say\n" +
                        " about you & your love,it's everything for\n" +
                        " me.You are the chocolate boy of my reverie.\n" +
                        "Your love is like chocolate,So silky & smooth.\n" +
                        "Whether you lay aside on me.I still love you.\n" +
                        "I feel hesitate to express my love towards you,\n" +
                        "just beacuse of thinking in my mind what \n" +
                        "you will feel for me?\n" +
                        "\n" +
                        "All the time thinking & imagine that today \n" +
                        "I will express my love to you,tomorrow definitely \n" +
                        "I will express it to you but the each time i \n" +
                        "found you in front of me,it make me blench.\n" +
                        "Sometimes your nearess takes my breath away & \n" +
                        "all the things I want to say can find no voice.\n" +
                        "Then in silence,I can only hope my eyes will \n" +
                        "speak my heart.\n" +
                        "\n" +
                        "I know that the time we will meet our hearts \n" +
                        "will be refreshed,and I think it will restore \n" +
                        "both your sanity and mine\n" +
                        "to be outside for a time in the fresh and \n" +
                        "unpolluted air.I love you my sweet love....\n" +
                        "\n" +
                        "Yours lovingly\n",
                "My chocolate angel\n" +
                        "\n" +
                        "My love, \n" +
                        "\n" +
                        "Like I say so many times, you're my angel, sent \n" +
                        "from heaven above to be my one and only. Your \n" +
                        "touch can excite me. When we are together, I \n" +
                        "wonder if you're really there, or did I just \n" +
                        "had a sweet dream.I love thee to the depth and \n" +
                        "breadth and height my soul can reach.  I love you, \n" +
                        "not only for what you are, But for what \n" +
                        "I am when I am with you.\n" +
                        "\n" +
                        "I wished for nothing more than your smile,and \n" +
                        "to walk with you,hand in hand,along a sun-warmed,\n" +
                        "flower-bordered path.What I feel for you seems \n" +
                        "less of earth and more of a cloudless heaven.\n" +
                        "We are two souls with but a single thought,Two \n" +
                        "hearts that beat as one.Love is like the god's \n" +
                        "presence on this earth,so i do feel the same for you.\n" +
                        "\n" +
                        "There's this place in me where your fingerprints \n" +
                        "still rest,your kisses still linger and your \n" +
                        "whispers softly echo.It's the place where a part \n" +
                        "of you will forever be a part of me. Love is the \n" +
                        "enchanted dawn of every heart.You are my dawn.It \n" +
                        "is only with the heart that one can see rightly; \n" +
                        "what is essential is invisible to the eye.My heart \n" +
                        "only sees you.That's all my love for you.I love you \n" +
                        "like a bird loves the sky.I love you & love you more.\n" +
                        "\n" +
                        "With all my love",
                "My Chocolate Love\n\n" +
                        "\n" +
                        "I prefer the sweet thing !!\n" +
                        "with some pink inside ??\n" +
                        "white or brown ??\n" +
                        "Its called \"CHOCOLATE LOVE\"\n" +
                        "\n" +
                        "for the sweet ones ,\n" +
                        "with love inside !\n" +
                        "a heart with love <3\n" +
                        "and some pink inside !\n" +
                        "\n" +
                        "a delightful sweet ,\n" +
                        "white with pink ,\n" +
                        "brown with love !\n" +
                        "Its called \"CHOCOLATE LOVE\"\n" +
                        "\n" +
                        "melting with sugar ,\n" +
                        "and some cocoa ,\n" +
                        "and the pink ??\n" +
                        "its pure pink delight !!\n" +
                        "\n" +
                        "And its all called 'CHOCOLATE LOVE ' !\n" +
                        "(leave some for me too ) !! :p\n",

                "All I Really Need Is Love,\n\n" +
                        "\n" +
                        "But A Little Chocolate Now And Then Doesn’t Hurt!\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "A Day Without Chocolate Is A Day Without Sunshine.\n" +
                        "\n" +
                        "Life Without Chocolate Is Like A Beach Without Water.\n" +
                        "\n" +
                        "Same Thing Like The Chocolates, My Life Would Suck Without You !!!\n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "Once We Hit Forty, Women Only Have About Four Taste Buds Left:\n" +
                        "\n" +
                        "One For Vodka, One For Wine, One For Cheese, And One For Chocolate.",

                "Love Is Like A Chewing Gum,\n\n" +
                        "\n" +
                        "It Tastes Only In The Beginning!\n" +
                        "\n" +
                        "But Friendship Is Like Chocolate,\n" +
                        "\n" +
                        "It Tastes Till It Ends!\n" +
                        "\n" +
                        "Chocolate Day 2017",

                "My dearest love,\n\n" +
                        "\n" +
                        "If you believe in valentine day,\n" +
                        "\n" +
                        "You must believe in valentine week,\n" +
                        "\n" +
                        "If you believe in life,\n" +
                        "\n" +
                        "You must believe in heart beats,\n" +
                        "\n" +
                        "If you believe in love,\n" +
                        "\n" +
                        "You must believe in you and me.\n" +
                        "\n" +
                        "Happy chocolate day……",

                "Your hand and your mouth\n\n"+
                "Your hand and your mouth agreed many years " +
                        "ago that, as far as chocolate is concerned, " +
                        "there is no need to involve your brain.”" +
                        " Happy Chocolate Day!\n" +
                        "\n" +
                        "“When I have bad days, I just eat lots of " +
                        "chocolate ice cream and dance to the ‘Lion King’ " +
                        "soundtrack. It’s really odd, but it’s true.”" +
                        " Happy Chocolate Day!\n" +
                        "\n" +
                        "“The greatest tragedies were written by the " +
                        "Greeks and Shakespeare neither knew chocolate.” " +
                        "Happy Chocolate Day!”Money can’t buy happiness." +
                        " But, it can buy a chocolate, which is pretty much " +
                        "the same thing.” Happy Chocolate Day!"
        };
// Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(ChocolatePoemsDisplay.this,brainpuz);
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


