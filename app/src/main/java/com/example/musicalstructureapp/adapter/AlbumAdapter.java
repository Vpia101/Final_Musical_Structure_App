package com.example.musicalstructureapp.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.GridView;



import com.example.musicalstructureapp.R;
import com.example.musicalstructureapp.data.Album;

import java.util.ArrayList;



public class AlbumAdapter extends ArrayAdapter {

    public AlbumAdapter(Context context, ArrayList albums) {
        super(context,0, albums);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View albumListView = convertView;

        if(albumListView == null) {
            albumListView = LayoutInflater.from(getContext()).inflate(
                    R.layout.albums_list_item, parent, false);
        }

        Album my_album= (Album) getItem(position);
        TextView TitleTextView = (TextView) albumListView.findViewById(R.id.albumTitle1);
        TitleTextView.setText(my_album.getAlbum_name());
        TextView ArtistTextView = (TextView) albumListView.findViewById(R.id.albumArtise1);
        ArtistTextView.setText(my_album.getAlbumArtist_name());
        ImageView iconView = (ImageView) albumListView.findViewById(R.id.albumImage1);
        iconView.setImageResource(my_album.getAlbumImageResourceID());

        return albumListView;
    }
}

