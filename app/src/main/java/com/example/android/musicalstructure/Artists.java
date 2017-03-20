package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        //Finding the Home Button
        View homeButton = findViewById(R.id.homeButton);

        //Change Activity to the Home activity that is
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeButtonIntent = new Intent(Artists.this, MainActivity.class);
                startActivity(homeButtonIntent);
            }
        });


        //Finding the NowPlaying Button
        View nowPlaying = findViewById(R.id.nowPlayingView);

        //Change Activity to Now Playing Activity
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(Artists.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });
    }
}
