package com.example.musicalstructureapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.musicalstructureapp.R;
import android.widget.Button;


public class NowPlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing_item);
        TextView songName = (TextView) findViewById(R.id.songName);
        TextView artistName = (TextView) findViewById(R.id.artistName);
        ImageView albumImage = (ImageView) findViewById(R.id.albumImage1);

        Intent intentThatStartedThisActivity = getIntent();

        //Receives the data that was passed through the intent
        if (intentThatStartedThisActivity != null) {
            if (intentThatStartedThisActivity.hasExtra("Title")) {
                String receiveSongTitle = intentThatStartedThisActivity.getStringExtra("Title");
                String receiveArtistName = intentThatStartedThisActivity.getStringExtra("Artist");
                int receiveAlbumImageArt = intentThatStartedThisActivity.getIntExtra("AlbumImage", R.id.nowPlayingImage);

                songName.setText(receiveSongTitle);
                artistName.setText(receiveArtistName);
                albumImage.setImageResource(receiveAlbumImageArt);
            }
        }
    }
}


