package com.example.musicalstructureapp.activities;

import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import android.os.Bundle;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.musicalstructureapp.R;
import com.example.musicalstructureapp.adapter.TrackAdapter;
import com.example.musicalstructureapp.data.Tracks;

import java.util.ArrayList;

public class TrackListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tracks_list_item);

        final ArrayList<Tracks> track = new ArrayList<Tracks>();
        track.add(new Tracks("Quit playing games with my heart", "Backstreet Boys", R.drawable.cover_quitplaying));
        track.add(new Tracks("Baby one more time", "Britney Spears", R.drawable.cover_babyonemoretime));
        track.add(new Tracks("Livin La Vida Loca", "Ricky Martin", R.drawable.cover_livinlavida));
        track.add(new Tracks("Doo Woop", "Lauren Hill", R.drawable.cover_doowoop));
        track.add(new Tracks("Barbie Girl", "Aqua", R.drawable.cover_barbiegirl));
        track.add(new Tracks("Waterfalls", "TLC", R.drawable.cover_waterfalls));
        track.add(new Tracks("I will always love you", "Whitney Houston", R.drawable.cover_alwaysloveyou));

        final TrackAdapter trackAdapter = new TrackAdapter(this, track); //Puts the values into the TrackAdapter class

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(trackAdapter); //Displays the data in the TrackAdapter
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Tracks item = track.get(i);
                Intent tracksIntent = new Intent(TrackListActivity.this, NowPlayingActivity.class);
                tracksIntent.putExtra("Artist", item.getArtist_name());
                tracksIntent.putExtra("Title", item.getTrack_title());
                startActivity(tracksIntent);
            }
        });

    }

}