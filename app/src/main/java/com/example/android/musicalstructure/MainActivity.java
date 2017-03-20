package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Finding the songs button
        View songs = findViewById(R.id.songsView);

        //To change the activity to Songs View
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent(MainActivity.this, Songs.class);
                startActivity(songsIntent);
            }
        });

        //Finding the artists button
        View artists = findViewById(R.id.artistsView);

        //To change the activity to Artists View
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsIntent = new Intent(MainActivity.this, Artists.class);
                startActivity(artistsIntent);
            }
        });


        //Finding the albums button
        View albums = findViewById(R.id.albumsView);

        //To change the activity to Artists View
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(MainActivity.this, Albums.class);
                startActivity(albumsIntent);
            }
        });

        //Finding the NowPlaying Button
        View nowPlaying = findViewById(R.id.nowPlayingView);

        //To change the activity to NowPlaying View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });
    }
}
