package com.example.ongor1.recylerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView name , description , rating;
    private Bundle extras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        extras = getIntent().getExtras();

        name = (TextView) findViewById(R.id.dNameID);
        description = (TextView) findViewById(R.id.dDescriptionID);
        rating = (TextView)findViewById(R.id.dRatingID);

        if(extras !=null)
            name.setText(extras.getString("name"));
            description.setText(extras.getString("description"));
            rating.setText(extras.getString("rating"));
    }
}
