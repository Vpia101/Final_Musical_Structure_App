package com.example.musicalstructureapp.activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.musicalstructureapp.R;
import com.example.musicalstructureapp.adapter.AlbumAdapter;
import com.example.musicalstructureapp.data.Album;
import com.example.musicalstructureapp.data.Tracks;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums_activity);

        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(new Album("Backstreet Boys", "Backstreet Boys", R.drawable.album_cover_backstreetboys));
        albums.add(new Album("Baby one more time", "Britney Spears", R.drawable.album_cover_britneyspears));
        albums.add(new Album("Ricky Martin", "Ricky Martin", R.drawable.album_cover_rickymartin));


        AlbumAdapter albumAdapter = new AlbumAdapter(this, albums); //Puts the values into the AlbumAdapter class
        GridView gridView = (GridView) findViewById(R.id.albumGridview);
        gridView.setAdapter(albumAdapter); //Displays the data in the AlbumAdapter

    }
}

