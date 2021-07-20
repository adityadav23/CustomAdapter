package com.example.customarrayadapter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
        Making connection between ListView layout file and layout object of listview where we will display our list
         */
        listView = findViewById(R.id.myListView);
        CustomAdapter adapter = new CustomAdapter(this,getSongList());
        listView.setAdapter(adapter);

    }
        /*
          Creating a function to return an arraylist to the adapter as parameter of
           return type ArrayList<Song>
         */
    private ArrayList<Song> getSongList(){
        ArrayList<Song> song = new ArrayList<>();

        song.add(new Song("MAi hu na1", "Sonu Nigam1"));
        song.add(new Song("MAi hu na", "Sonu Nigam2"));

        song.add(new Song("MAi hu na", "Sonu Nigam3"));

        song.add(new Song("MAi hu na", "Sonu Nigam4"));

        song.add(new Song("MAi hu na", "Sonu Nigam5"));

        song.add(new Song("MAi hu na", "Sonu Nigam6"));

        song.add(new Song("MAi hu na", "Sonu Nigam7"));

        song.add(new Song("MAi hu na", "Sonu Nigam8"));

        song.add(new Song("MAi hu na", "Sonu Nigam9"));

        song.add(new Song("MAi hu na", "Sonu Nigam10"));

        return song;

    }
}