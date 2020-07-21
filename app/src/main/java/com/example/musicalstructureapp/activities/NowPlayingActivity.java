package com.example.musicalstructureapp.activities;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.example.musicalstructureapp.R;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.musicalstructureapp.data.Tracks;
import com.example.musicalstructureapp.adapter.TrackAdapter;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;



public class NowPlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing_item);
        TextView songName = findViewById(R.id.songName);
        TextView artistName = findViewById(R.id.artistName);
        ImageView albumImage = findViewById(R.id.albumImage1);

        Intent intentThatStartedThisActivity = getIntent();

        if (intentThatStartedThisActivity != null) {
            String receiveSongTitle = intentThatStartedThisActivity.getStringExtra("Title");
            String receiveArtistName = intentThatStartedThisActivity.getStringExtra("Artist");
            if (intentThatStartedThisActivity.hasExtra("AlbumImage")) {
                int imageId = intentThatStartedThisActivity.getIntExtra("AlbumImage", R.id.nowPlayingImage);
                albumImage.setImageResource(imageId);
            }
            songName.setText(receiveSongTitle);
            artistName.setText(receiveArtistName);
        }

    }

}