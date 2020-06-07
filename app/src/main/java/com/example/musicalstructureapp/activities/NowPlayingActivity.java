package com.example.musicalstructureapp.activities;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.example.musicalstructureapp.R;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.musicalstructureapp.data.Tracks;
import com.example.musicalstructureapp.adapter.TrackAdapter;
import android.widget.AdapterView.OnItemClickListener;



public class NowPlayingActivity extends AppCompatActivity {
    final ArrayAdapter trackAdapter = new TrackAdapter(this, track); //Puts the values into the TrackAdapter class
    ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(trackAdapter); //Displays the data in the TrackAdapter
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()

    {
        @Override
        public void onItemClick (AdapterView < ? > parent, View view,int position, long id){
        Tracks song = track.get(position);
        Intent tracksIntent = new Intent(TrackListActivity.this, NowPlayingActivity.class);
        tracksIntent.putExtra("songName", song.getArtist_name());
        tracksIntent.putExtra("artistName", song.getTrack_title());
        startActivity(tracksIntent);
    }
    }
}
