package com.geniusnine.android.valentinesspecial.TeddyDay;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.geniusnine.android.valentinesspecial.ChocolateDay.ChocolatePoemsDisplay;
import com.geniusnine.android.valentinesspecial.ChocolateDay.ViewPagerAdapter;
import com.geniusnine.android.valentinesspecial.R;

public class TeddyPoemsDisplay extends AppCompatActivity {


        ViewPager viewPager;
        PagerAdapter adapter;
        String[] brainpuz;
        @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_teddy_poems_display);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            brainpuz = new String[]{"My Furry Friend teddy bear\n" +
                    "\n" +
                    "Each night I go to bed to sleep\n" +
                    "and in my bed a friend I keep.\n" +
                    "He has fluffy fur and big blue eyes\n" +
                    "this friend I know won't tell no lies.\n" +
                    "\n" +
                    "\n" +
                    "In the morning when I wake\n" +
                    "this friend's nice cuddle I do take.\n" +
                    "I kiss him goodbye and give him a hug\n" +
                    "and tuck him in so he will be snug.\n" +
                    "\n" +
                    "\n" +
                    "I tell him I will be home quite soon\n" +
                    "then we will cuddle again under the moon.\n" +
                    "I walk out of the room and wave goodbye\n" +
                    "I know he understands I know he will not cry. ",

                    "A Gift For You my teddy bear\n" +
                            "\n" +
                            "Friends and family can not always be near,\n" +
                            "that's why I'm sending this teddy bear.\n" +
                            "Hold him, love him and hug him tight,\n" +
                            "And he will be there day and night.\n" +
                            "He can not replace the love you hold dear,\n" +
                            "But he's a reminder that their love's always there.\n" +
                            "There is one thing more that he likes to do,\n" +
                            "That's to remind you, that God loves you too.",

                    "By Gifting u This Teddy\n" +
                            "\n" +
                            "By Gifting u This Teddy…\n" +
                            "I Wana Show you I’m Ready that..\n" +
                            "To Make u Mine And Fill My Life..\n" +
                            "With Sunshine…\n" +
                            "-(‘)…(‘)\n" +
                            "( ‘ o ‘ )\n" +
                            "-(‘)–(‘)\n" +
                            "(”’)–(”’)\n" +
                            "-i-Love-u-\n" +
                            "Happy Teddy Bear day\n" +
                            "\n" +
                            "If u are a chocolate you are the SWEETEST,\n" +
                            "If u are a teddy bear you are the most HUGGABLE,\n" +
                            "nd since u r my friend.U R THE BEST.\n",

                    "Teddy Bear Day\n" +
                            "\n" +
                            "It’s Teddy Bear Day,and I’m thinking\n" +
                            "of someone cute and huggable who is you.\n" +
                            "Happy Teddy Bear Day. A sweet Teddy Bear,\n" +
                            "To My sweet mate, On A sweet events,\n" +
                            "Just To Say, Happy Teddy Bear Day\n" +
                            "\n" +
                            "(“-^-/”)\n" +
                            "`o__o’ ]\n" +
                            "(_Y_) _/\n" +
                            "_..`–‘-.`,\n" +
                            "(__)_,–(__)\n" +
                            "7:   ; 1\n" +
                            "_/,`-.-‘ :\n" +
                            "(_,)-~~(_,)",

                    " Love is a Divine Feeling\n" +
                            "\n" +
                            "Love is a divine feeling\n" +
                            "But when u lost love u r lost\n" +
                            "Love is the strongest intangible thing\n" +
                            "A weapon that makes u strong and\n" +
                            "Can hurt more than a bullet..\n" +
                            "Happy Teddy Day 2017",

                    "A Bear Hug \n" +
                            "\n" +
                            "\n" +
                            "A bear hug for you, \n" +
                            "and I would make you \n" +
                            "forget your sorrows!\n" +
                            "\n" +
                            "I'll be there with you \n" +
                            "forever, in all your \n" +
                            "today and tomorrows!!\n" +
                            "\n" +
                            "The day I am not there, \n" +
                            "this teddy would be with\n" +
                            " you; so just be fine, \n" +
                            "you are always mine!!!\n" +
                            "\n" +
                            "My life is yours forever..\n" +
                            " O girl, O girl, \n" +
                            "O you be my.. Valentine",


                    " My Teddy Bear\n" +
                            "\n" +
                            "Submitted By: Kahtain\n" +
                            "I have a little teddy bear \n" +
                            "Who's always there for me, \n" +
                            "When I need someone to talk to \n" +
                            "He listens quietly. \n" +
                            "\n" +
                            "He doesn't get mad or yell \n" +
                            "Or ever put me down, \n" +
                            "He never gets jealous or envious \n" +
                            "And never has a frown. \n" +
                            "\n" +
                            "When I need a hug he's there \n" +
                            "Waiting with open paws, \n" +
                            "His eye is broken, his arm is ripped \n" +
                            "But I don't mind his flaws. \n" +
                            "\n" +
                            "I love my little teddy bear \n" +
                            "With his cute little face, \n" +
                            "And if we were more like \n" +
                            "Teddy bears the world \n" +
                            "Would be a better place.",
                    "Teddy Bear Love\n" +
                            "\n" +
                            "\n" +
                            "Come Hug me, Hold me, \n" +
                            "and Squeeze me tight! ! \n" +
                            "And Ill be your teddy bear \n" +
                            "who will treat you rightly.\n" +
                            "For unlike other bears\n" +
                            "who are mean and rough, \n" +
                            "Im be soft in your arms\n" +
                            "and so gentle to your touch.\n" +
                            "And although I might seem\n" +
                            "'Well, just a little shabby! \n" +
                            "And my hair is all bent over, \n" +
                            "Im a good bear to hand onto\n" +
                            "as I can love you like no other.\n" +
                            "And if want to feed the bear\n" +
                            "with your cookin and kindly love\n" +
                            "my stuffings are sawn up tightly\n" +
                            "as I am filled with warmth and love.",

                    "The Fire Of Love \n" +
                            "\n" +
                            "Yes its true, \n" +
                            "the fire is bright. \n" +
                            "As Its burns right through, \n" +
                            "the day and the night.\n" +
                            "\n" +
                            "Like a wild fire that dances and sings, \n" +
                            "as spreads across the forest\n" +
                            "with a whispering of the winds.\n" +
                            "\n" +
                            "For Its our love of the fire\n" +
                            "that ignitions from within. \n" +
                            "As our two worlds become one, \n" +
                            "as we reach towards heaven.\n" +
                            "\n" +
                            "For there is nothing to quench\n" +
                            "there longing to burn \n" +
                            "which feels like the fire \n" +
                            "of love we have always yearned?",

                    "Secret Lover\n" +
                            "\n" +
                            "Come into my heart dear one,\n" +
                            "Fill it with the warmth of your love,\n" +
                            "Brighten my days with your sunny smile,\n" +
                            "And fill my nights with unbridled passion.\n" +
                            "Lay with me under the starry skies,\n" +
                            "Whispering into my ear,\n" +
                            "Those sweet words of love,\n" +
                            "That only we two understand,\n" +
                            "Gently caress my trembling body,\n" +
                            "With deliberate, knowing hands,\n" +
                            "And cover my mouth with passionate kisses,\n" +
                            "That draw the very soul from my body.\n" +
                            "I live to be near you,\n" +
                            "To feel your gentleness.\n" +
                            "My world begins and ends in your arms.\n" +
                            "You give me such unbelievable joy and bliss.\n" +
                            "My heart, my wonderful, but secret lover.",

                    " My Teddy Bear Getting Old\n" +
                            "\n" +
                            "My teddy bear was getting old\n" +
                            "I showed him to my dad.\n" +
                            "The threads that made his mouth were gone.\n" +
                            "My teddy looked so sad.\n" +
                            "\n" +
                            "His round dark eyes were crooked\n" +
                            "His button nose hung down.\n" +
                            "It made me cry to look at him,\n" +
                            "My teddy, soft and brown.\n" +
                            "\n" +
                            "teddy bearA jagged hole showed stuffing\n" +
                            "Poking through a long one side.\n" +
                            "And I hugged him oh, so gently,\n" +
                            "So it wouldn't get more wide.\n" +
                            "\n" +
                            "When daddy showed my mommy,\n" +
                            "She fixed him up like new.\n" +
                            "His button nose was tight now,\n" +
                            "His mouth was smiling, too.\n" +
                            "\n" +
                            "His eyes were side by side again\n" +
                            "Just like they used to be.\n" +
                            "And when I sat and talked to him,\n" +
                            "He could look right back at me.\n" +
                            "\n" +
                            "She pushed the stuffing in again\n" +
                            "Then sewed the hole with thread.\n" +
                            "And when I went to sleep last night,\n" +
                            "He was with me in my bed.\n" +
                            "\n" +
                            "You know that someone loves you\n" +
                            "By the little things they do.\n" +
                            "At times like this, it means much more\n" +
                            "Than saying, 'I love you.'",


                    " Bear Hugs\n" +
                            "\n" +
                            "If you like I can give you\n" +
                            "A big bear hug.\n" +
                            "\n" +
                            "It will make you feel snug\n" +
                            "As a bug in a rug.\n" +
                            "\n" +
                            "As soon as a bear hug\n" +
                            "Comes your way,\n" +
                            "\n" +
                            "Find yourself a good friend,\n" +
                            "And give It Away!\n" +
                            "\n" ,

                    "Big Bear Hugs\n" +
                            "\n" +
                            "If you like I can give you\n" +
                            "A big bear hug.\n" +
                            "\n" +
                            "It will make you feel snug\n" +
                            "As a bug in a rug.\n" +
                            "\n" +
                            "As soon as a bear hug\n" +
                            "Comes your way,\n" +
                            "\n" +
                            "Find yourself a good friend,\n" +
                            "And give It Away!",


                    "Just a teddy bear\n" +
                            "\n" +
                            "\n" +
                            "Just a teddy bear...\n" +
                            "He changed his mind, \n" +
                            "The guy is just too indecisive... \n" +
                            "\n" +
                            "He no longer cares for the hugs and kisses you have to offer, \n" +
                            "No, none of that is necessary. \n" +
                            "\n" +
                            "He just wants a teddy bear, \n" +
                            "He just wants something or maybe someone to hold onto through the night, \n" +
                            "So that he doesn't feel lonely\n" +
                            "When his eyes don't close shut. \n" +
                            "\n" +
                            "He wants a teddy because their smiles are never fake, \n" +
                            "And they don't fade... \n" +
                            "If they do he'll just sew one on. \n" +
                            "\n" +
                            "He wants a teddy, \n" +
                            "Because he's really weird :\n" +
                            "He hates feeling lonely... \n" +
                            "Sometimes all he requires is to hold someone's finger to fall asleep... \n" +
                            "\n" +
                            "He just wants a teddy, \n" +
                            "I hope he's not asking for too much.",

                    "Teddy Bears\n" +
                            "\n" +
                            "\n" +
                            "I have noticed\n" +
                            "That the strongest people\n" +
                            "Have teddy bears\n" +
                            "To comfort them at night\n" +
                            "Or to be a never-ending friend\n" +
                            "They are the one thing\n" +
                            "That has seen\n" +
                            "The strongest person cry\n" +
                            "Although they may look tough\n" +
                            "Everyone needs a shoulder to cry on\n" +
                            "So the little worn-out animal \n" +
                            "Sitting peacefully on the bed\n" +
                            "Is the keeper of secrets \n" +
                            "And the giver of comfort\n" +
                            "But also just a simple yet wonderful\n" +
                            "Teddy bear"
            };
// Locate the ViewPager in viewpager_main.xml
            viewPager = (ViewPager) findViewById(R.id.pagerTeddy);
            // Pass results to ViewPagerAdapter Class
            adapter = new ViewPagerAdapter(TeddyPoemsDisplay.this,brainpuz);
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

