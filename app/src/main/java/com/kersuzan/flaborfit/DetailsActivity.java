package com.kersuzan.flaborfit;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    DetailType currentType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Link item into controller
        TextView exerciseTitle = (TextView) findViewById(R.id.activity_detail_exerciseTitle);
        ImageView exerciseImage = (ImageView) findViewById(R.id.activity_detail_exerciseImage);
        LinearLayout mainBackground = (LinearLayout) findViewById(R.id.mainBackground);

        // Get data from intent
        DetailType exerciseType = (DetailType) getIntent().getSerializableExtra(MainActivity.EXTRA_DETAIL_ITEM_TYPE);

        // Replace value into item
        exerciseTitle.setText(exerciseType.getTitle());

        switch (exerciseType) {
            case Weight:
                exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
                mainBackground.setBackgroundColor(Color.parseColor("#2ca5f5"));
                break;
            case Yoga:
                exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));
                mainBackground.setBackgroundColor(Color.parseColor("#916bcd"));
                break;
            case Cardio:
                exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));
                mainBackground.setBackgroundColor(Color.parseColor("#52ad56"));
                break;
            }
    }
}
