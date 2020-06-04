package com.example.musicalstructureapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;

import com.example.musicalstructureapp.R;
import com.example.musicalstructureapp.data.Tracks;

import java.util.ArrayList;

public class TrackAdapter extends ArrayAdapter {

    public TrackAdapter(Context context, ArrayList tracks) {
        super(context,0, tracks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Tracks my_track= (Tracks) getItem(position);
        TextView TitleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        TitleTextView.setText(my_track.getTrack_title());
        TextView ArtistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        ArtistTextView.setText(my_track.getArtist_name());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(my_track.getImageResourceID());

        return listItemView;

    }
}