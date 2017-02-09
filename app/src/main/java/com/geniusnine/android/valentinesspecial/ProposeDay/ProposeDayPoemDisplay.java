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
 * Created by Supriya on 08-02-2017.
 */

public class ProposeDayPoemDisplay extends AppCompatActivity {
    String[] List;

    ViewPager viewPager;
    PagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rose_day_shayari_quotos);


        List = new String[] {
                "The Proposal\n" +
                        "\n" +
                        "The sun was shining brightly \n" +
                        "As we drove around his land\n" +
                        "And showing me his kingdom \n" +
                        "First, before he asked my hand\n" +
                        "\n" +
                        "We stopped for cake and coffee \n" +
                        "It was almost half past two\n" +
                        "And that tall man was shaking\n" +
                        "When he told me I love you\n" +
                        "\n" +
                        "He gently bent to kiss me \n" +
                        "His lips began shaking fast\n" +
                        "I thought this was the moment\n" +
                        "That he would ask me at last \n" +
                        "\n" +
                        "We climbed inside his Audi\n" +
                        "Driving slowly to his farm\n" +
                        "I thought this was the moment\n" +
                        "When he gently touched my arm\n" +
                        "\n" +
                        "But no, he was just helping \n" +
                        "Me kindly into the house \n" +
                        "We both walk in together \n" +
                        "Was he playing cat and mouse\n" +
                        "\n" +
                        "At six o’clock he brought me \n" +
                        "Out to watch him milk the cows \n" +
                        "And sitting on the stone fence \n" +
                        "I watched as he fed the sows\n" +
                        "\n" +
                        "I never thought he’d ask me\n" +
                        "As I sat perched on my thrown \n" +
                        "Then came, will you marry me\n" +
                        "And his farm became my home \n" +
                        "\n" +
                        "I know that’s not romantic \n" +
                        "In this land of poetry \n" +
                        "But standing in the manure \n" +
                        "Was better than bended knee\n" ,

                        "WEDDING PROPOSAL OF A SPOON\n" +
                        "\n" +
                        "The knives and plate were always between us\n" +
                        "With your sister, you were hanging out\n" +
                        "With those two handsome knives\n" +
                        "At all breakfast, lunch and dinner times\n" +
                        "But when you were in the dishwasher\n" +
                        "The playboy knife cheated on you\n" +
                        "On the dessert plates\n" +
                        "Tons of times\n" +
                        "Please don’t let him to deceive you\n" +
                        "I am the one who will always love you\n" ,

                        "An Unexpected proposal\n" +
                        "\n" +
                        "Once my friend liked someone\n" +
                        "The girl who was different from everyone\n" +
                        "You couldn’t compare her with anyone\n" +
                        "I knew for him, she was the one\n" +
                        "It took him two months to be her friend\n" +
                        "In his life, there was a bend\n" +
                        "He told me, without her\n" +
                        "His life was totally blur\n" +
                        "She was like a princess\n" +
                        "He was like her waitress\n" +
                        "(Sorry for respecting him less\n" +
                        "As I couldn’t find any word else \n" +
                        "Rhyming with princess)\n" +
                        "After a month, I told him to decide\n" +
                        "Either propose her \n" +
                        "Or see yourself as a los-er\n" +
                        "Show her that you are not a toy\n" +
                        "But a brave and courageous boy\n" +
                        "After a day or two\n" +
                        "He got some confidence\n" +
                        "But running in sudden excitement\n" +
                        "He lost his eye lens\n" +
                        "He started crying and cursed his fate\n" +
                        "I told him that by doing this\n" +
                        "You can’t expect to find a date\n" +
                        "But suddenly we saw someone and were surprised\n" +
                        "She was a beautiful girl, blue eyed\n" +
                        "She was the one whom my friend liked\n" +
                        "She came to us, but I told her to wait\n" +
                        "She never listened anything and asked me for a date\n" +
                        "At that time, my friend gave me those killing looks\n" +
                        "He was burning with anger like when a sizzler cooks\n" +
                        "His thinking was typical\n" +
                        "He saw me as a criminal\n" +
                        "Then I went back to flashback\n" +
                        "And saw my life dull\n" +
                        "I named this in my memory\n" +
                        "As an unexpected proposal.\n" ,

                        "Happy Propose Day\n" +
                        "\n" +
                        "Happy Propose Day 2u\n" +
                        "All I wanted was some-1,\n" +
                        "to care for me,\n" +
                        "All I wanted was some-1,\n" +
                        "who’d b there for me,\n" +
                        "All I wanted was some-1,\n" +
                        "who would be true,\n" +
                        "All I wanted was some-1,\n" +
                        "like you..\n" +
                        "Love You so Much..\n" +
                        "Happy Propose day 2017\n" ,

                        "On Bended Knee\n" +
                        "\n" +
                        "I love you to the highest degree\n" +
                        "My feelings as deep as the deepest sea\n" +
                        "My love would last a lifetime, I guarantee\n" +
                        "A happy future together, I see\n" +
                        "Now, if only you would heed my plea\n" +
                        "When I go on a bended knee\n" +
                        "Hoping that my wife you will be\n" +
                        "When I ask “Will you marry me?”\n" ,

                        "True Love\n" +
                        "I know I will always love you\n" +
                        "And there won’t be another like you do\n" +
                        "I want to spend my whole life through\n" +
                        "With you beside me till old we grew\n" +
                        "Years will pass us by, decades too\n" +
                        "But my love for you will always stay true\n" +
                        "I don’t know whether you would want to\n" +
                        "But I’ll ask anyway, “Marry me, will you?”\n" ,

                        "Arms Fully Open\n" +
                        "Clock's ticking slowly, \n" +
                        "With minutes floating away.\n" +
                        "Minutes to hours. Hours to days. \n" +
                        "Day after day,\n" +
                        "I hope and I pray, \n" +
                        "For this moment to stay.\n" +
                        "Stay now. Stay forever. \n" +
                        "Stay constant this way.\n" +
                        "A beautiful lady \n" +
                        "I have right beside me.\n" +
                        "Grasping hands so softly. \n" +
                        "Perfect life, living calmly.\n" +
                        "I step to the future. \n" +
                        "Her step comes to follow.\n" +
                        "The clock keeps on ticking- \n" +
                        "A better tomorrow.\n" +
                        "A sky comes to hover. \n" +
                        "She falls from above.\n" +
                        "With arms fully open, \n" +
                        "I catch my true love.\n" ,

                        "I Want To Be...\n" +
                        "I want to be your favorite hello,\n" +
                        "And I want to be your hardest goodbye.\n" +
                        "I want to be the one who never makes you cry,\n" +
                        "The one who puts that sparkle in your eye.\n" +
                        "\n" +
                        "I want to be the one you trust,\n" +
                        "And I want to be the one you can tell all your secrets to.\n" +
                        "I want to be the one always by your side,\n" +
                        "The one you're stuck to like glue.\n" +
                        "\n" +
                        "I want to be the one who makes you happy,\n" +
                        "And I want to be the one who makes you smile.\n" +
                        "I want to be the one waiting for you as you're walking down the aisle,\n" +
                        "The one to whom you'd say, \"For you I'd walk a thousand miles.\"\n" +
                        "\n" +
                        "I want to be the one you truly love,\n" +
                        "And I want to be the one who fills your heart.\n" +
                        "I want to be the one who's always there to hold you in the dark,\n" +
                        "The one who loved you from the very start.\n" ,

                        "She Doesn't Know I Love Her\n" +
                        "\n" +
                        "\n" +
                        "When did my feelings get so deep\n" +
                        "Why did they take that big long leap\n" +
                        "Going from friend to crush \n" +
                        "What a rush\n" +
                        "And I don't think she knows\n" +
                        "\n" +
                        "Since when did her smile make me go weak\n" +
                        "Since when did her tears make mine start to leak\n" +
                        "Why does this happen when I'm always so strong\n" +
                        "When people called me Superman I guess they were wrong\n" +
                        "And I don't think she knows\n" +
                        "\n" +
                        "When she talks I can't help but watch her lips\n" +
                        "To notice their shape and curves when they dip\n" +
                        "Wait, why am I looking? I don't even know\n" +
                        "And I can't help but wonder if she even knows\n" +
                        "\n" +
                        "Her beautiful eyes are nothing like ours\n" +
                        "They're so deep and bright you'd believe they were stars\n" +
                        "They pour forth emotions in raging rivers\n" +
                        "They could make even me believe that Santa always delivers\n" +
                        "And still she has no idea\n" +
                        "\n" +
                        "Her body is perfection though she denies it\n" +
                        "It makes my head spin with every glance I give\n" +
                        "She could put any man under her spell\n" +
                        "But she doesn't know how I feel and I don't think I'll tell\n" +
                        "\n" +
                        "I love how she looks and who she is\n" +
                        "And how she makes me feel like this\n" +
                        "I love how she's beautiful and smart with a heart so strong\n" +
                        "And how she lives every day like nothing could go wrong\n" +
                        "Still she hasn't got a clue\n" +
                        "\n" +
                        "Now school is at an end on the 11th at noon\n" +
                        "I wonder if she cares that I'm moving soon\n" +
                        "We're parting that day after schools many months\n" +
                        "I just wish I could have kissed her just once\n" +
                        "\n" +
                        "Now that I've said it with my poetic skill \n" +
                        "I don't think she knew, and now she never will\n" ,

                        "My choice of love\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Honey,\n" +
                        "if love comes in colors,\n" +
                        "I choose blue,\n" +
                        "if love comes in flowers,\n" +
                        "I’ll choose rose,\n" +
                        "if love comes in songs,\n" +
                        "I’ll think of choosing blues,\n" +
                        "But if love should come in human beings,\n" +
                        "I’ll definitely not think twice before\n" +
                        "I’ll choice you!\n" +
                        "because.....You are my choice\n" ,

                        "The Day My Wishes Come True\n" +
                        "\n" +
                        "\n" +
                        "I'm still waiting for the day my wishes come true,\n" +
                        "when flower blooms in your heart.\n" +
                        "\n" +
                        "In the middle of buzzing days,\n" +
                        "with whisper I heard everyday,\n" +
                        "I find what I'm looking for,\n" +
                        "it's shining in my memories.\n" +
                        "\n" +
                        "Time flowing in solitude,\n" +
                        "the wind blows softly,\n" +
                        "and cold memories also change into laughter of happiness\n" ,

                        "Dreams\n" +
                        "\n" +
                        "\n" +
                        "Build our dreams in the shape of a heart\n" +
                        "I know our love will survive\n" +
                        "dry those tears from your sweet sapphire eyes\n" +
                        "I know our love will survive\n" +
                        "\n" +
                        "Can't stop dreaming about this love.\n" +
                        "I see heaven sent me an angel just like you\n" +
                        "can't stop dreaming about this love\n" +
                        "sometimes, baby, you make me feel alive\n" ,

                        "Everything to Me\n" +
                        "\n" +
                        "\n" +
                        "You are the light when there is no sun. \n" +
                        "You are the rainbow after the rain is done. \n" +
                        "You are the star that twinkles in the night. \n" +
                        "You are the moon that glows so bright.\n" +
                        "You are the wind that whistles my name. \n" +
                        "You are the love when the world is the same.\n" +
                        "You are the flowers the bee's never miss. \n" +
                        "You are the beach the warm sun kisses.\n" ,

                        "Forever Love\n" +
                        "\n" +
                        "\n" +
                        "Forever kiss You are my description of love \n" +
                        "You are my description of friend \n" +
                        "You are my description of everything \n" +
                        "You are my description of beginning to end.\n" +
                        "\n" +
                        "You have put me on a pedestal \n" +
                        "You make me feel ten feet tall \n" +
                        "You've always been there for me \n" +
                        "You've loved me through it all.\n" +
                        "\n" +
                        "You've stood by me through thick and thin \n" +
                        "You've always been patient and kind \n" +
                        "Just thought I'd let you know \n" +
                        "You're the owner of this heart of mine.\n" +
                        "\n" +
                        "So you ask how long I'll love you \n" +
                        "Well this is what I have to say \n" +
                        "Past, present, future, always \n" +
                        "Forever and a day! \n" ,

                        "Joy of My Heart\n" +
                        "\n" +
                        "\n" +
                        "No-one can tear us apart \n" +
                        "I love you with all of my heart \n" +
                        "More than the moon \n" +
                        "More than the stars \n" +
                        "Longing forever to be where you are \n" +
                        "Coz I love you with all of my heart.\n" +
                        "\n" +
                        "No-one can tear us apart \n" +
                        "I feel sad and blue \n" +
                        "\"Only\" dreaming of you \n" +
                        "For your love is the joy of my heart.\n" ,

                        "Giving you the key of my heart \n" +
                        "\n" +
                        "\n" +
                        "I will give you the key of my heart\n" +
                        "And when you enter\n" +
                        "Please\n" +
                        "Irrigate the veins with all your love\n" +
                        "Maintain it with your fidelity\n" +
                        "Take care of it with all the tenderness\n" +
                        "And it will be the opening\n" +
                        "To our eternal love.\n" ,

                        "Love\n" +
                        "\n" +
                        "\n" +
                        "Love is like a flower,\n" +
                        "It starts out as a seed\n" +
                        "then it starts to bloom,\n" +
                        "when the flower is done blooming \n" +
                        "it will stay firm and true for awhile\n" +
                        "then the flower will soon die,\n" +
                        "love is like a flower..\n" ,

                        "My Dear Love\n" +
                        "\n" +
                        "\n" +
                        "Dear love Through the darkness \n" +
                        "I can see your light \n" +
                        "And you will always shine \n" +
                        "And I can feel your heart in mine \n" +
                        "Your face I've memorized \n" +
                        "I idolize just you.\n" +
                        "In this cruel and lonely world \n" +
                        "I found one true love \n" +
                        "My dear love, I found you!\n" ,

                        "Our Life\n" +
                        "\n" +
                        "\n" +
                        "We've only just begun\n" +
                        "Our life together\n" +
                        "And yet as strong as it is\n" +
                        "I know it will last forever\n" +
                        "\n" +
                        "We've only just begun\n" +
                        "To see what the future holds\n" +
                        "To dream of what we can be to each other\n" +
                        "To build a life together\n" +
                        "\n" +
                        "In the end\n" +
                        "We can look back\n" +
                        "And think of all we had\n" +
                        "And be proud that we came as far as we did\n" +
                        "\n" +
                        "In the end\n" +
                        "We can look back and see all the dreams we accomplished\n" +
                        "Be happy with the life we built together\n" +
                        "And know it will last for eternity\n" ,

                        "The Power Of Love\n" +
                        "\n" +
                        "\n" +
                        "Love can change everything you have known\n" +
                        "Everything you believe with this feeling shown\n" +
                        "A heart beating faster can make two people fly\n" +
                        "Make you walk on water in the twinkle of an eye\n" +
                        "\n" +
                        "It takes control of the heart, mind, body and soul\n" +
                        "They fit that place deep inside to make you whole\n" +
                        "The elements together fire, earth, water and air\n" +
                        "Are nothing without love, in it they all share\n" +
                        "\n" +
                        "Without the one you love there is nothing it seems\n" +
                        "Together the strength can make hopes and dreams\n" +
                        "A feeling so breathtakingly gentle lifts you up above\n" +
                        "This natural passion comes with the power of love\n"
        };






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        viewPager = (ViewPager) findViewById(R.id.Pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter(ProposeDayPoemDisplay.this,List);
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

