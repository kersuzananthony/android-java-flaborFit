package com.kersuzan.flaborfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_DETAIL_ITEM_TITLE = "extra.item.title";
    public static final String EXTRA_DETAIL_ITEM_IMAGE = "extra.item.image";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Register relative layout
        RelativeLayout weightButton = (RelativeLayout) findViewById(R.id.weightButton);
        RelativeLayout yogaButton = (RelativeLayout) findViewById(R.id.yogaButton);
        RelativeLayout cardioButton = (RelativeLayout) findViewById(R.id.cardioButton);

        // Set onClickListener for each button
        weightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(DetailType.Weight);
            }
        });

        yogaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(DetailType.Yoga);
            }
        });

        cardioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(DetailType.Cardio);
            }
        });
    }

    private void loadDetailActivity(DetailType detailType) {
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);

        String title = "";
        switch (detailType) {
            case Weight:
                title = "Weight";
                break;
            case Cardio:
                title = "Cardio";
                break;
            case Yoga:
                title = "Yoga";
                break;
        }

        intent.putExtra(MainActivity.EXTRA_DETAIL_ITEM_TITLE, title);

        startActivity(intent);
    }
}
