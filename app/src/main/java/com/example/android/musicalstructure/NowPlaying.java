package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowplaying);

        //Finding the Home Button
        View homeButton = findViewById(R.id.homeButton);

        //Change Activity to the Home activity that is
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButtonIntent = new Intent(NowPlaying.this, MainActivity.class);
                startActivity(homeButtonIntent);
            }
        });
    }
}
