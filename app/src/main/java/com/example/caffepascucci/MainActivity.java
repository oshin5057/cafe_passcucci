package com.example.caffepascucci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ScrollView scroll;
    ImageView image;
    TextView about; TextView description;
    TextView contact; TextView email; TextView phone;
    TextView address; TextView art;
    TextView descriptionSec; TextView thirdTV; TextView cappuccino; TextView pascuccio; TextView yogurt; TextView hot; TextView filter; TextView infusi;
    TextView hour; TextView time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scroll=(ScrollView) findViewById(R.id.scroll_view);
        image=(ImageView) findViewById(R.id.caffe);
        about=(TextView)findViewById(R.id.about);
        description=(TextView)findViewById(R.id.description);
        contact=(TextView)findViewById(R.id.contact);
        email=(TextView)findViewById(R.id.email);
        phone=(TextView)findViewById(R.id.phone);
        address=(TextView)findViewById(R.id.address);
        art=(TextView)findViewById(R.id.art_caffe);
        descriptionSec=(TextView)findViewById(R.id.description_sec);
        thirdTV=(TextView)findViewById(R.id.third_text_view);
        cappuccino=(TextView)findViewById(R.id.cappuccino);
        pascuccio=(TextView)findViewById(R.id.passpuccio);
        yogurt=(TextView)findViewById(R.id.yogurt);
        hot=(TextView)findViewById(R.id.hot);
        filter=(TextView)findViewById(R.id.filter);
        infusi=(TextView)findViewById(R.id.infusi);
        hour=(TextView)findViewById(R.id.hours_of_operation);
        time=(TextView)findViewById(R.id.time_new);

        image.setImageDrawable(getResources().getDrawable(R.drawable.caffe));
        about.setText("ABOUT");
        description.setText("Caffe Pascucci is the best place to hang out and conversation with friends. Visit our Caffe and enjoy hot coffees, cold coffees, snacks and more. Caffe Pascucci to the youth is a “hangout” spot where they meet people, make conversations, and have a whole lot of fun over steaming cups of great coffee. Caffe Pascucci is also best for family to spend time.");
        contact.setText("CONTACT");
        email.setText("Email : caffepascucci@xyz.com");
        phone.setText("Phone No.  : 12345 67890");
        address.setText("ADDRESS");
        art.setText("Caffe Pascucci, Opp. New Market");
        descriptionSec.setText("DESCRIPTION");
        thirdTV.setText("We serve verity of high quality of Coffee");
        cappuccino.setText("Cappuccino");
        pascuccio.setText("Paspuccio");
        yogurt.setText("Yogurt Cappuccino");
        hot.setText("Hot Chocolate");
        filter.setText("Filter Coffee");
        infusi.setText("Infusi Tea");
        hour.setText("HOURS OF OPERATION");
    }
}
