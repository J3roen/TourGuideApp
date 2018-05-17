package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.zip.Inflater;

public class DetailActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView title;
    private TextView location;
    private TextView tel;
    private TextView description;
    private ListItem item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_detail);
        /** find necessary views*/
        imageView = findViewById(R.id.listItemDetail_img);
        title = findViewById(R.id.listItemDetail_title);
        location = findViewById(R.id.listItemDetail_location);
        tel = findViewById(R.id.listItemDetail_tel);
        description = findViewById(R.id.listItemDetail_description);
        /**load listItem object, passed as intent extra*/
        Intent intent = getIntent();
        item = (ListItem) intent.getExtras().get("object");
        /** fill in views with data*/
        imageView.setImageDrawable(getResources().getDrawable(item.getImgId()));
        title.setText(item.getName());
        location.setText(item.getLocation());
        tel.setText(item.getTel());
        description.setText(item.getDescription());

        HashMap<String, String> hoursArrayList = item.getOpeningHours();
        //fill in openingshours monday to sunday
        String hours = hoursArrayList.get("Monday");
        TextView textView = findViewById(R.id.mondayHours);
        textView.setText(hours);

        hours = hoursArrayList.get("Tuesday");
        textView = findViewById(R.id.tuesdayHours);
        textView.setText(hours);

        hours = hoursArrayList.get("Wednesday");
        textView = findViewById(R.id.wednesdayHours);
        textView.setText(hours);

        hours = hoursArrayList.get("Thursday");
        textView = findViewById(R.id.thursdayHours);
        textView.setText(hours);

        hours = hoursArrayList.get("Friday");
        textView = findViewById(R.id.fridayHours);
        textView.setText(hours);

        hours = hoursArrayList.get("Saturday");
        textView = findViewById(R.id.saturdayHours);
        textView.setText(hours);

        hours = hoursArrayList.get("Sunday");
        textView = findViewById(R.id.sundayHours);
        textView.setText(hours);

    }
}
