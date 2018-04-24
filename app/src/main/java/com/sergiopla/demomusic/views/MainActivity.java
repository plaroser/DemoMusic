package com.sergiopla.demomusic.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.sergiopla.demomusic.R;
import com.sergiopla.demomusic.adapters.AdapterSong;
import com.sergiopla.demomusic.models.Song;
import com.sergiopla.demomusic.tasks.ChargeSongListTask;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //   ____                _              _
    //  / ___|___  _ __  ___| |_ __ _ _ __ | |_ ___
    // | |   / _ \| '_ \/ __| __/ _` | '_ \| __/ __|
    // | |__| (_) | | | \__ \ || (_| | | | | |_\__ \
    //  \____\___/|_| |_|___/\__\__,_|_| |_|\__|___/
    //
    public static final String STRING_URL = "https://rss.itunes.apple.com/api/v1/es/itunes-music/top-songs/all/100/non-explicit.json";
    public static final String KEY_LIST = "list";
    public static final String KEY_TITTLE = "tittle";

    //  _____ _      _     _
    // |  ___(_) ___| | __| |___
    // | |_  | |/ _ \ |/ _` / __|
    // |  _| | |  __/ | (_| \__ \
    // |_|   |_|\___|_|\__,_|___/
    //

    private Button buttonGetWeb;
    private TextView textViewTitulo;
    private ListView listViewSongs;
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //  ___       _ _   _       _ _          _   _
        // |_ _|_ __ (_) |_(_) __ _| (_)______ _| |_(_) ___  _ __
        //  | || '_ \| | __| |/ _` | | |_  / _` | __| |/ _ \| '_ \
        //  | || | | | | |_| | (_| | | |/ / (_| | |_| | (_) | | | |
        // |___|_| |_|_|\__|_|\__,_|_|_/___\__,_|\__|_|\___/|_| |_|
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_main);
        buttonGetWeb = findViewById(R.id.buttonGetWeb);
        textViewTitulo = findViewById(R.id.textViewTittle);
        listViewSongs = findViewById(R.id.listViewSongs);


        buttonGetWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ChargeSongListTask(context, listViewSongs, textViewTitulo).execute();
            }
        });

        listViewSongs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, PlayerActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ArrayList<Song> list = new ArrayList<>();
        ListAdapter listAdapter = listViewSongs.getAdapter();
        if (listAdapter != null) {
            for (int i = 0; i < listAdapter.getCount(); i++) {
                list.add((Song) listAdapter.getItem(i));
            }
            outState.putParcelableArrayList(KEY_LIST, list);
            outState.putString(KEY_TITTLE, textViewTitulo.getText().toString());
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        ArrayList<Song> list = savedInstanceState.getParcelableArrayList(KEY_LIST);
        if (list != null) {
            AdapterSong songArrayAdapter = new AdapterSong(context, R.layout.song_item, list);
            listViewSongs.setAdapter(songArrayAdapter);
        }
        textViewTitulo.setText(savedInstanceState.getString(KEY_TITTLE, "Playlist"));
    }
}
