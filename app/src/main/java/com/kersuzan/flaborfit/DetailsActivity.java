package com.kersuzan.flaborfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    DetailType currentType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView exerciseTitle = (TextView) findViewById(R.id.activity_detail_exerciseTitle);
        ImageView exerciseImage = (ImageView) findViewById(R.id.activity_detail_exerciseImage);
    }
}
