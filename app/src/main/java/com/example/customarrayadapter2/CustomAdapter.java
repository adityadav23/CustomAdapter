package com.example.customarrayadapter2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Song> {
        /*
          Declaring global variables  to access constructor parameters
         */
    private final Context context;
    private final ArrayList<Song> song;

  public  CustomAdapter(Context context , ArrayList<Song> song){

      //Here super method has been pre defined the row Layout so we never need to pass it
     super(context,R.layout.song_layout,song);
      this.context = context;
      this.song = song;

  }

        /*
          Overriding getView function
          Creating  a inflater

         */
    @NonNull
    @Override
    public View getView(int position, @Nullable View rowView, @NonNull ViewGroup parent) {

      if(rowView== null) {
          rowView = LayoutInflater.from(context).inflate(R.layout.song_layout, parent, false);
      }
          TextView tvSongName = rowView.findViewById(R.id.songName);
          TextView tvSongArtist = rowView.findViewById(R.id.songArtist);

          tvSongName.setText(song.get(position).getmSongName());
          tvSongArtist.setText(song.get(position).getmSinger());

          return rowView;

      }


}
